// Questão: 09 Aprovados
// Nome completo do aluno: Diogo Oliveira Neiss
// Número de matrícula: 649651
// Turno: manhã
// Nome do professor: Alexei Machado
//

import java.util.Scanner;

public class q09_Diogo_649651 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numObjetos = input.nextInt();

        // criar arranjo de referencias

        Alunos[] conjunto = new Alunos[numObjetos];

        // criar objetos com construtor

        for (int i = 0; i < numObjetos; i++) {
            conjunto[i] = new Alunos();
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

        //printar as informacoes de cada objeto
        for (int i = 0; i < numObjetos; i++) {
            System.out.printf("%s ",conjunto[i].getNome());
            conjunto[i].printAprovacao();
            System.out.printf("\n");
        }

        // printar os atributos estáticos da classe
        System.out.printf("%d APROVADOS\n", Alunos.getNumAprovados());
        System.out.printf("%d REPROVADOS\n", Alunos.getNumReprovados());

        //funcao de printar, formatado, o aproveitamento.
        Alunos.printAproveitamentoTurma();
    }


}

class Alunos {


    private String nome;


    private static int numAlunos = 0;
    private static int numAprovados = 0;
    private static int numReprovados = 0;




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

    public static int getNumAlunos() {
        return numAlunos;
    }

    public static void incNumAlunos() {
        Alunos.numAlunos++;
    }

    public static int getNumAprovados() {
        return numAprovados;
    }

    public static void incNumAprovados() {
        Alunos.numAprovados++;
    }

    public static int getNumReprovados() {
        return numReprovados;
    }

    public static void incNumReprovados() {
        Alunos.numReprovados++;
    }

    public static void printAproveitamentoTurma() {
        int aproveitamentoTurma;

        // nao fazer divisao por zero
        if (getNumAlunos() == 0)
            aproveitamentoTurma = 0;

        else {

            double aproveitamento = 100 * ((double) getNumAprovados() / (double) getNumAlunos());

            aproveitamentoTurma = (int) aproveitamento;
        }

        System.out.printf("%d%%\n", aproveitamentoTurma);
    }



    public void printAprovacao(){
        int total = 0;
        total += getNota1() + getNota2() + getNota3() + getNota4();

        if(total >= 60) {
            incNumAprovados();
            System.out.print("APROVADO");
        }

        else{
            incNumReprovados();
            System.out.print("REPROVADO");
        }

    }


    Alunos(){
        numAlunos++;
    }


}

