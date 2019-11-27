package src.com.core_1.arrays;

import java.util.Arrays;

import static src.com.core_1.arrays.ArrayInverter.invert;

public class ArrayInverterTest {
    public static void main(String[] args) {
        int[] arr;

        arr = new int[]{};
        System.out.print(Arrays.toString(arr) + " -> ");
        invert(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{0};
        System.out.print(Arrays.toString(arr) + " -> ");
        invert(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{0, 1};
        System.out.print(Arrays.toString(arr) + " -> ");
        invert(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(Arrays.toString(arr) + " -> ");
        invert(arr);
        System.out.println(Arrays.toString(arr));
    }
}


//вывод
/*
>> [] -> []
        >> [0] -> [0]
        >> [0, 1] -> [1, 0]
        >> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] -> [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]*/
