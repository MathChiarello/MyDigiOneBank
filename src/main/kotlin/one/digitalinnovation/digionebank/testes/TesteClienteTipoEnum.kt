package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} = ${elemento.descricao}" )
    }

    ClienteTipo.values().forEach {
        println("${it.name} = ${it.descricao}" )
    }

    val pf = ClienteTipo.pf
    val pfDescricao = ClienteTipo.pf.descricao

    println(pf)
    println(pfDescricao)
}