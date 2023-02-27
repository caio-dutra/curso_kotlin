package if_else

fun square() {

    print("Digite o lado 1:  ")
    val lado1 = readln().toInt()
    print("Digite o lado 2: ")
    val lado2 = readln().toInt()

    if (lado1 == lado2) {
        println("\nOs valores FORMAM um quadrado.")
    } else {
        println("\nOs valores NÃO FORMAM um quadrado.")
    }

}
