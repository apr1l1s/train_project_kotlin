package train_project.console_helper

interface IPrintable<T> {
    fun printItem(item:T, function:(T)->Unit = {println(it)}):Unit
    fun printString(s:String,function: (String) -> Unit = {println(it)}):Unit
}