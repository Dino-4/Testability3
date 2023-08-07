public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculate = new CreditPaymentService();
        int result = calculate.payment(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платеж " + result + " ₽");
    }
}
