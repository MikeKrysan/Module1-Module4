/*
Прошло соревнование среди 5 участников: Саша, Игорь, Миша, Коля и Владимир, по 5 различным дисциплинам.
Организаторами был создан двухмерный массив: каждая i-ая строка — это количество полученных баллов i-го игрока.
Задание: вывести одномерный массив в виде "<Имя игрока>  <сумма баллов>".
 */

public class Exemple3_5_3 {
    public static void main(String[] args) {
        int i, j;
        String[] rezult = new String[5];
        int[][] points = {
                {4, 3, 2, 5, 1},
                {3, 4, 4, 6, 2},
                {2, 5, 4, 3, 2},
                {8, 4, 2, 0, 4},
                {4, 4, 3, 2, 9},
        };
        int[] sumPoints = new int[5];
        String[] names = {"Alex", "Igor", "Michael", "Nicolay", "Vladimir"};
        for (i = 0; i < names.length; i++) {
            for (j = 0; j < points[i].length; j++){
                sumPoints[i] += points[i][j];           //Здесь прибавляем оценки из двухмерного массива одного участника соревнований
            }
            rezult[i] = names[i] + " " + sumPoints[i];
            System.out.println(rezult[i]);
        }
    }
}
