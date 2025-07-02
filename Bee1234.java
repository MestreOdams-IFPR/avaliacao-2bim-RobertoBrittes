import java.util.Scanner;

public class Bee1234 {
    final static Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        String sentenca = SC.nextLine();
        char[] sentencaChar = sentenca.toCharArray();
        String stringAux;
        boolean ultimaLetraMaiuscula = false;
        for (int i = 0; i < sentencaChar.length; i++) {
            if (sentencaChar[i] == ' ') {
                
            } else {
                if (ultimaLetraMaiuscula) {
                    stringAux = sentencaChar.toString();
                    stringAux.toLowerCase();
                    sentencaChar[i] = stringAux.charAt(i);
                    ultimaLetraMaiuscula = false;
                } else {
                    stringAux = sentencaChar.toString();
                    sentencaChar[i] = stringAux.charAt(i);
                    ultimaLetraMaiuscula = true;
                }
            }
        }
        sentenca = sentencaChar.toString();
        System.out.println(sentenca);
    }
}
