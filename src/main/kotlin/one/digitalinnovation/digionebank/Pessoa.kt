package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.132-12"

    inner class Endereco {
        var rua:String = "Rua Teste"
    }
}

fun main() {
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)
    println(jether.Endereco().rua)


}
