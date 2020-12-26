package br.com.alura.bytebank.teste
fun testeValidacoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo positivo!")
        saldo == 0.0 -> println("Saldo neutro!")
        else -> println("Saldo negativo!")
    }
}