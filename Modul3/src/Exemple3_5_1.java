/*+
Создайте массив и инициализируйте его следующими значениями: 5, 24, 3, 66, 38, 16, 27. Проведите сортировку массива и выведите третий элемент массива. Чему он равен?
 */

import java.util.Arrays;

public class Exemple3_5_1 {
    public static void main(String[] args) {
        int[] num = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(num);
        System.out.println(num[2]);
    }
}
