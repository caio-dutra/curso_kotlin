package operador_while

fun waterTank() {
    val tank = 2000
    val ballon = 7

    var numBallon = 0
    var capacity = 0

    while (capacity + ballon <= tank) {
        numBallon++
        capacity += ballon
    }
    println("Na caixa d'água cabem $numBallon balões.")
}