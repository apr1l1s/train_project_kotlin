package train_project.train

interface ITrain {
    var id:Int
    var station:String
    var number: String
    var countOfWagons: Number
    var types: TrainTypes
}