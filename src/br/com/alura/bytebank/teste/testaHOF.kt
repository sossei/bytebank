package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno


fun testaHOF() {
    soma(1, 5) {
        println(it)
    }
    somaReceiver(1, 5) {
        println(this)
    }

    val user = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entrar(user, 1234) {
        println("autenticado")
    }
    sistemaInterno.entrarReceiver(user, 1234){
        println("Autenticado por receiver")
        pagamento()
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da soma")
    resultado(a + b)
    println("Depois da soma")
}
fun somaReceiver(a:Int, b:Int, resultado: Int.() -> Unit){
    println("Antes da soma")
    val total = a + b
    total.resultado()
    println("Depois da soma")
}