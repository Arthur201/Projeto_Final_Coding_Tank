import java.util.*;

public class media2 {
    public static void main(String[] args) {

        int qtdNumeros;
        double mediaAritmetica = 0.0, mediaHarmonica = 0.0, soma = 0.0, somaHarmonica = 0.0, printMedia = 0.0;
        String QualMedia;
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        try {
            System.out.println("Digite a quantidade de números que você deseja calcular:");
            qtdNumeros = scan.nextInt();
            double[] numeros = new double[qtdNumeros];
            System.out.println("Digite agora cada número que entrará no cáculo desejado:");
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = scan.nextDouble();
            }
            System.out.println("Qual das duas médias você deseja calcular? \n Digite: \n ARITMETICA para calcular a média aritmética \n HARMONICA para calcular a média harmônica");
            QualMedia = scan2.nextLine();

            if (QualMedia.equals("ARITMETICA")) {
                for (int i = 0; i < numeros.length; i++) {
                    soma = +numeros[i];
                }
                mediaAritmetica = soma / numeros.length;
                printMedia = mediaAritmetica;
            } else if (QualMedia.equals("HARMONICA")) {
                transformaArray(numeros);
                for (int i = 0; i < numeros.length; i++) {
                    somaArray(transformaArray(numeros));
                    printMedia = numeros.length / soma;
                }
                mediaHarmonica = qtdNumeros / somaArray(transformaArray(numeros));
                printMedia = mediaHarmonica;
            }

            System.out.println("Os números digitados foram: " + (Arrays.toString(numeros)));
            System.out.println("A média escolhida foi " + QualMedia);
            System.out.println("E o valor correspondente à média escolhida é " + printMedia);

        }catch (InputMismatchException e){
            System.out.println("O número que você digitou ou a operação escolhida é inválida. Tente novamente");
        }
    }
    public static double[] transformaArray(double[] array){
        double[] novoArray = new double[(array.length)];
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = Math.pow(array[i], -1.0);
        }
        return novoArray;

    }
    public static double somaArray(double[] array){
        double soma = 0.0;
        double[] novoArray = new double[(array.length)];
        for (int i = 0; i < array.length; i++) {
            soma += novoArray[i];
        }
        return soma;
    }

}