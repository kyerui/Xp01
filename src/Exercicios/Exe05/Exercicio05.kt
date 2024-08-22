package Exercicios.Exe05

class Exercicio05 {
    fun exe05(){
//        Exercício 5: Simulação de Jogo de Dados (10 XP)
//        Contexto: Pedro está desenvolvendo um jogo simples de dados para uma feira de
//        ciências. Ele quer simular o lançamento de dois dados e calcular a soma dos valores.
//        Instruções: Crie um programa que simule o lançamento de dois dados (números
//        aleatórios de 1 a 6) e exiba a soma dos valores obtidos. O programa deve permitir que o
//        usuário escolha quantas vezes deseja lançar os dados e exibir as somas de cada lançamento.

        while (true){
            var dado1 = (1..6).random()
            var dado2 = (1..6).random()

            println("Dado 1: $dado1\nDado2: $dado2\nSoma: ${dado1+dado2}")
            print("Deseja continuar? (S/N)")
            var resp = readln()
            if(resp=="N"){
                break
            }
        }
        return
    }
}