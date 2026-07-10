public class Main {
    public static void main(String[] args) {
        int number = 5;
        int a = 1;

        while (a <= 10) {

            if (number > 0) {
                number--;
                System.out.println(a + "번 주문 성공, 남은 재고 : " + number);
            } else {
                System.out.println(a + "번 주문 실패, 재고 없음");
            }
            a++;
        }
    }
}