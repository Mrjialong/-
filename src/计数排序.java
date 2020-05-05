public class 计数排序 {

    public int[] countingSort(int[] array){
        int index = 0;
        int min = array[1];
        int max = array[1];
        for (int i:array) {
            if (i>max){
                max = i;
            }
            if (i<min){
                min = i;
            }
        }
        int[] list = new int[max-min+1];
        for (int i:array){
            list[i-min]++;
        }
        for (int i = 0; i < list.length; i++) {
            while (list[i]>0){
                array[index++] = i+min;
                list[i]--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arry = new int[]{9, 3, 5, 4, 9, 1, 2, 7, 8,1,3, 6, 5, 3, 4, 0, 10, 9, 7, 9};
        计数排序 a = new 计数排序();
        a.countingSort(arry);
        for (int i:arry){
            System.out.print(i+" ");
        }

    }
}
