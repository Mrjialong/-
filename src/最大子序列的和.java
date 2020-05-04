public class 最大子序列的和 {
    public String PrintMinNumber(int [] numbers) {
        String re = "";
        for(int i = 0;i<numbers.length;i++){
            for(int j = 1;j<numbers.length-i;j++){
                long number1 = Integer.valueOf(numbers[j-1]+""+numbers[j]);
                int number2 = Integer.valueOf(numbers[j]+""+numbers[j-1]);
                if(number1>number2){
                    int number = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = number;
                }
            }
        }
        for(int i = 0;i<numbers.length;i++){
            re = re+numbers[i];
        }
        return re;

    }

    public static void main(String[] args) {
        最大子序列的和 a = new 最大子序列的和();
        int[] array = {3334,3,3333332};
        System.out.println(a.PrintMinNumber(array));
    }
}
