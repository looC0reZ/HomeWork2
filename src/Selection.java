import java.util.Arrays;

class Selection {
    public static void main(String[] arg) {
        int mas[] = {52, 5, 66, 59, -54, -7, -93, 97, -9, -19, -94, 21, 17, 78, -35, -49, 91, 15, 94, 76, 56, 55, -9,
                -22, -73, 47, -81, 53, 94, -75, -36, -47, 51, 27, 5, -59, 42, 67, -47, 14, -19, -43, -8, 4, 72, 36,
                -39, 1, -32, 31};
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

