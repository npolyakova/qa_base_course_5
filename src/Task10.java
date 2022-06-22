import java.util.Scanner;

public class Task10 {

    //Дано натуральное число.
    //1. Определить его максимальную цифру
    //2. Определить его минимальную цифру

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int max = 0;
        int min = 9;

        while (number > 0){ //90244
            int digit = number % 10;

            if (digit == 9){
                max=9;
                number /= 10;
                continue;
            }
            else if(digit>max){
                max=digit;
            }
            if (digit == 0){
                min=0;
                number /= 10;
                continue;
            }
            else if(digit<min){
                min=digit;
            }
            number /= 10;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
