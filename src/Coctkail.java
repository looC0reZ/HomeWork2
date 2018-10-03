import java.util.Arrays;

class Coctkail {
    public static void main(String[] arg) {
        int mas[] = {-6, -99, 39, -97, 40, 92, -28, 19, 9, 73, 28, 8, -66, -65, 74, -92, -7, 69, -5, -78, -94, -100,
                -12, -20, 55, -85, 43, -8, -33, 65, 13, -88, -74, 9, 57, -99, -57, -55, 49, 98, -73, -17, 60, -13, -77,
                -98, -56, 100, 48, -69};
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
