import netscape.security.UserTarget;

public class 排序 {
    public int[] bubbleSort(int[] array){
        if (array.length == 0){
            return array;
        }
        for (int i = 0;i<array.length;i++){
            for (int j = 0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int number = array[j+1];
                    array[j+1] = array[j];
                    array[j] = number;
                }
            }
        }
        return array;
    }
    public int[] selectionSort(int[] array){
        int index = 0;
        for (int j = 0;j<array.length;j++){
            int min = index;
            for (int i = index; i < array.length-1; i++) {
                if (array[min]>array[i+1]){
                    min = i+1;
                }
            }
            int number = array[min];
            array[min] = array[index];
            array[index] = number;
            index++;
        }
        return array;
    }
    public int[] insertionSort(int[] array){
        int sortIndex = 0;
        for (int noSortIndex = sortIndex+1; noSortIndex < array.length; noSortIndex++) {
            for (int j = sortIndex;j>=0;j--){
                if (array[j+1]<array[j]){
                    int number = array[j+1];
                    array[j+1] = array[j];
                    array[j] = number;
                }else {
                    break;
                }
            }
            sortIndex++;
        }
        return array;
    }

    public static int[] ShellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }
    public void MergeSort(int[] array,int left,int right){
        if (left>=right) return;
        int mid = (left+right)/2;
        MergeSort(array,left,mid);
        MergeSort(array,mid+1,right);
        merge(array,left,mid,right);
    }
    public  void merge(int[] array,int left,int mid,int right){
        int[] list = new int[right-left+1];
        int index = 0;
        int leftArray = left;
        int rightArray = mid+1;
        while (leftArray<=mid && rightArray<=right){
            if (array[leftArray]>array[rightArray]){
                list[index++] = array[rightArray++];
            }else {
                list[index++] = array[leftArray++];
            }
        }
        if (leftArray<=mid){
            list[index++] = array[leftArray++];
        }
        if (rightArray<=right){
            list[index++] = array[rightArray];
        }
        for (int i = 0; i < index; i++) {
            array[left+i] = list[i];
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{2,4,6,3,7,1,5,8};
        排序 a = new 排序();
        a.MergeSort(array,0,array.length-1);
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}
