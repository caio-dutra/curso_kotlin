package estrutura_sequencial

fun main() {

    var nome: String
    var txtSemValor: String

    val calcado: Byte = 42
    val pib: Long = 1869000000000
    val popBrasil: Int = 211000000

    val perCapita= (pib / popBrasil)

    println("Valor do PIB per capita: $perCapita")
    //Ou println("R$ ${pib/popBrasil}")

}