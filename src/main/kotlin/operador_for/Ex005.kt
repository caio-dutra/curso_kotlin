package operador_for

fun customPrinting() {

    print("Digite um número  inteiro: ")
    val n = readln().toInt()

    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun customPrinting2(n: Int) {
    var str = ""
    var contador = 1
    var i = 0
    var j = 0

    while (i < n) {
        i++
        while (j < contador) {
            str += "#"
            j++
        }
        contador++
        str += "\n"
        j = 0
    }

    println(str)
}