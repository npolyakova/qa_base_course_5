import java.util.Map;
import java.util.Scanner;

public class Task5 {

//    ���� ����������� ����� n � ������������ ����� a1, a2, ..., an.
//    ���������� ������� �������������� ������������ �����

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double average = 0;
        for (int i=0; i<n; i++){
            double a = sc.nextDouble();
            average += a;
        }
        System.out.printf("������� �������������� ����� %f", average/n);
    }
}
