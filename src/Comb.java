import java.util.Arrays;

class Comb {
    public static void main(String[] arg) {
        int mas[] = {62, 37, 65, -9, -88, -36, 91, 30, -52, -18, -21, 66, -6, -13, 96, -76, -9, -27, -63, 77, -51, 45,
                49, -67, 75, 1, 65, -18, 31, 60, 41, -27, 67, 26, -40, 44, 79, -26, 90, 99, -100, -10, 60, 97, 77, -23,
                43, 36, -42, -67};
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
