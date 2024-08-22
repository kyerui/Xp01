package Exercicios.Exe08

import Exercicios.Exe08.produto.Produto

class Exercicio08 {
    fun exe08(){
        //    Exercício 8: Sistema de Gestão de Estoque com Reposição Automática (15 XP)
        //    Contexto: Mariana é gerente de um armazém e deseja implementar um sistema para
        //    gerenciar o estoque de produtos. Ela quer que o sistema verifique se a quantidade de um
        //    produto está abaixo do nível mínimo e, se estiver, acione uma reposição automática.
        //    Instruções: Crie uma classe Produto com propriedades nome, quantidade, nivelMinimo,
        //    e reporEstoque(). Em seguida, escreva um programa que permita cadastrar 5 produtos e
        //    verificar a quantidade disponível. Se a quantidade de um produto estiver abaixo do nível
        //    mínimo, a função reporEstoque() deve ser chamada para repor o estoque (aumentando a
        //    quantidade para o nível máximo).

        val produtos = mutableListOf<Produto>()
        for(i in (0..4)){
            print("Nome do produto: ")
            val nome = readln()
            print("Quantidade: ")
            val quant = readln().toInt()
            print("Nível mínimo: ")
            val nivelMin = readln().toInt()
            print("Quantidade Máxima: ")
            val quantMax = readln().toInt()
            produtos.add(Produto(nome, quant, nivelMin, quantMax))
        }

        // Verificar e repor estoque dos produtos
        for (produto in produtos) {
            println(produto)
            produto.reporEstoque()
            println(produto)
            println()
        }
    }
}