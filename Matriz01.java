import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Matriz01{
    public static void main(String[] args){
        int idades[];
        idades = new int[6];
        int min,max;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor mínimo:");
        min = input.nextInt();
        System.out.println("Digite o valor máximo:");
        max = input.nextInt();

        
        for(int i=0; i< 6; i++){
            idades[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
        
        System.out.println("\nNúmeros Gerados:");
        for(int i=0; i < idades.length;i++){
            System.out.print("[" + idades[i] + "]");
        
        }
        System.out.println("");
        input.close();
    }
}