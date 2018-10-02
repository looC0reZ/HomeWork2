import java.util.Arrays;

class Selection {
    public static void main(String[] arg) {
        int mas[] = {6, 12, 56, 8, 32, 123, 4, 45, 29, 96, 46, 15, 23, 42, 108, 1};
        for (int i =0; i < mas.length -1; i++) {
            int max = Integer.MIN_VALUE;
            int pos = 0;
            int sort = mas.length - 1 - i;
            for (int j = 0; j < mas.length - i; j++) {
                if (mas[j] > max) {
                    max = mas[j];
                    pos = j;
                }
            }
            int temp = mas[sort];
            mas[sort] = mas[pos];
            mas[pos] = temp;
        }
        String result = Arrays.toString(mas);
        System.out.println(result);
    }

}

