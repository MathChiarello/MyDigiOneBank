package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"

    var cpf: String = "123.123.132-12"
        private set

}

fun main() {
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)


}
