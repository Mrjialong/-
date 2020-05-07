import java.util.ArrayList;

public class 有序序列最小和 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {

        if (array == null) {
            return null;
        }
        int left = 0;
        int right = array.length - 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (left < right) {
             int number = array[left] + array[right];
            if (number == sum) {
                list.add(left);
                list.add(right);
                break;
            }
            if (number > sum) {
                right--;
                System.out.println("right--");
            }
            if (number < sum) {
                left++;
                System.out.println("left++");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        有序序列最小和 a = new 有序序列最小和();
        int[] array = new int[]{1,2,4,7,11,16};
        System.out.println(a.FindNumbersWithSum(array,10));

    }
}
