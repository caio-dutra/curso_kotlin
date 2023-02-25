package funcoes

fun converteAnos(ano: Int) {
    println("$ano ano(s) equivalem a: ")
    println("\n${ano * 12} meses")
    println("${ano * 365} dias")
    println("${ano * 8760} horas")
    println("${ano * 525600} minutos")
    println("${ano * 31536000} segundos")
}