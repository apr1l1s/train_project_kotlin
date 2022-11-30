package train_project.validation

class Validation {
    companion object{
        fun isTrain(s:String) = trainRegex.matches(s)
        fun isColumn(s:String) = columnRegex.matches(s)
        private val trainRegex = Regex("^[A-zА-я]+\\s[A-zА-я&&\\w&&-]+\\s[\\d]+\\s(\\d+|[A-zА-я]+)$")
        private val columnRegex = Regex("(Вокзал|Номер)")
    }
}