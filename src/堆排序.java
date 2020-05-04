public class 堆排序 {
    public int[] heapSort(int[] array){
        int len = array.length;
        while (len>0){
            buildheap(array,len);
            swap(array,0,len-1);
            len--;
        }
        return array;
    }


    private void swap(int[] array, int i, int i1) {
        int number = array[i];
        array[i] = array[i1];
        array[i1] = number;
    }
    void heapfy(int[] a,int maxIndex,int length){
        int index = maxIndex;
        int left = maxIndex*2+1;
        int right = left+1;
        if(left<length && a[left]>a[maxIndex]){
            maxIndex = left;
        }
        if (right<length && a[right]>a[maxIndex]){
            maxIndex = right;
        }
        if (maxIndex != index){
            swap(a,index,maxIndex);
            heapfy(a,maxIndex,length);
        }
    }
    void buildheap(int a[],int length){
        for (int i = length/2-1;i>=0;i--){
            heapfy(a,i,length);
        }
    }
    public static void main(String[] args) {
        堆排序 a = new 堆排序();
        int[] arr = {1,3,4,2,6,5};
        a.heapSort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
