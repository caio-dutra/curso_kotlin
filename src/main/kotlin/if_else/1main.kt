package if_else

fun main() {

    // --- Ex001 e Ex002 **AULA36
    employee("Coordenador", 0)

    //Código altertnativo(Ex001 e Ex002)
    val bonus = bonus("Estagiário", 0)
    if (bonus == 0f) {
        println("\nCargo incorreto.")
    } else {
        println("\nBônus = R$ $bonus")
    }

    // --- Ex003 **AULA36
    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)
    // false

    println(!a && !b && (c && d))
    // true && true && true
    // true

    println(a && ((b || c)|| d))
    // false &&
    // false

    println(a || ((!b && c) || !d))
    // false || (true || false)
    // false || true
    // true


    // --- Ex001 **AULA39
    square()

    // --- Ex002 **AULA29
    triangle()

    // --- Ex003 **AULA39
    whichExit(4)

    // Ex004 **AULA39
    lobby()

}