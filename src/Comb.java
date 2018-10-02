import java.util.Arrays;

class Comb {
    public static void main(String[] arg) {
        int mas[] = {6, 12, 56, 8, 32, 123, 4, 45, 29, 96, -5, 15, 23, 4200, 108};
        int fakt = mas.length;
        while (fakt > 1) {
            fakt = (int) (fakt / 1.25);
            for (int i = 0; i + fakt < mas.length; i++) {
                if (mas[i] > mas[i + fakt]) {
                    int temp = mas[i];
                    mas[i] = mas[i + fakt];
                    mas[i + fakt] = temp;
                }
            }
        }

        String result = Arrays.toString(mas);
        System.out.println(result);
    }
}
