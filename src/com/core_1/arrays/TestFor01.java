//Перебрать элементы массива в прямом порядке:
package src.com.core_1.arrays;

public class TestFor01 {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}