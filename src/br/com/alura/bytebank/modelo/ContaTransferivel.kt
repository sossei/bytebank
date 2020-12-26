package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int,
) : Conta(
    titular = titular,
    numero = numero
), Tranferivel {

    override fun transfere(valor: Double, destino: Conta,senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException("Não foi possível transferir, devido ao saldo insuficiente. Saldo atual $saldo, valor a ser subtraído $valor")
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.deposita(valor)
    }
}