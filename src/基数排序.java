import java.util.ArrayList;

public class 基数排序 {
    public int[] RadixSort(int[] array){
        if (array == null || array.length<2){
            return array;
        }
        int max = array[0];
        for (int i:array){
            if (i>max) max = i;
        }
        int maxDigit = 0;//最大层数
        while (max != 0){
            max/=10;
            maxDigit++;
        }
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList();//定义可变数组
        for (int i = 0; i < 10; i++) {//数组中填充10个元素
            bucketList.add(new ArrayList<Integer>());
        }
        int mod = 10;int div = 1;
        for (int i = 0; i < maxDigit; i++,mod*=10,div*=10) {
            for (int j:array){//根据位数插入
                int num = (j%mod)/div;
                bucketList.get(num).add(j);
            }
            int index = 0;
            for (int j = 0; j < bucketList.size(); j++) {//排序回原数组
                for (int k = 0; k < bucketList.get(j).size(); k++) {
                    array[index++] = bucketList.get(j).get(k);
                }
                bucketList.get(j).clear();//将元素清除
            }

        }
        return array;
    }

    public static void main(String[] args){
        基数排序 a = new 基数排序();
        int[] arry = new int[]{9, 3, 5, 4, 9, 1, 2, 7, 8,1,3, 6, 5, 3, 4, 0, 10, 9, 7, 9};
        arry =  a.RadixSort(arry);
        for (int i:arry){
            System.out.print(i+" ");
        }

    }
}
