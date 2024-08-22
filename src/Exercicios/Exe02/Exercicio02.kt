package Exercicios.Exe02

class Exercicio02 {

    fun exe02(){
//      Exercício 2: Contagem de Palavras em um Texto (5 XP)
//      Contexto: Ana é uma escritora que deseja contar quantas palavras há em um parágrafo
//      do seu livro. Ela precisa de uma ferramenta simples que faça essa contagem
//      automaticamente.
//      Instruções: Escreva um programa que leia um parágrafo de texto e conte o número de
//      palavras nele. Exiba a contagem total de palavras.
        val paragrafo:String = readlnOrNull() ?:""
        val numeroDePalavras = paragrafo.split(Regex("\\s+")).count()
        return
    }
}