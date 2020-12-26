package br.com.alura.bytebank.modelo

class SistemaInterno {
    fun entrar(admin: Autenticavel, senha: Int, autenticado :() -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao ByteBank")
            autenticado()
            when (admin) {
                is FuncionarioAdmin -> {
                    println("Opções admin")
                }
                is Funcionario -> {
                    println("Opções comum")
                }
                else -> {
                    println("Opções reduzidas")
                }
            }
        }else{
            println("Falha na autenticação")
        }
    }
    fun entrarReceiver(admin: Autenticavel, senha: Int, autenticado :SistemaInterno.() -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao ByteBank")
            autenticado()
            when (admin) {
                is FuncionarioAdmin -> {
                    println("Opções admin")
                }
                is Funcionario -> {
                    println("Opções comum")
                }
                else -> {
                    println("Opções reduzidas")
                }
            }
        }else{
            println("Falha na autenticação")
        }
    }
    fun pagamento(){
        println("Pagamento realizado!")
    }
}