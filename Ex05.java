import java.util.Scanner;

public class Ex05 {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        int qtdCristais = SC.nextInt();
        int qtdConsultas = SC.nextInt();
        int cont = 0;
        while (qtdCristais != 0 && qtdConsultas != 0) {
            cont++;
            int identificadores[] = new int[qtdCristais];
            for (int i = 0; i < identificadores.length; i++) {
                identificadores[i] = SC.nextInt();
            }
            System.out.println("CASE#" + cont + ":");
            for (int i = 0; i < qtdConsultas; i++) {
                int numConsultado = SC.nextInt();
                insertionSort(identificadores);
                int indiceNum = buscaBin(identificadores, 0, identificadores.length/2, identificadores.length, numConsultado);
                if (indiceNum != -1) {
                    System.out.println(numConsultado + " found at " + indiceNum);
                } else {
                    System.out.println(numConsultado + " not found");
                }
            }
        }
    }

    public static int buscaBin(int[] vet, int ini, int meio, int fim, int numBuscado) {
        if (ini == meio) {
            if (numBuscado == vet[ini]) {
                return ini+1;
            }
            return -1;
        }
        if (numBuscado == vet[meio]) {
            return meio+1;            
        } else if (numBuscado < vet[meio]) {
            return buscaBin(vet, ini, (meio+ini)/2, meio, numBuscado);
        } else {
            return buscaBin(vet, meio, (fim+meio)/2, fim, numBuscado);
        }
    }

    public static void insertionSort(int[] vet) {
        for (int i = 1; i < vet.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (vet[j] < vet[j - 1]) {
                    swap(vet, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int[] vet, int n, int m) {
        int varAux = vet[n];
        vet[n] = vet[m];
        vet[m] = varAux;
    }
}
