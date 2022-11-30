package train_project.database
import train_project.train.Train

class Database:IDatabase<Train>{
    //Данные
    private var _maxId = 0
    private val _data = mutableListOf<Train>()
    override val data: List<Train>
        get() = _data.toList()
    //Функции работы с бд
    //Добавление
    override fun add(item: Train): Boolean = _data.add(item)
        .also{
            item.id=_maxId
            _maxId++
        }
    //Удаление
    override fun del(id: Int): Boolean = _data.removeIf{it.id==id}

    //Замена
    override fun replace(id: Int, item: Train): Boolean =
        if (_data.find{it.id==id}!=null) {
            _data[_data.indexOf(_data.find{it.id==id})] = item
            true
        }  else false

    //Поиск с фильторм
    override fun search(vararg predicates: (Train) -> Boolean): List<Train> =
        _data.filter{i-> (predicates.all{it(i)})}
}