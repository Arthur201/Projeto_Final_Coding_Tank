import java.util.*;

public class media {
    public static void main(String[] args) {

        int qtdNumeros = 0;
        double soma = 0.0, printMedia = 0.0;
        double mediaAritmetica = 0.0;
        double mediaHarmonica = 0.0;
        String QualMedia ="";
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
            perguntaQualOperacao();
            respostaValida(QualMedia);
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
                    printMedia = somaArray(transformaArray(numeros));
                }
                System.out.println(Arrays.toString(transformaArray(numeros)));
                mediaHarmonica = qtdNumeros / somaArray(transformaArray(numeros));
                printMedia = mediaHarmonica;
            }

            System.out.println("Os números digitados foram: " + (Arrays.toString(numeros)));
            System.out.println("A média escolhida foi " + perguntaQualOperacao().concat(QualMedia));
            System.out.println("E o valor correspondente à média escolhida é " + printMedia);

        } catch (InputMismatchException e) {
            System.out.println("O número que você digitou ou a operação escolhida foi considerado inválido. Por favor, tente novamente.");
            main(null);
        }
    }

    public static String perguntaQualOperacao() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Qual das duas médias você deseja calcular? \n Digite: \n ARITMETICA para calcular a média aritmética \n HARMONICA para calcular a média harmônica");
        String QualMedia = scan2.nextLine();
        respostaValida(QualMedia);
        return QualMedia;
    }

    public static double[] transformaArray(double[] array) {
        double[] novoArray = new double[(array.length)];
        for (int i = 0; i < array.length; i++) {
            novoArray[i] = Math.pow(array[i], -1.0);
        }
        return novoArray;

    }

    public static double somaArray(double[] array) {
        double soma = 0.0;
        double[] novoArray = new double[(array.length)];
        for (int i = 0; i < array.length; i++) {
            soma += novoArray[i];
        }
        return soma;
    }

    public static void respostaValida(String resposta) {
        if (!resposta.equals("ARITMETICA") && !resposta.equals("HARMONICA")) {
            System.out.println("Não entendemos qual operação você deseja fazer. Por favor, digite novamente.");
            perguntaQualOperacao();
        }

    }


}
