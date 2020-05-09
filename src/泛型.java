import java.util.*;

public class 泛型 extends fanxin {
    @Override
    public void put(Object o) {
        super.put(o);
    }
    public void get(){

    }

    public static class lijialong<t> {
        private t value;

        private t getValue() {
            return value;
        }

        private void setValue(t value) {
            this.value = value;
        }
    }
    public static void put(List<? extends Number> list){

    }

    private ArrayList<? extends Number> jialong = new ArrayList();

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> next = iterator.next();
            System.out.println(next.getKey());
        }

//        泛型 a =  new 泛型();
//        System.out.println(a.shiyou());
//        fanxin b = new fanxin();
////        a = (泛型) b;
////        泛型 c = new fanxin<>() b;
        int i = 2 & 3;
        System.out.println(i);


    }
}
