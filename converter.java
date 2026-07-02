
import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        System.out.println("Выберете вариант что будем конвертировать:");
        System.out.println("1. Из C в F");
        System.out.println("2. Из F в C");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number) {
            case 1:
                System.out.print("Введите число В C: ");
                double convNumber = scan.nextDouble();
                double Cresult = convNumber * 1.8 + 32;
                System.out.println(Cresult);
                break;
            case 2:
                System.out.print("Введите число в F: ");
                double convNumberF = scan.nextDouble();
                double Fresult = (convNumberF - 32) / 1.8;
                System.out.println(Fresult);
                break;
            default:
                System.out.println("Вы выбрали не существующий вариант");
        }
    }
}
