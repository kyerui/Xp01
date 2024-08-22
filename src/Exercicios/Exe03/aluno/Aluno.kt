package Exercicios.Exe03.aluno

class Aluno (val nome: String, val notas:DoubleArray){
    fun media(){
        val media = notas.average()
        print("O aluno $nome, tem média de $media e está ")
        if(media >= 7.0){
            print("aprovado!")
            return
        }
        print("Reprovado")
    }
}