package Exercicios.Exe07.voo

class Voo(val numeroDoVoo: Int, assentos: IntArray) {

    private val assentosDisponiveis: IntArray = assentos.clone()

    fun reservarAssento(assento: Int): Boolean {
        val i = assentosDisponiveis.indexOf(assento)
        if (i != -1) {
            assentosDisponiveis[i] = -1
            return true
        }
        return false
    }

    fun verificarAssento(assento: Int): Boolean {
        return assentosDisponiveis.contains(assento)
    }
}