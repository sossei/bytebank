package br.com.alura.bytebank.modelo

interface Tranferivel {
    fun transfere(valor: Double, destino: Conta, senha: Int)
}