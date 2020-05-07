import java.util.ArrayList;
import java.util.List;

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
        泛型 a =  new 泛型();
        fanxin b = new fanxin();
//        a = (泛型) b;
//        泛型 c = new fanxin<>() b;


    }
}
