package train_project.console_helper
import train_project.database.Database

object ConsoleHelper{
    private val database = Database()
    private val printer = ConsolePrinter()
    private val reader = ConsoleReader()
    private fun del(){
        val deletedIndex = reader.readString(Regex("\\d*"))
        if (deletedIndex != null){
            database.del(deletedIndex.toInt())
            printer.printString("Успешно!")
            start()
        } else {
            printer.printString("Вы ввели неверный индекс")
            del()
        }
    }
    private fun add(){
        val addedTrain = reader.readItem(Regex("^[A-zА-я]+\\s[A-zА-я&&\\w&&-]+\\s[\\d]+\\s(\\d+|[A-zА-я]+)$"))
        if (addedTrain !=null){
            database.add(addedTrain)
            printer.printString("Успешно!")
        }else{
            printer.printString("Ошибка ввода")
            add()
        }
        start()
    }
    private fun edit(){
        //По индексу вводить новую инфу
        printer.printString("Введите индекс заменяемого элемента")
        val editedIndex = reader.readString(Regex("\\d+"))?.toInt()
        if (editedIndex != null){
            //Ввести новый элемент
            printer.printString("Введите новый элемент")
            val addedTrain = reader.readItem(Regex("^[A-zА-я]+\\s[A-zА-я&&\\w&&-]+\\s[\\d]+\\s(\\d+|[A-zА-я]+)$"))
            if (addedTrain == null) {
                printer.printString("Ошибка, пустая строка")
                edit()
            }
            else {
                database.replace(editedIndex, addedTrain)
                printer.printString("Успешно!")
                start()
            }
        } else {
            printer.printString("Вы ввели неверный индекс")
            edit()
        }
    }
    private fun search(){
        //Решить вопрос с индексацией
        printer.printString("Поиск по какому столбцу?")
        val columnSearchedBy = reader.readString(Regex("(Вокзал|Номер)"))
        if(columnSearchedBy == null){
            printer.printString("Вы ввели пустую строку")
            show()
        }else{
            val rowSearchedBy = reader.readString(Regex("\\w+"))
            if (rowSearchedBy != null)
            database.search({
                when(columnSearchedBy){
                    "Вокзал"->it.station.contains(rowSearchedBy)
                    "Номер"->it.number.contains("")
                    else->true
                }
            }).forEachIndexed {
                    index,it ->
                printer.printItem(it){println("$index: $it")}
            }
            start()
        }
    }
    private fun show(){
        printer.printString("Сортировку по какому столбцу?")
        val columnSortedBy = reader.readString(Regex("(Вокзал|Номер)"))
        if(columnSortedBy == null){
            printer.printString("Вы ввели пустую строку")
            show()
        }else{
            database.search({true}).sortedBy{
                when(columnSortedBy){
                    "Вокзал"->it.station
                    "Номер"->it.number
                    else->it.station
                }
            }.forEachIndexed {
                    index,it ->
                printer.printItem(it){println("$index: $it") }
            }
            start()
        }
    }
    private fun exit(){
        printer.printString("Завершение работы...")
    }
    fun start(){
        val command = reader.readString(Regex("\\w+"))
        if (command.isNullOrEmpty()){
            printer.printString("Ошибка ввода:\nВы ввели пустую строку")
            start()
        }else{
            when(command){
                "Просмотр"->show()
                "Поиск"->search()
                "Добавление"->add()
                "Редактирование"->edit()
                "Удаление"->del()
                "Выход"->exit()
                else->{
                    printer.printString("Неизвестная команда")
                    start()
                }
            }
        }
    }
}