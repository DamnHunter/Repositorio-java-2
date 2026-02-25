import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double mediaAvaliacao = 0;
        int razao = 0;

       while(nota != -1){
           System.out.println("Informe sua nota para o filme");
           nota = leitura.nextDouble();
           if (nota != -1){
               mediaAvaliacao += nota;
               razao++;
           }


       }
        int estrelas;
        mediaAvaliacao = mediaAvaliacao / razao;
        estrelas = (int) mediaAvaliacao / 2;
        System.out.println("Você deu " + estrelas + " estrelas para este filme.");
    }
}