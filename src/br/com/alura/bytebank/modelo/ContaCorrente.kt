package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numero: Int,
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo < valorComTaxa)
            throw SaldoInsuficienteException("Não foi possível sacar, devido ao saldo insuficiente. Saldo atual $saldo, valor a ser subtraído $valorComTaxa")
        this.saldo = valorComTaxa
    }
}