// Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке. 
// Не используйте дополнительный массив для хранения результатов.

package src.com.core_1.arrays; 

public class SwapArray {
 
    public static void main(String[] args){
 
        String[] a = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
        //Выводим изначальный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        
        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;
 
        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}