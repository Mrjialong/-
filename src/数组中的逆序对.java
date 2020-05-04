public class 数组中的逆序对 {
    private int cnt;
    //归并排序的分
    private void MergeSort(int[] array, int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        MergeSort(array,start,mid);
        MergeSort(array,mid+1,end);
        MergeOne(array,start,mid,end);

    }
    private void MergeOne(int[] array, int start, int mid, int end){
        int[] list = new int[end-start+1];
        int li = 0;
        int ls = start;
        int rs = mid+1;
        while (ls<=mid && rs <=end){
            if (array[ls]>=array[rs]){
                cnt = cnt+(mid-ls+1)%1000000007;
                list[li++] = array[rs++];
            }else {
                list[li++] = array[ls++];
            }
        }
        while (ls<=mid){
            list[li++] = array[ls++];
        }
        while (rs<=end){
            list[li++] = array[rs++];
        }
        for (int i = 0; i < li; i++) {
            array[start+i] = list[i];
        }
    }
    public int InversePairs(int [] array) {
        MergeSort(array, 0, array.length-1);
        return cnt;
    }
    public static void main(String[] args) {
        数组中的逆序对 a = new 数组中的逆序对();
        int[] array = {1,4,3,7,5,6,8,2};
        a.InversePairs(array);

    }
}
