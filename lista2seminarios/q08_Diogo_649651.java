// Questão: 08 Nota final
// Nome completo do aluno: Diogo Oliveira Neiss
// Número de matrícula: 649651
// Turno: manhã
// Nome do professor: Alexei Machado
//

import java.util.Scanner;

public class q08_Diogo_649651 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numObjetos = input.nextInt();

        // criar arranjo de referencias
        AlunosQuestao08[] conjunto = new AlunosQuestao08[numObjetos];

        // criar objetos
        for (int i = 0; i < numObjetos; i++) {
            conjunto[i] = new AlunosQuestao08();
        }

        // setar os nomes de cada um
        for (int i = 0; i < numObjetos; i++) {
            conjunto[i].setNome(input.next());
        }

        // inserir as 4 notas em cada objeto
        for (int i = 0; i < numObjetos; i++) {
            conjunto[i].setNota1(input.nextInt());
            conjunto[i].setNota2(input.nextInt());
            conjunto[i].setNota3(input.nextInt());
            conjunto[i].setNota4(input.nextInt());
        }

        // printar o nome e nota final de cada objeto
        for (int i = 0; i < numObjetos; i++) {
            System.out.printf("%s %d\n", conjunto[i].getNome(), conjunto[i].getNotaFinal());
        }

    }
}

class AlunosQuestao08 {


    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public int getNotaFinal() {
        return getNota1() + getNota2() + getNota3() + getNota4();
    }

    AlunosQuestao08(){
        setNota1(0);
        setNota2(0);
        setNota3(0);
        setNota4(0);
    }


}
