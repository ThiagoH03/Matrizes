public class Tabuada {
    public static void main(String[] args){
        int tabuada [] [] = new int [11][11];
        for (int numero = 1; numero <= 10; numero++){
            for(int i = 1; i <= 10; i++){
                int multi = numero*i;
                tabuada[numero][i] = multi;
                System.out.print(numero + " x " + i + " = "+ tabuada[numero][i] + " | ");
        }
        System.out.println("");
    }

}
}