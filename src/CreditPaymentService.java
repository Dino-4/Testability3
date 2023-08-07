public class CreditPaymentService {
    public int payment (int sum, double percent, double term){
    double mps = percent / 12 /100;
    double cps = mps * Math.pow((1 + mps), term) / (Math.pow((1+mps), term) - 1);
    cps = cps * sum;
    return (int) cps;
    }
}

//mps - месячная процентная ставка;
//sum — сумма займа;
//percent — процент;
//term — срок кредитования.