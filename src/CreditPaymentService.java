public class CreditPaymentService {
    public double calculate ( int summ, int time, float percent) {
        float i = percent/100/12;
        double payment = summ* (i* Math.pow((1+i), time*12))/(Math.pow((1+i), time*12)-1);
        return payment;

    }
}
