public class fanxin<T> {
    public int li;
    public static int jia;
    private int qw = 1;
    public int shiyou(){
        return qw;
    }
    public void put(T t){
        System.out.println(li+jia);
        System.out.println("fanxin"+t);

    }
    public static class in{
        public int value;
        public in(int value){
            this.value = value;
        }

    }
    public void set(String str){
        str = "aaa";
    }

    public static void main(String[] args) {
        String str = "a";
        fanxin a = new fanxin();
        a.set(str);
        System.out.println(str);
    }
}
