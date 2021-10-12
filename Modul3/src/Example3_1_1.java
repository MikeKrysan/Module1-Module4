/*
Напишите программу, в которой будет массив, заполненный элементами от 5 до 15, и напечатайте все элементы массива.
 */

public class Example3_1_1 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        int value = 5;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = value;
            value++;
        }
        for(int item:arr) {
            System.out.println(item);
        }
    }
}
