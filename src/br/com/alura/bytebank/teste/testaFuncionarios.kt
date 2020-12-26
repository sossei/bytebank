package br.com.alura.bytebank.teste
import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("boneificação ${alex.bonificacao}")
    println()
    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("boneificação ${fran.bonificacao}")
    if (fran.autentica(1234)) {
        println("Usuário autenticado")
    } else {
        println("Usuário não autenticado")
    }
    println()
    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 1234,
        plr = 200.0
    )
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("boneificação ${gui.bonificacao}")
    if (gui.autentica(1234)) {
        println("Usuário autenticado")
    } else {
        println("Usuário não autenticado")
    }
    println("plr ${gui.plr}")

    val maria = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )
    println("nome ${maria.nome}")
    println("cpf ${maria.cpf}")
    println("salario ${maria.salario}")
    println("boneificação ${maria.bonificacao}")
    println()

    val calculador = CalculadoraBonificacao()
    calculador.registra(alex)
    calculador.registra(fran)
    calculador.registra(gui)
    calculador.registra(maria)

    println()
    println("total de bonificacao: ${calculador.total}")
}