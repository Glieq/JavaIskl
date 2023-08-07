import java.io.FileNotFoundException;

// В исходном коде были 3 ошибки:
// 1. Ошибки порядка catch-блоков
// 2. Выход за пределы массива
// 3. Неотлавливаемое исключение

// Ниже представлен исправленный код:
public class task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9; // Индекс 1 в массиве abc
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
