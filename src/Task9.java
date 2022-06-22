public class Task9 {

    //»меетс€ фрагмент программы в виде оператора цикла с параметром,
    //обеспечивающий вывод на экран "столбиком" всех целых чисел от 10 до 30.
    //ќформить этот фрагмент в виде:
    //1. оператора цикла с предусловием;
    //2. оператора цикла с постусловием.
    public static void main(String[] args) {

        int n = 10;
        do {
           System.out.println(n);
           n++;
        } while (n<=30);

        System.out.println();

        n = 10;
        while (n<=30){
            System.out.println(n);
            n++;
        }
    }
}
