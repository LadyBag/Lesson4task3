public class Main {
    public static void main (String[] args ) {
        CreditPaymentService service = new CreditPaymentService();
        int summ = 1_000_000;
        int payment = (int)service.calculate(summ , 1, 9.99f);
        System.out.println(payment);

         payment = (int)service.calculate(summ , 2, 9.99f);
        System.out.println(payment);

         payment = (int)service.calculate(summ , 3, 9.99f);
        System.out.println(payment);

    }
}
