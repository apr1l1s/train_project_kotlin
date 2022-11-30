package train_project.train


data class Train(
    override var id: Int,
    override var station: String,
    override var number: String,
    override var countOfWagons: Number,
    override var types: TrainTypes
):ITrain{
    override fun toString():String{
        return "$id: $station $number $countOfWagons $types"
    }
    companion object{
        fun toTrain(s:String):Train{
            val stringOfTrain = s.split(' ')
            return Train(
                id = 0,
                station = stringOfTrain[0],
                number = stringOfTrain[1],
                countOfWagons = stringOfTrain[2].toInt(),
                types = TrainTypes.parseTrainTypes(stringOfTrain[3])
            )
        }
    }
}