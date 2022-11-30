package train_project.console_helper

import train_project.train.Train

class ConsolePrinter: IPrintable<Train> {
    override fun printItem(item: Train, function: (Train) -> Unit):Unit = function(item)
    override fun printString(s: String, function: (String) -> Unit):Unit = function(s)
}