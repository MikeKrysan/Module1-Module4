/*
Чему будет равно значение элемента с индексом 3 в массиве copy после выполнения этой программы?
 */

public class Example3_1_3 {
    public static void main(String[] args) {
        int[] array = {13, 32, 39, 4, 55, 36, 7, 82, 99, 10};
        int[] copy = array;
        for (int i = 0; i < copy.length; i++) {
            copy[i] = copy[i] * 2;  //4*2 = 8
            System.out.println(copy[3]);
        }
    }
}
//Ответ: 8