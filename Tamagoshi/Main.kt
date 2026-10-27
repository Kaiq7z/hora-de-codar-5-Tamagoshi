fun main() {

    println("Bem-vindo ao Simulador de Animal de Estimação Virtual!")
    println("Digite o nome do seu animal de estimação:")
    val nomePet = readln()
    val pet = BichinhoVirtual(nomePet)

    while (true) {
        println("\nEscolha uma ação:")
        println("1. Alimentar $nomePet")
        println("2. Brincar com $nomePet")
        println("3. Verificar o status de $nomePet")
        println("4. Sair")
        println("5. Descansar $nomePet")

        val escolha = readln().toInt()

        when (escolha) {
            1 -> pet.alimentar()
            2 -> pet.brincar()
            3 -> pet.verificarStatus()
            4 -> {
                println("Saindo do Simulador de Animal de Estimação Virtual. Adeus!")
                return
            }
            5 -> pet.descansar()
            else -> println("Escolha inválida. Tente novamente.")
        }

        pet.passarTempo() // Simula o tempo que passa após cada ação

        if (pet.nivelDeFome >= 100 || pet.cansaco >= 100 || pet.nivelFelicidade <= 0) {
            pet.verificarStatus()
            println("Você perdeu! A fome ou o cansaço chegou a 100, ou a felicidade chegou a 0.")
            return
        }

        if (pet.idade >= 50) {
            pet.verificarStatus()
            println("Parabéns! $nomePet chegou à idade 50. Você venceu!")
            return
        }
    }
}
