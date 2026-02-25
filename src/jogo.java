import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        int numeroSorteado = new Random().nextInt(100);
        Scanner tentativaUsuario = new Scanner(System.in);
        int tentativa;
        int tentativasContadas = 0;

        while(tentativasContadas != 5){
            System.out.println("Vamos lá! Chute o numero!");
            tentativa = tentativaUsuario.nextInt();
            if (numeroSorteado > tentativa){
                System.out.println("Quase! O número é maior!");
                tentativasContadas++;
            } else if(numeroSorteado < tentativa){
                System.out.println("Eita! O numero é menor!");
                tentativasContadas++;
            } else {
                System.out.println("Parábens! Você acertou!");
                break;
            }

        }
    }
}
