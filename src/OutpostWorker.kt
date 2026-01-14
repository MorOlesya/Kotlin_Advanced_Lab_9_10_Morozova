class OutpostWorker(val name: String) {
    var energy: Int = 100
        set(value){
            field = value.coerceIn(0,100)
        }
}