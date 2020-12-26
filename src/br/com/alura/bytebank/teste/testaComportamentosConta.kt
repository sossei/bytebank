package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaSalario

fun testaComportamentosConta() {
    val conta = ContaCorrente(titular = Cliente(
        nome = "Alex",
        cpf = "111.111.111-11",
        senha = 1234
    ), numero = 1000)
    conta.deposita(100.0)
    conta.deposita(200.0)
    conta.saca(50.0)
    val contaFran = ContaCorrente(Cliente(
        nome = "Fran",
        cpf = "222.222.222-22",
        senha = 12
    ), 1001)
    contaFran.deposita(10.0)
    println("Saldo do ${conta.titular.nome} n.conta ${conta.numero} é ${conta.saldo}")
    println("Saldo do ${contaFran.titular.nome} n.conta ${contaFran.numero} é ${contaFran.saldo}")
    try {
        contaFran.transfere(10.0, conta,1233)
        println("Transferência sucedidade")
    }catch (e: SaldoInsuficienteException){
        e.printStackTrace()
        println("Saldo insuficiente")
    }
    println("Saldo do ${conta.titular.nome} n.conta ${conta.numero} é ${conta.saldo}")
    println("Saldo do ${contaFran.titular.nome} n.conta ${contaFran.numero} é ${contaFran.saldo}")

    val contaSalario = ContaSalario(Cliente(
        nome = "Gui",
        cpf = "333.333.333-333",
        senha = 123
    ), 1002)
    contaSalario.deposita(1000.0)

}