package br.com.alura.bytebank.teste
fun testesLoops() {
    for (i in 5 downTo 1 step 2) {
        val titular = "Roberto $i"
        val numero = 1000 + i
        var saldo = i + 10.0
        println("Titular: $titular")
        println("Número da conta: $numero")
        println("Saldo: $saldo")
        println()
    }
    loop1@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop1
        }
    }
}