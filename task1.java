import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели число: " + userInput);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float result = 0.0f;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                result = scanner.nextFloat();
                isValid = true;
            } else {
                System.out.println("Ошибка ввода! Пожалуйста, введите дробное число.");
                scanner.next(); // Очистка буфера ввода от некорректных данных
            }
        }

        return result;
    }
}
