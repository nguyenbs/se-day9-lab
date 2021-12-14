public class TestMyApplication {
    public static void main(String arg[]) {
        testWithdrawal01();
    }

    public static void testWithdrawal01() {
        AtmProcessor ma = new AtmProcessor();
        //Must be > 0
        double amount = ma.withdrawal(10);
        System.out.println(amount <= 0 ? "Fail" : "Pass");

        amount = ma.withdrawal(1000000000);
        System.out.println(amount != -1 ? "Fail" : "Pass");

        amount = ma.withdrawal(1000000);
        System.out.println(amount != 1000000 ? "Fail" : "Pass");

        amount = ma.withdrawal(-1);
        System.out.println(amount != -2 ? "Fail" : "Pass");

        amount = ma.withdrawal(0);
        System.out.println(amount != -2 ? "Fail" : "Pass");
    }
}
