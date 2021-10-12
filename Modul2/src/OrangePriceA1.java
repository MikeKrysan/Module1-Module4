/*
Посчитайте суммарную стоимость апельсинов. За суммарную стоимость апельсинов отвечает переменная public static int orangePrice (для этого допишите код в CodeBoard).
 */


public class OrangePriceA1 {
    public static void main(String[] args) {
        Orange orange = new Orange();
        orange.addPrice(50);
        Orange orange1 = new Orange();
        orange1.addPrice(100);
        System.out.println("Total cost: " + Orange.orangePrice);

    }

    public static class Orange {
        public static int orangePrice = 0;

        public void addPrice(int price) {
            // write your code here
            orangePrice += price;
        }
    }
}
