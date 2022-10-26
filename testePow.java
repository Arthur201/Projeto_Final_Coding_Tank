import java.util.Arrays;

public class testePow {
    public static void main(String[] args) {
        double[] teste = new double[4];
        double[] transformacao = new double[4];
        teste[0] = 1;
        teste[1] = 2;
        teste[2] = 4;
        teste[3] = 3;

        for (int i = 0; i < teste.length; i++) {
            transformacao[i] = Math.pow(teste[i], -1.0);
        }
        System.out.println(Arrays.toString(transformacao));

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

