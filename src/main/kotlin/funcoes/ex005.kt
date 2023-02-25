package funcoes

fun troca(str: String) {
    val valorTrocado = str.replace(oldChar = 'a', newChar =  'x', ignoreCase = true).lowercase()
    // Ou str.lowercase().replace(oldValue: "a", newValue: "x")

    println("Texto trocado = ${valorTrocado.lowercase()}")
}