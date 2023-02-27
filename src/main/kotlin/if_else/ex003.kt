package if_else

// R: Caso o valor informado seja 4, a saída será "Segunda string" e "Terceira String"

fun whichExit(num: Int) {
    if (num >= 0) {
        if (num == 0) {
            println("Primeira String")
        }
        else {
            println("Segunda String")
        }
    }
    println("Terceira String")
}
