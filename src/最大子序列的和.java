public class 最大子序列的和 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int[] arraymax = new int[array.length];
        arraymax[0] = array[0];
        int re = array[0];
        for (int i = 1;i<array.length;i++){
            int max = arraymax[i-1]+array[i];
            if (max>array[i]){
                arraymax[i] = max;
            }else arraymax[i] = array[i];

            if (re<arraymax[i]){
                re = arraymax[i];
            }
        }
        return re;
    }

    public static void main(String[] args) {
        最大子序列的和 a = new 最大子序列的和();
        int[] array = {1,-2,3,10,-4,7,2,-5};
        System.out.println(a.FindGreatestSumOfSubArray(array));
    }
}
