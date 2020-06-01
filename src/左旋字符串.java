public class 左旋字符串 {
    public String LeftRotateString(String str,int n) {
        if(n == 0 || n == str.length()){
            return str;
        }
        String[] st = str.split("");
        String[] re = new String[str.length()];
        int number = str.length()-n;
        for(int i = 0;i < str.length();i++ ){
            int index = (i+n)%str.length();
            re[index] = st[i];
        }
        StringBuffer s = new StringBuffer();
        for (String i:re){
            s.append(i);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        int[] in = new int[]{1,23,4,6,7,8};
        System.out.println(in.toString());
        StringBuffer s = new StringBuffer();
        for (int i:in){
            s.append(i);
        }
        System.out.println(s.toString().length());
    }
}
