import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> ary = new HashMap<Integer,Integer>();
        for(int i:array){
            if(ary.containsKey(i)){
                ary.remove(i);
            }else {
                ary.put(i,1);
            }
        }
        int index = 0;
        for (int i:ary.keySet()){
            array[index] = i;
        }
        num1[0] = array[0];
        num2[0] = array[1];

    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> ary = new HashMap<Integer,Integer>();
        ary.put(1,1);
        ary.put(3,1);
        for (int i:ary.keySet()){
            System.out.println(i);
        }


    }
}
