package operador_for

fun sum() {

    var sum: Int = 0
    for (i in 1..500) {
        sum += i
    }
    println("\nA soma de todos números de 1 a 500 = $sum")
}