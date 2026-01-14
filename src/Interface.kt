interface  Movable{
    fun move()
    fun stop(){
        println("останавливаемся...")
    }
}
class Car : Movable {
    override fun move() {
        println("Едем на машине")
    }
}
class Aircraft : Movable {
    override fun move() {
        println("Летим на самолёте")
    }

    override fun stop() = println("Приземляемся...")
}

fun travel(obj: Movable) = obj.move()

interface Worker{
    fun work()
}

interface Student{
    fun study()
}

class WorkingStudent(val name: String) : Worker, Student {
    override fun study() = println("$name учится")
    override fun work() = println("$name работает")
}

fun main() {
    var car = Car()
    var aircraft = Aircraft()
//    car.move()
//    aircraft.move()
    travel(car)
    travel(aircraft)

    val pavel = WorkingStudent("Pavel")
    pavel.work()
    pavel.study()

    aircraft.move()
    aircraft.stop()
}