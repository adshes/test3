import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий курс: ");
        double x = in.nextDouble();
        System.out.print("Введите количество рублей: ");
        double y = in.nextDouble();

        double a  = y/x;
        System.out.printf("%.2f", a);

    }
}
