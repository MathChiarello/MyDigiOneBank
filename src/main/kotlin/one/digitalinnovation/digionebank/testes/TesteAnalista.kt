package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val joao = Analista("Joao Pedro" , "123456789" , 1000.0)

    imprimeRelatorio(joao)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
