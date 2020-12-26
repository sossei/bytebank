package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaObjects() {
    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000
        override fun autentica(senha: Int): Boolean {
            return this.senha == senha
        }
    }
    val sistemaInterno = SistemaInterno();
    sistemaInterno.entrar(fran, 1000)
    println("Anonymous: ${fran.nome}")
    testaContaDiferentes()
    println("Total de contas: ${Conta.total}")
}