import java.util.Scanner;

public class Ex04 {
    final static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        while (SC.hasNext()) {
            int pontuacaoCandidato[] = new int[SC.nextInt()];
            int qtdAprovados = SC.nextInt();
            for (int i = 0; i < pontuacaoCandidato.length; i++) {
                pontuacaoCandidato[i] = SC.nextInt();
            }
            insertionSort(pontuacaoCandidato);
            int notaMin = calcNotaMin(pontuacaoCandidato, qtdAprovados);
            System.out.println(notaMin);
        }
    }

    public static int calcNotaMin(int[] pontuacaoCandidato, int qtdAprovados) {
        int notaMin = pontuacaoCandidato[0];
        for (int i = 1; i < qtdAprovados; i++) {
            notaMin += pontuacaoCandidato[i];
        }
        return notaMin;
    }

    public static void insertionSort(int[] vet) {
        for (int i = 1; i < vet.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (vet[j] > vet[j - 1]) {
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
