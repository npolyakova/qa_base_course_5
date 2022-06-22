public class Task11 {

    //Найти максимальное из натуральных чисел, не превышающих 5000, которое нацело делится на 39.
    public static void main(String[] args) {
        for (int i = 5000; i>0; i--){
            if (i % 39 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
