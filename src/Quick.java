import java.util.Arrays;

class Quick {
    private static int mas[] = {42, 15, 23, 4, 16, 8};
    private static void sort (int start, int end){
        if (start < end) {
            int left = start;
            int right = end;
            int center =  (left + right) / 2;
            int oper = mas[center];
            while (left < right) {
                while ((mas[left] <= oper) && left < center) {
                    left++;
                }
                while ((mas[right] >= oper) && right > center) {
                    right --;
                }
                if (left < right) {
                    int temp = mas[left];
                    mas[left] = mas[right];
                    mas[right] = temp;
                    if (left < center)
                        left++;
                    if (right > center)
                        right--;
                }
            }
            sort(start, center);
            sort(center+1, end);
        }

    }
    public static void main(String[] arg) {
        sort(0, mas.length-1);
        String result = Arrays.toString(mas);
        System.out.println(result);
    }

}
