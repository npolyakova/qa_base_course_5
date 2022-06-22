public class Task12 {

    //√ражданин 1 марта открыл счет в банке, вложив 1000 руб. „ерез каждый мес€ц размер вклада
    //увеличиваетс€ на 2% от имеющейс€ суммы. ќпределить:
    //1. за какой мес€ц величина ежемес€чного увеличени€ вклада превысит 30 руб.;
    //2. через сколько мес€цев размер вклада превысит 1200 руб.

    public static void main(String[] args) {
        double sum = 1000;
        double percent = 0.02;
        int count = 0;

        while(sum*percent < 30) {
            sum += sum*percent;
            count++;
        }

        System.out.println(sum*percent + " " + count);


        sum = 1000;
        count = 0;
        do {
            sum += sum*percent;
            count++;
        } while (sum<1200);

        System.out.println(sum+" "+count);
    }
}
