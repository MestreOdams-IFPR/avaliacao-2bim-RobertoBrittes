public class ex01 {

    public static void main(String[] args) {
        int vet[] = {0, 34, 77, 7, 5, 7};
        int e = 0;
        int d = 5;
        metodoRec02(vet, e, d);
        for (int i : vet) {
            System.out.println(i);
        }
    }
    public static void metodoRec02(int v[], int e, int d) {
        int t;
        if (e >= d)
            return;
        else {
            t = v[e];
            v[e] = v[d];
            v[d] = t;
            metodoRec02(v, e + 1, d - 1);
        }
    }
}