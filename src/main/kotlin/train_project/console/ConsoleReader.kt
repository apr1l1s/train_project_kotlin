package train_project.console

import train_project.train.Train

class ConsoleReader: IReadable<Train> {
    override fun readString(): String? {
        return readLine()?.trim()
    }
 }