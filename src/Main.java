public class Main {
    public static void main(String[] args) {
        double startBalance = 90;
        double income = 1500;
        int bonus = income >= 1000 ? (int) (income / 100) : 0;
        double endBalance = startBalance + income + bonus;
        System.out.println(endBalance);
    }
}