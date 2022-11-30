package train_project.app

import train_project.console.ConsolePrinter
import train_project.console.ConsoleReader
import train_project.database.Database
import train_project.errors.ErrorTypes
import train_project.train.Train
import train_project.validation.Validation

class App {
    companion object{
        private val database = Database()
        private val printer = ConsolePrinter()
        private val reader = ConsoleReader()
        private fun del() {
            del@ while (true) {
                printer.printNotify("Введите айди удаляемого элемента")
                val deletedIndex = reader.readString()?.toInt()
                if (deletedIndex != null) {
                    database.del(deletedIndex.toInt())
                    printer.printNotify("Успешно!")
                    break@del
                } else {
                    printer.printError(ErrorTypes.INCORRECT_INDEX)
                }
            }

        }
        private fun add() {
            add@ while (true) {
                val addedTrain = reader.readString()
                if (addedTrain != null) {
                    if (addedTrain.isNotEmpty()) {
                        if (Validation.isTrain(addedTrain)) {
                            database.add(Train.toTrain(addedTrain))
                            printer.printNotify("Успешно!")
                            break@add
                        } else printer.printError(ErrorTypes.INCORRECT_FORMAT)
                    } else printer.printError(ErrorTypes.IS_EMPTY)
                } else printer.printError(ErrorTypes.IS_EMPTY)
            }
        }
        private fun edit(){
            edit@while(true) {
                printer.printNotify("Введите индекс заменяемого элемента")
                val id = reader.readString()?.toInt()
                if (id != null && database.data.any{it.id==id}) {
                    printer.printNotify("Введите новый элемент")
                    val s = reader.readString()
                    if (!s.isNullOrEmpty()) {
                        if (Validation.isTrain(s)) {
                            if (database.replace(id, Train.toTrain(s))) {
                                printer.printNotify("Успешно!")
                                break@edit
                            } else printer.printError(ErrorTypes.INCORRECT_INDEX)
                        } else printer.printError(ErrorTypes.IS_EMPTY)
                    } else printer.printError(ErrorTypes.IS_EMPTY)}
            }
        }
        private fun search(){
            search@while(true){
                printer.printNotify("Поиск по какому столбцу?")
                val columnSearchedBy = reader.readString()
                if(columnSearchedBy != null){
                    if (Validation.isColumn(columnSearchedBy)){
                        printer.printNotify("Поиск:")
                        val rowSearchedBy = reader.readString()
                        if (rowSearchedBy != null){
                            database.search({
                                when(columnSearchedBy){
                                    "Вокзал"->it.station.contains(rowSearchedBy)
                                    "Номер"->it.number.contains(rowSearchedBy)
                                    else->true
                                }
                            }).forEach { printer.printItem(it) }
                            break@search
                        } else printer.printError(ErrorTypes.IS_EMPTY)
                    } else printer.printError(ErrorTypes.IS_EMPTY)
                }else printer.printError(ErrorTypes.IS_EMPTY)
            }
        }
        private fun show(){
            show@while(true){
                printer.printNotify("Сортировку по какому столбцу?")
                val columnSortedBy = reader.readString()
                if(columnSortedBy != null){
                    if (Validation.isColumn(columnSortedBy)){
                        val list = database.search({true}).sortedBy{
                            when(columnSortedBy){
                                "Вокзал"->it.station
                                "Номер"->it.number
                                else->it.station
                            }
                        }
                        if (list.isNotEmpty()) list.forEach { printer.printItem(it)}
                        else printer.printError(ErrorTypes.IS_BLANK)
                        break@show
                    } else printer.printError(ErrorTypes.INCORRECT_FORMAT)
                }else printer.printError(ErrorTypes.IS_EMPTY)
            }

        }
        private fun exit(){
            printer.printNotify("Завершение работы...")
        }
        fun start(){
            start@while(true){
                val command = reader.readString()
                if (command.isNullOrEmpty()){
                    printer.printError(ErrorTypes.IS_EMPTY)
                }else{
                    when(command){
                        "Просмотр"->show()
                        "Поиск"->search()
                        "Добавление"->add()
                        "Редактирование"->edit()
                        "Удаление"->del()
                        "Выход"->{
                            exit()
                            break@start
                        }
                        else->{
                            printer.printNotify("Неизвестная команда")
                        }
                    }
                }
            }
        }
    }
}
