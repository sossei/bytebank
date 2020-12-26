package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException


fun testaNullable() {
    var enderecoNullo: Endereco? = Endereco(logradouro = "Teste", complemento = "teste")
    val logradouro: String? = enderecoNullo?.logradouro
    enderecoNullo?.let {
        println(it.logradouro)
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento nullo")
        println(tamanhoComplemento)
    }
    teste("")
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}


