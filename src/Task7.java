import java.util.Scanner;

public class Task7 {

    //���� �������� ������������������ ����� �����, �������������� �����. �����:
    //1. ����� ���� ����� ������������������;
    //2. ���������� ���� ����� ������������������

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
        System.out.printf("����� ����� %d \n", sum);
        System.out.printf("����� ��������� � ������������������ - %d", count);
    }
}
