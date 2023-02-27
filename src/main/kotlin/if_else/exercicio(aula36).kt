package if_else

//--------------------Ex001 e Ex002--------------------//


fun employee(str: String, xp: Int) {
    if (str.uppercase() == "GERENTE") {
        if (xp < 2) {
            println("Bônus = R$2.000,00")
        } else {
            println("Bônus = R$3.000,00")
        }
    } else if (str.uppercase() == "COORDENADOR") {
        if (xp < 1) {
            println("Bônus = R$1.500,00")
        } else {
            println("Bônus = R$1.800,00")
        }
    } else if (str.uppercase() == "ENGENHEIRO") {
        println("Bônus = R$1.000,00")
    } else if (str.uppercase() == "ESTAGIARIO") {
        println("Bônus = R$500,00")
    }
}

//************Códgido alternativo(Ex001 e Ex002)************//


fun bonus(cargo: String, xp: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        if (xp < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (xp < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}


//-----------------------Ex003-----------------------//

/*
a = False
b = True
c = False
d = True
 */



