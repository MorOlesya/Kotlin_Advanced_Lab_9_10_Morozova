package resources
import kotlin.properties.Delegates

data class OutpostResource(
    val id: Int,
    val name: String,
    var amountInit: Int
) {
    var amount: Int by Delegates.observable(amountInit) { _, old, new, ->
        println("Ресурс [$name] изминился: $old -> $new")
    }

    override fun toString(): String {
        return "Ваш ресурс: $id | Имя: $name | Количество: $amountInit"
    }
}


