public class Name {
    public static void main(String[] args) {
        double accountBill = 200;
        double refill = 1100;
        double bonus = 1;
        double forEvery = 100;
        double bonusLimit = 1000;
        double totalBonus = 0;

        if (refill > bonusLimit) {
            totalBonus = ((int) (refill / forEvery)) * bonus;
        }

        System.out.println(totalBonus);
        double total = accountBill + refill + totalBonus;
        System.out.println(total);
    }
}