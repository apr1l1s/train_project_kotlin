package train_project.console

import train_project.console.IPrintable
import train_project.errors.ErrorTypes
import train_project.train.Train

class ConsolePrinter: IPrintable<Train> {
    override fun printItem(item: Train):Unit = println(item.toString())
    override fun printError(e: ErrorTypes) {
        when(e){
            ErrorTypes.INCORRECT_INDEX -> println("Вы ввели неверный индекс")
            ErrorTypes.IS_EMPTY -> println("Вы ввели пустую строку")
            ErrorTypes.UNKNOWN_COMMAND -> println("Неизвестная команда")
            ErrorTypes.INCORRECT_FORMAT ->println("Неверный формат строки")
            ErrorTypes.IS_BLANK -> println("Список пустой")
        }
    }
    override fun printNotify(s: String) = println(s)
}