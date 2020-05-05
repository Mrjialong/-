public class 稳定版计数排序 {

    public int[] sortedArray(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i:array){
            if (i>max) max = i;
            if (i<min) min = i;
        }
        int[] countArray = new int[max-min+1];
        for (int i:array){
            countArray[i-min]++;
        }
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] = countArray[i-1]+countArray[i];
        }
        int[] sortArray = new int[array.length];
        for (int i:array){
            sortArray[countArray[i-min]-1] = i;
            countArray[i-min]--;
        }

        return sortArray;
    }



    public static void main(String[] args){
        稳定版计数排序 a = new 稳定版计数排序();
        int[] array = new int[]{90,99,95,94,95};
        int index = array.length-1;
        for (int i:array){
            System.out.println(i);
            array[index] = 1;
            index--;
        }
//        for (int i:a.sortedArray(array)){
//            System.out.print(i+" ");
//        }
    }
}
