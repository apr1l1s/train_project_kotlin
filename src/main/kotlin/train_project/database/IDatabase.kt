package train_project.database

interface IDatabase<T> {
    fun add(item:T): Boolean
    fun del(id:Int): Boolean
    fun replace(id:Int,item:T): Boolean
    fun search(vararg predicates: (T)->Boolean):List<T>

    val data:List<T>
}