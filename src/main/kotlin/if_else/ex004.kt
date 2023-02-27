package if_else

fun lobby () {

    print("Informe sua idade: ")
    val age = readln().toInt()
    if (age < 18) {
        println("\nNegado. Menores de idade não são permitidos.")
        return
    }
    print("Informe seu tipo de convite: ")
    val invite = readln().uppercase().trim()
    if (invite != "COMUM" && invite != "PREMIUM" && invite != "LUXO") {
        println("\nNegado. Tipo de Convite inválido!")
        return
    }
    print("Informe o código do convite: ")
    val code = readln().uppercase().trim()
    if (!code.startsWith("XL") && !code.startsWith("XT")) {
        println("\nNegado. Código de Convite inválido!")
        return
    }
    else {
        println("\nWelcome:).")
        println("Tipo de convite: $invite")
        println("Código do convite: $code")
    }
}