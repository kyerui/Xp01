package Exercicios.Exe07
import  Exercicios.Exe07.voo.Voo
class Exercicio07 {
    fun exe07(){
//        Exercício 7: Sistema de Reserva de Passagens Aéreas (15 XP)
//        Contexto: Lucas está desenvolvendo um sistema de reservas para uma companhia
//        aérea. Ele deseja criar um programa que permita aos usuários verificar a disponibilidade
//                de assentos e reservar uma passagem.
//        Instruções: Implemente uma classe Voo com propriedades numeroDoVoo,
//        assentosDisponiveis (um array de inteiros), e reservarAssento(assento: Int): Boolean.
//        Escreva um programa que permita ao usuário verificar a disponibilidade de um assento
//        específico em um voo e reservar o assento se ele estiver disponível.

        val voo = Voo((0..1000).random(), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
        while (true) {
            print("O avião tem um total de 9 acentos, digite qual acento deseja verificar: ")
            val assentoParaVerificar = readln().toInt()
            if (voo.verificarAssento(assentoParaVerificar)) {
                println("Assento $assentoParaVerificar disponível. Deseja reservar? (S/N)")
                val reservarAssento = readln()
                if (reservarAssento == "N"){
                    print("Deseja ver outro acento? (S/N)")
                    val checarOutroAcento = readln()
                    if (checarOutroAcento == "N"){
                        break
                    }
                    continue
                }
                if (voo.reservarAssento(assentoParaVerificar)) {
                    println("Reserva bem-sucedida para o assento $assentoParaVerificar!")
                } else {
                    println("Falha na reserva do assento $assentoParaVerificar.")
                }
            } else {
                println("Assento $assentoParaVerificar não disponível.")
            }
            println("Deseja ver outro acento? (S/N)")
            val checarOutroAcento = readln()
            if (checarOutroAcento == "N"){
                break
            }
        }

    }
}