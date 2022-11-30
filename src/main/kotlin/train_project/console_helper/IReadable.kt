package train_project.console_helper

interface IReadable<T> {
    fun readItem(template:Regex):T?
    fun readSwitch(switcher:(String)->Int):Int
    fun readString(regex: Regex):String?
}