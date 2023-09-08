import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ЗАДАНИЕ 2");
        System.out.print("В дюймах: ");
        float number = 0;
        number = sc.nextInt();
        System.out.println("В метрах: " + number*0.0254);


        System.out.println("ЗАДАНИЕ 2");
        float num_1 = sc.nextInt();
        float num_2 = sc.nextInt();
        float num_3 = sc.nextInt();

        System.out.println("среднее: " + sred(num_1, num_2, num_3));

        sc.close();
    }

    public static float sred (float number_1, float number_2, float number_3){

        return ((number_1 + number_2 + number_3)/3);
    }
}