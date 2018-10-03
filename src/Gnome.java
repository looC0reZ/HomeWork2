import java.util.Arrays;

class Gnome {
    public static void main(String[] arg) {
        int mas[] = {-17, -4, 13, 33, 82, 30, 24, 70, -5, 49, 5, -91, -95, -94, 36, -52, 96, -27, 13, -78, -60, -8, 48,
                64, -74, 44, -95, 16, 29, 79, -26, 31, -92, 96, 30, 17, -68, -99, 99, 94, 90, -56, 9, 97, -41, 81, 86,
                -55, 16, -94};
        int i = 1;
        while (i < mas.length) {
            if (mas[i-1] <= mas[i]) {
                i++;
            }
            else {
                int temp = mas[i-1];
                mas[i-1] = mas[i];
                mas[i] = temp;
                if (i > 1) {

                    i--;
                }
            }

        }
        String result = Arrays.toString(mas);
        System.out.println(result);
    }

}
