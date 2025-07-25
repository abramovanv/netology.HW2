//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import static ru.netology.service.CustomsService.calculateCustoms;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int fee = calculateCustoms(price, weight);

        System.out.print("Размер пошлины (в руб.) составит: " + fee);
    }
}