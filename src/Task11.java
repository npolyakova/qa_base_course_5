public class Task11 {

    //����� ������������ �� ����������� �����, �� ����������� 5000, ������� ������ ������� �� 39.
    public static void main(String[] args) {
        for (int i = 5000; i>0; i--){
            if (i % 39 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
