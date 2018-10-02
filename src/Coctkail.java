import java.util.Arrays;

class Coctkail {
    public static void main(String[] arg) {
        int mas[] = {6, 12, 56, 8, 32, 123, 4, 45, 209, 96, 46, 15, 23, 42, 108};
        boolean sort = true;
        int j = 0;
        while (sort){
            sort = false;
            for (int i = j; i <= mas.length - j - 2; i++){
                if (mas[i] > mas[i + 1]) {
                    int temp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = temp;
                    sort = true;
                }
            }
            if (!sort)
                break;
            sort = false;
            for (int i = mas.length - j - 2; i >=j; i--){
                if (mas[i] > mas[i + 1]) {
                    int temp = mas[i + 1];
                    mas[i + 1] = mas[i];
                    mas[i] = temp;
                    sort = true;
                }
            }
            j++;

        }
        String result = Arrays.toString(mas);
        System.out.println(result);
    }
}
