package if_else

fun triangle() {

    print("Digite o lado 1:  ")
    val lado1 = readln().toInt()
    print("Digite o lado 2:  ")
    val lado2 = readln().toInt()
    print("Digite o lado 3:  ")
    val lado3 = readln().toInt()

    if (lado1 == lado2 && lado2 == lado3) {
        println("\nOs valores FORMAM um triângulo.")
    }
    else {
        println("\nOs valores NÃO FORMAM um triâgulo.")
    }
}