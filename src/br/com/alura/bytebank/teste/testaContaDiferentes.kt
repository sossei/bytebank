package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContaDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1234,
            endereco = Endereco(
                logradouro = "Rua vergueiro"
            )
        ),
        numero = 1000
    )
    println("titular: ${contaCorrente.titular.nome}")
    println("Endereço: ${contaCorrente.titular.endereco.logradouro}")
    val contaPoupanca = ContaPoupanca(
        Cliente(
            nome = "Fran",
            cpf = "222.222.222-22",
            senha = 12
        ),
        1001,
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente após deposito ${contaCorrente.saldo}")
    println("saldo poupança após deposito ${contaPoupanca.saldo}")
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente após saque ${contaCorrente.saldo}")
    println("saldo poupança após saque ${contaPoupanca.saldo}")
    try {
        contaCorrente.transfere(100.0, contaPoupanca,1234)
    }catch (e: SaldoInsuficienteException){
        e.printStackTrace()
        println(e.message)
    }catch (e: FalhaAutenticacaoException){
        e.printStackTrace()
        println(e.message)
    }
    println("saldo corrente após corrente -> poupança ${contaCorrente.saldo}")
    println("saldo poupança após corrente -> poupança ${contaPoupanca.saldo}")
    try {
        contaPoupanca.transfere(100.0, contaCorrente,1234)
    }catch (e: Exception){
        e.printStackTrace()
        println(e.message)
    }
    println("saldo corrente após poupança -> corrente  ${contaCorrente.saldo}")
    println("saldo poupança após poupança -> corrente ${contaPoupanca.saldo}")
}