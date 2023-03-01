package operador_while

fun reverse() {

    print("Escreva uma frase: ")
    val str = readln()

    var length: Int = str.length

    // Caso seja necessário retornar a string invertida
    // var inverso = "";
    while (length > 0) {
        print(str[length - 1])
        // inverso += str[length - 1]
        length--
    }

}