package Exercicios.Exe04

class Exercicio04 {
    fun exe04(){
//        Exercício 4: Ordenação de Nomes de Alunos (10 XP)
//        Contexto: Maria é coordenadora de uma turma e deseja criar uma lista de alunos em
//        ordem alfabética. Ela quer que o programa exiba a lista organizada de maneira intuitiva.
//        Instruções: Escreva um programa que leia os nomes de 10 alunos e os armazene em um
//        array. Em seguida, ordene os nomes em ordem alfabética e exiba a lista organizada.
        var nomes = Array(10){""}
        println("Digite 10 nomes:")
        for(i in nomes.indices){
            print("Informe o ${i+1} nome: ")
            nomes[i] = readln()
        }

        nomes.sort()

        println("\nNomes em ordem alfabética:")
        print(nomes.joinToString())
    }
}