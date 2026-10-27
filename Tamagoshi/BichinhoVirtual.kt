class BichinhoVirtual(val nome: String) {

    var nivelDeFome = 50
    var nivelFelicidade = 50
    var cansaco = 0
    var idade = 0

    fun alimentar() {
        nivelDeFome -= 10
        println("$nome foi alimentado. O nível de fome diminuiu.")
    }

    fun brincar() {
        nivelFelicidade += 10
        cansaco += 10
        println("$nome está brincando e se sentindo mais feliz.")
    }

    fun descansar() {
        cansaco = (cansaco - 50).coerceAtLeast(0)
        println("$nome descansou. O cansaço diminuiu.")
    }

    fun verificarStatus() {
        println("Status atual de $nome:")
        println("Nível de fome: $nivelDeFome")
        println("Nível de felicidade: $nivelFelicidade")
        println("Cansaço: $cansaco")
        println("Idade: $idade")
    }

    fun passarTempo() {
        nivelDeFome += 3
        nivelFelicidade -= 3
        cansaco += 10
        idade += 1
    }
}
