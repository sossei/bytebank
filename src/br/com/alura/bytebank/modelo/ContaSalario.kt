package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

class ContaSalario(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo < valor)
            throw SaldoInsuficienteException("Não foi possível sacar, devido ao saldo insuficiente. Saldo atual $saldo, valor a ser subtraído $valor")
        this.saldo = valor
    }
}