package Exemple3_5_4;

/*      Написать программу «Книжный магазин», расположенную в специальном пакете.

        В программе создать класс «книга», состояние которого описывается параметрами: «название книги» (строковый), «цена» (целочисленный), «дата издания» (целочисленный).

        В основном классе создать «картотеку книг», представленную массивом «книг».

        В основном или отдельном классе создать статический метод/методы, который будет осуществлять проверку по параметрам «название книги» и «год выпуска».
        Есть ли такая книга в картотеке: если есть — выдавать соответствующее сообщение), если нет — добавлять книгу в картотеку (выдавать сообщения о добавлении книги).

        Если массив (картотека) заполнен — выдавать сообщение об этом.

        Проверку строчных параметров («название книги») можно организовать встроенным методом String equals.

        ⭐ Добавить метод, который выводит в консоль (на печать) всю информацию о всех книгах (название, год издания, цену) без конкатенации, при помощи форматирования.

        Пример вывода:

        книга №1: название: "The Hobbit", год издания: 1937г., цена - 999usd
        книга №2: название: "......", год издания: …...г., цена - ….usd
*/

public class BookStore {
    public static void main(String[] args) {
        Book[] bookList = new Book[99];     //создали картотеку книг, представленную в виде массива книг
        //Book book = new Book();

        Book book1 = new Book();
        book1.nameOfBook = "The Hobbit";
        book1.price = 99;
        book1.dateOfPublic = 1937;

        addBook(bookList, book1);

        Book book2 = new Book();
        book2.nameOfBook = "Туда и обратно";
        book2.price = 85;
        book2.dateOfPublic = 1939;

        addBook(bookList, book2);

        Book book3 = new Book();
        book2.nameOfBook = "Туда и обратно";
        book2.price = 87;
        book2.dateOfPublic = 1939;

        addBook(bookList, book2);
        printAllBookList(bookList);
    }


        public static void addBook(Book[] bookList, Book book) {        //метод, который добавляет книгу в картотеку
            if (!checkBook(bookList, book)) {
                for (int i = 0; i < bookList.length; i++) {
                    if (bookList[i] == null) {
                        bookList[i] = book;
                        System.out.println("Книга добавлена в картотеку!");
                        break;
                    }
                    if (i == bookList.length - 1) {
                        System.out.println("Картотека переполнена!");
                    }
                }
            }
        }

        public static boolean checkBook(Book[] bookList, Book book) {       //метод проверяющий картотеку по параметрам "название книги" и "год выпуска"
            for (Book item : bookList) {
                if (item != null && item.nameOfBook.equals(book.nameOfBook) && item.dateOfPublic == book.dateOfPublic) {
                    System.out.println("Данная книга уже есть в картотеке!");
                    return true;
                }
            }
            System.out.println("Данной книги нет в картотеке!");
            return false;
        }



        public static void printAllBookList(Book[] bookList) {      //метод, который выводит в консоль (на печать) всю информацию о всех книгах (название, год издания, цену) без конкатенации, при помощи форматирования.
            for (int i = 0; i < bookList.length; i++) {
                if (bookList[i] != null) {
                    System.out.printf("книга №%d: название: \"%s\", год издания: %dг., цена - %dusd \n", i + 1, bookList[i].nameOfBook, bookList[i].dateOfPublic, bookList[i].price);
                }
            }
        }

}
