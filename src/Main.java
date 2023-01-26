import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        determineLeapYear(2000);
        determinePhoneProps((byte) 1, 2022);
        calculateDays(15);
    }
    public static void determineLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    static public void determinePhoneProps (byte operationSystem, int releaseYear) {
        if (operationSystem == 0 && releaseYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operationSystem == 1 && releaseYear < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (operationSystem == 0 && releaseYear == LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operationSystem == 1 && releaseYear == LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void calculateDays(int distance) {
        int days = 0;
        if (distance > 100) {
            System.out.println("К сожалению, доставка не производится");
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        } else if (distance > 20 && distance <= 60) {
            days = 2;
        } else if (distance <= 20 && distance > 0) {
            days = 1;
        }
        System.out.println("Потребуется дней: " + days);
    }
}