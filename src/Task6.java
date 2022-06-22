public class Task6 {

    public static void main(String[] args) {
        System.out.println(fib(4));
        checkIfEvens(fibNumbers(5));
    }

    //1, 1, 2, 3, 5, 8, 13
    public static int fib(int k){
        int number = 0;
        if (k == 1 || k == 2) {
            number = 1;
        } else {
            number = fib(k - 1) + fib(k - 2); //5-1 5-2
        }
        return number;
    }

    public static int fibNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(fib(i) + " ");
            sum += fib(i);
        }
        return sum;
    }

    public static void checkIfEvens(int sum) {
        if (sum%2 == 0){
            System.out.println("Сумма чисел чётная");
        }
        else {
            System.out.println("Сумма чисел нечётная");
        }
    }
}
