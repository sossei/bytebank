package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco("Av. Humberto Martignoni", 545, "Vila Cantizani", estado = "SP", cidade = "Piraju",
        cep = "18803-105", complemento = "AEP")
    val end2 = Endereco("Av. Humberto Mart2ignoni", 545, "Vila Cantizani", estado = "SP", cidade = "Piraju",
        cep = "18803-105", complemento = "AEP")
    println(endereco)
    println(end2 == endereco)
}