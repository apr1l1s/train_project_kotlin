package train_project.console

import train_project.errors.ErrorTypes

interface IPrintable<T> {
    fun printError(e:ErrorTypes)
    fun printItem(item:T)
    fun printNotify(s:String)
}