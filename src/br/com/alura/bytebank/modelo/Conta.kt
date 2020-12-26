package br.com.alura.bytebank.modelo


abstract class Conta(
    val titular: Cliente,
    val numero: Int,
) :Autenticavel by titular{
    var saldo = 0.0
        protected set
    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    abstract fun saca(valor: Double)


}