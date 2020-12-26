package br.com.alura.bytebank.teste


fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima)
    println(minhaFuncaoAnonima(20, 10))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.00)
            return salario + 50.00
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1001.00))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda)
    println(minhaFuncaoLambda(15, 10))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.00)
            return@lambda salario + 50.00
        salario + 100.0
    }
    println(calculaBonificacao(1001.00))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses = Soma()
    println(minhaFuncaoClasses)
    println(minhaFuncaoClasses(5, 20))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao:(Int,Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int): Int {
    println("Exceuta teste")
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }


}
