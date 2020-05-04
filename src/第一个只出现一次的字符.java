import java.util.HashMap;

public class 第一个只出现一次的字符 {

    public int FirstNotRepeatingChar(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        int index = -1;
        for(String i:str.split("")){
            if (map.containsKey(i) == false){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }

        }
        for (String i:str.split("")){
            index++;
            if (map.get(i) == 1){
                return index;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
//        第一个只出现一次的字符 a = new 第一个只出现一次的字符();
//        String str = "sqqqqqwwqq";
//        System.out.println(a.FirstNotRepeatingChar(str));
        String qw = "";
        System.out.println(qw == "");
        System.out.println(qw.equals(""));
    }
}
