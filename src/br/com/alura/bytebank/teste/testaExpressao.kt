package br.com.alura.bytebank.teste

import java.lang.NumberFormatException


fun testaExpressao() {
    val entrada: String = "1,9"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }
    val valorComTaxa: Double? = if (valorRecebido != null) valorRecebido + 0.1 else null
    if (valorComTaxa != null)
        println(valorComTaxa)
    else
        println("Valor inválido")
}
