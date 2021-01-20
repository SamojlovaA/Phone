public class Main {
    public static void main(String[] args) {
        boolean registered = true;
        int score = 100;
        int percent = 1;
        long amount = 2000;
        long bonus = amount * percent / 100 ;
        long limit = 1000;
        if (amount < limit) {
            bonus = 0;
            int score = 100 + long amount;
        }
        else (amount > limit ) {
            amount = limit;
            int score = 100 + long amount + long bonus;
        }
        System.out.println(bonus);
    }
}