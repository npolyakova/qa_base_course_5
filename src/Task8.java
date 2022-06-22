public class Task8 {

    //Дано натуральное число. Определить:
    //1. количество цифр 3 в нем;
    //2. сколько раз в нем встречается последняя цифра;
    //3. количество четных цифр в нем;
    //4. сумму его цифр, больших пяти;
    //5. произведение его цифр, больших семи;
    //6. сколько раз в нем встречаются цифры 0 и 5 (всего).

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

        System.out.println("Количество троек " + threeCount);
        System.out.println("Количество повторений последней цифры " + lastDigitCount);
        System.out.println("Количество четных цифр " + evenDigitsCount);
        System.out.println("Сумма цифр больше пяти " + sum);
        System.out.println("Произведение цифр больше семи " + product);
        System.out.println("Количество 0 и 5 " + nullsAndFiveCount);
    }
}
