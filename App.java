import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double area;
        double length;
        double width;

        System.out.println("【正方形の面積】");
        System.out.println("length: ");
        System.out.println("width: ");
        width = sc.nextDouble();
        length = sc.nextDouble();

        area = length * width;
        System.out.println("area: " + area);

        sc.close();
    }
}
