package Exercicios.Exe08.produto

class Produto(val nome: String, var quantidade: Int, val nivelMinimo: Int, val quantidadeMaxima: Int) {
    fun reporEstoque() {
        if (quantidade < nivelMinimo) {
            println("Precisa repor o produto $nome.")
            quantidade = quantidadeMaxima
            println("Estoque de $nome foi reabastecido e agora possuí $quantidade unidades.")
        } else {
            println("O estoque de $nome tem quantidade adequada.")
        }
    }

    override fun toString(): String {
        return "Produto = $nome\nQuantidade = $quantidade\nNível Mínimo = $nivelMinimo\nMáximo = $quantidadeMaxima"
    }
}