package resources

object SystemLogger {
    init {
        println("SystemLogger инициализирован")
    }

    fun log(message: String) {
        println("[LOG] $message")
    }
}

val logger by lazy { SystemLogger }

fun main() {
//    val gas = OutpostResource(1, "Gas",100)
//    val mineral = OutpostResource(2, "Minerals",250)
//    println("Успех! Вы добыли дополнительное количество минералов: ${mineral.amountInit + 50}")
//    val bonusMineral = mineral.copy(id = 3, name = "Mineral Bonus", amountInit = mineral.amountInit + 50)
//    println(gas.toString())
//    println(mineral.toString())
//    println(bonusMineral.toString())
//
//    logger.log("Запуск базы")

    val manager = ResourceManager()
    val loadedResource = FileStorage.load()
    if (loadedResource.isEmpty()) {
        manager.add(OutpostResource(1, "Minerals", 300))
        manager.add(OutpostResource(2, "Gas", 100))
    }
    FileStorage.Save(manager.getAll())
}