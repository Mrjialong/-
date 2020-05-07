public class 快速排序 {
    public void farstSort(int[] array,int left,int right){
        if (left<right){
            int index = getIndex(array,left,right);
            farstSort(array,0,index-1);
            farstSort(array,index+1,right);
        }
    }
    public int getIndex(int[] array,int left,int right){
        int index = array[left];
        while (left<right){
            while (index<=array[right] && left<right){
                right--;
            }
            array[left]  =array[right];
            while (array[left]<=index && left<right){
                left++;
            }
            array[right] = array[left];
        }
        array[left] = index;
        return left;
    }
    public static void main(String[] args) {
        快速排序 a = new 快速排序();
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        int left = arr[-1];
        System.out.println(left);
//        a.farstSort(arr,0,arr.length-1);
//        for (int i:arr){
//            System.out.print(i+" ");
//        }
//        System.out.println();

    }
}
