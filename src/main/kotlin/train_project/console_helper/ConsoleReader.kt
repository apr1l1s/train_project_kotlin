package train_project.console_helper

import train_project.train.Train
import train_project.train.TrainTypes
class ConsoleReader:IReadable<Train>{
    override fun readItem(template: Regex): Train? {
             val parsedString = readLine()?.trim()
             return if (parsedString.isNullOrEmpty() || template.matches(parsedString)){
                 null
             }else{
                 val stringOfTrain = parsedString.split(' ')
                 Train(
                     station = stringOfTrain[0],
                     number = stringOfTrain[1],
                     countOfWagons = stringOfTrain[2].toInt(),
                     types = TrainTypes.parseTrainTypes(stringOfTrain[3])
                 )
             }
         }
         override fun readString(regex: Regex): String?{
             val readiedString = readLine()?.trim()
             return if (readiedString != null && regex.matches(readiedString))
                 readiedString else null
         }
         override fun readSwitch(switcher: (String) -> Int): Int {
             val readiedString = readLine()?.trim()
             return if (readiedString!= null) switcher(readiedString) else 0
         }

 }