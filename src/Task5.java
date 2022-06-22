import java.util.Map;
import java.util.Scanner;

public class Task5 {

//    Даны натуральное число n и вещественные числа a1, a2, ..., an.
//    Определить среднее арифметическое вещественных чисел

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double average = 0;
        for (int i=0; i<n; i++){
            double a = sc.nextDouble();
            average += a;
        }
        System.out.printf("Среднее арифметическое равно %f", average/n);
    }
}
