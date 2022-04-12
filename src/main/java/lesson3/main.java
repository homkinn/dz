package lesson3;
import java.util.Arrays;
public class main {

    public static void main(String[] args) {
        int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(zeroOne(array01)));
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifierForArrayes(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));
        int[] forCheckBalanceArray = {1, 2, 3, 1, 2, 3};
        System.out.println(checkbalance(forCheckBalanceArray));
        int[] arr2 = new int[100];
        System.out.println("before:" + Arrays.toString(arr2));
        createArr(arr2, 3, 1);
        System.out.println("after: " + Arrays.toString(arr2));

    }
    public static int[] zeroOne(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }

    public static void modifierForArrayes(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }

    public static boolean checkbalance(int[] array){
        int leftSum = 0;
        for(int i = 0; i < array.length; i++){
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                rightSum += (j > i)? array[j] : 0;
            }
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }
    public static void createArr(int[] array, int step, int shift){
        for(int i = 0; i < 100; i ++){
            array[i] = shift + i * step;
        }
    }


    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }


    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}
