import java.util.Scanner;

public class Task4 {

//    �����:
//    ����� ���� ����� ����� �� 100 �� 500;
//    ����� ���� ����� ����� �� a �� b (�������� a � b �������� � ����������; b>=a).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b<a){
            System.out.println("b ������ ���� ������ a");
        }

        int sum = 0;
        for (int i=a; i<=b; i++){
            sum += i;
        }
        System.out.printf("����� ���� ����� - %d", sum);
    }
}
