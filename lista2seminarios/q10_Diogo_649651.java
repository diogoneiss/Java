// Questão: 10 Medias
// Nome completo do aluno: Diogo Oliveira Neiss
// Número de matrícula: 649651
// Turno: manhã
// Nome do professor: Alexei Machado
//


import java.text.DecimalFormat;
import java.util.Scanner;

public class q10_Diogo_649651 {


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

        // inserir as 4 notas em cada objeto e executar os métodos necessários
        for (int i = 0; i < numObjetos; i++) {
            conjunto[i].setTudo(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt());
        }

        // setar todas as medias

         Alunos.setMedia1();
         Alunos.setMedia2();
         Alunos.setMedia3();
         Alunos.setMedia4();


        // ----------- SAIDAS --------------

        // printar as medias de cada codigo



         // convertendo , para .

         DecimalFormat decimalFormat = new DecimalFormat("#.00");

         String media1 = decimalFormat.format(Alunos.getMedia1());
         String media2 = decimalFormat.format(Alunos.getMedia2());
         String media3 = decimalFormat.format(Alunos.getMedia3());
         String media4 = decimalFormat.format(Alunos.getMedia4());

         media1 = media1.replace(',','.');
         media2 = media2.replace(',','.');
         media3 = media3.replace(',','.');
         media4 = media4.replace(',','.');


         System.out.println("PROVA 1 "+ media1);
         System.out.println("PROVA 2 "+media2);
         System.out.println("PROVA 3 "+media3);
         System.out.println("PROVA 4 "+media4);


        //Descobrir o objeto com o maior total de notas

         int maior = 0;

         // se i for maior que o maior, o maior se torna i.
        for (int i = 1; i < numObjetos; i++) {
            if (conjunto[i].getNotaFinal() > conjunto[maior].getNotaFinal())
                maior = i;
        }

        // printar o objeto, com o indice descoberto no passo anterior, na tela

         System.out.printf("%s %d", conjunto[maior].getNome(), conjunto[maior].getNotaFinal());

    }


}

class Alunos{


    private String nome;


    private static int maiorNota = 0;
    private static int numAlunos = 0;


    private static float media1 = 0;
    private static float media2 = 0;
    private static float media3 = 0;
    private static float media4 = 0;


    private static int total1 = 0;
    private static int total2 = 0;
    private static int total3 = 0;
    private static int total4 = 0;

    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    private int notaFinal;

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
        return notaFinal;
    }

    public void setNotaFinal(){
        notaFinal = getNota1() + getNota2() + getNota3() + getNota4();
    }

    public static int getMaiorNota() {
        return maiorNota;
    }

    public static void setMaiorNota(int maiorNota) {
        Alunos.maiorNota = maiorNota;
    }

    public static float getMedia1() {
        return media1;
    }

    public static void setMedia1() {
        Alunos.media1 = ((float) getTotal1()/numAlunos);
    }

    public static float getMedia2() {
        return media2;
    }

    public static void setMedia2() {
        Alunos.media2 = (float) getTotal2()/numAlunos;
    }

    public static float getMedia3() {
        return media3;
    }

    public static void setMedia3() {
        Alunos.media3 =  ((float) getTotal3()/numAlunos);
    }

    public static float getMedia4() {
        return media4;
    }

    public static void setMedia4() {
        Alunos.media4 = (float) getTotal4()/numAlunos;
    }

    public static int getTotal1() {
        return total1;
    }

    public static void setTotal1(int total1) {
        Alunos.total1 += total1;
    }

    public static int getTotal2() {
        return total2;
    }

    public static void setTotal2(int total2) {
        Alunos.total2 += total2;
    }

    public static int getTotal3() {
        return total3;
    }

    public static void setTotal3(int total3) {
        Alunos.total3 += total3;
    }

    public static int getTotal4() {
        return total4;
    }

    public static void setTotal4(int total4) {
        Alunos.total4 += total4;
    }


    public void setTudo(int n1, int n2, int n3, int n4){

        setNota1(n1);
        setNota2(n2);
        setNota3(n3);
        setNota4(n4);

        // jogar as notas do objeto na estática
        setTotal1(n1);
        setTotal2(n2);
        setTotal3(n3);
        setTotal4(n4);

        // somar as 4 provas dos setNotas
        setNotaFinal();

    }


    Alunos(){
        numAlunos++;
    }


}

