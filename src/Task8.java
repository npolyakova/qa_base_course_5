public class Task8 {

    //���� ����������� �����. ����������:
    //1. ���������� ���� 3 � ���;
    //2. ������� ��� � ��� ����������� ��������� �����;
    //3. ���������� ������ ���� � ���;
    //4. ����� ��� ����, ������� ����;
    //5. ������������ ��� ����, ������� ����;
    //6. ������� ��� � ��� ����������� ����� 0 � 5 (�����).

    public static void main(String[] args) {

        int naturalNumber = 2032934583;
        int threeCount = 0;
        int lastDigit = naturalNumber % 10;
        int lastDigitCount = 0;
        int evenDigitsCount = 0;
        int sum = 0;
        int product = 1;
        int nullsAndFiveCount = 0;

        while (naturalNumber > 0) {
            int digit = naturalNumber % 10;

            if (digit == 3){
                threeCount++;
            }

            if (digit == lastDigit){
                lastDigitCount++;
            }

            if (digit % 2 == 0){
                evenDigitsCount++;
            }

            if (digit > 5){
                sum += digit;
            }

            if (digit > 7){
                product *= digit;
            }

            if (digit == 0 || digit == 5){
                nullsAndFiveCount++;
            }

            naturalNumber /= 10;
        }

        if (product == 1){
            product = 0;
        }

        System.out.println("���������� ����� " + threeCount);
        System.out.println("���������� ���������� ��������� ����� " + lastDigitCount);
        System.out.println("���������� ������ ���� " + evenDigitsCount);
        System.out.println("����� ���� ������ ���� " + sum);
        System.out.println("������������ ���� ������ ���� " + product);
        System.out.println("���������� 0 � 5 " + nullsAndFiveCount);
    }
}
