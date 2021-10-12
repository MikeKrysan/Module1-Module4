/*
Необходимо вычислить индекс массы тела человека. Указать на проблему, если индекс показал критическое значение,
 вывести сообщение о проблеме (если таковая имеется). Самостоятельно найдите формулу расчета и реализуйте алгоритм с использованием изученного ранее материала.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2_8_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваш вес, в кг:");
        double weight = Double.parseDouble(br.readLine());
        System.out.println("Введите ваш рост, в метрах: ");
        double height = Double.parseDouble(br.readLine());
        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            int b = 2;
            double massIndex = weight / Math.pow(height, b);
            //double massIndex=weight/(height*height);
            System.out.println("Ваш индекс массы тела составил: " + massIndex);
            if (massIndex <= 16) {
                System.out.println("У вас выраженный дефицит массы тела");
            } else if (massIndex <= 18.5) {
                System.out.println("У вас недостаточная масса тела (дефицит)");
            } else if (massIndex <= 25) {
                System.out.println("Поздравляем, ваш вес в норме!");
            } else {
                System.out.println("Печаль: у вас есть лишний жирок");
            }
        }
    }
}

