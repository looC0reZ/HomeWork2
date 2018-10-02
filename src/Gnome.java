import java.util.Arrays;

class Gnome {
    public static void main(String[] arg) {
        int mas[] = {6, 12, 56, 8, 32, 123, 4, 45, 29, 96, 46, 15, 23, 42, 108};
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
