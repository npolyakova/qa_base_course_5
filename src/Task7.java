import java.util.Scanner;

public class Task7 {

    //Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
    //1. сумму всех чисел последовательности;
    //2. количество всех чисел последовательности

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int sum = 0;
        int count = 0;

        while (a!=0){
            a = sc.nextInt();
            sum += a;
            count++;
        }
        System.out.printf("Сумма равна %d \n", sum);
        System.out.printf("Всего элементов в последовательности - %d", count);
    }
}
