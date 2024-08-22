import Exercicios.Exe01.Exercicio01
import Exercicios.Exe02.Exercicio02
import Exercicios.Exe03.Exercicio03
import Exercicios.Exe04.Exercicio04
import Exercicios.Exe05.Exercicio05
import Exercicios.Exe06.Exercicio06
import Exercicios.Exe07.Exercicio07
import Exercicios.Exe08.Exercicio08

fun main() {
    val exe1 = Exercicio01()
    val exe2 = Exercicio02()
    val exe3 = Exercicio03()
    val exe4 = Exercicio04()
    val exe5 = Exercicio05()
    val exe6 = Exercicio06()
    val exe7 = Exercicio07()
    val exe8 = Exercicio08()

    while (true){
        print("Digite qual das 8 questões deseja ver: ")
        var questao = readln().toInt()
        when(questao){
            1 -> exe1.exe01()
            2 -> exe2.exe02()
            3 -> exe3.exe03()
            4 -> exe4.exe04()
            5 -> exe5.exe05()
            6 -> exe6.exe06()
            7 -> exe7.exe07()
            8 -> exe8.exe08()
            else -> {
                println("Exercicio não existe!")}
        }
        print("\nDeseja continuar? (S/N)")
        var resp = readln()
        if(resp == "N"){
            break
        }
    }
}