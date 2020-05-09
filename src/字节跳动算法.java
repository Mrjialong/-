import java.util.ArrayList;
import java.util.HashMap;

public class 字节跳动算法 {
//    有一个数组【3，4，5，6，89，8，6，3，5】，给你一个数组【2，5，7】，后者的意思为查询下标2到5之间有几个7，u有多个查询，返回一个结果数组
    public int sort(int[] array,int[] search){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){//有存在，把下标储存
                map.get(array[i]).add(i);
            }else {//没有，新建一个数组储存
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(i);
                map.put(array[i],arrayList);
            }
        }
        ArrayList<Integer> arrayList = map.get(search[2]);
        if (arrayList == null){
            return 0;
        }
        int count = 0;
        for (int i:arrayList){
            if (search[0]<=i && i<=search[1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        字节跳动算法 a = new 字节跳动算法();
        int[] array = new int[]{3,4,5,6,89,8,6,3,5};
        int[] search = new int[]{2,5,5};
        System.out.println(a.sort(array,search));

    }
}
