
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affCost = 2.50;

        if (payment >= affCost) {
            this.money = this.money + affCost;
            double change = payment - affCost;
            this.affordableMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartCost = 4.30;

        if (payment >= heartCost) {
            this.money = this.money + heartCost;
            double change = payment - heartCost;
            this.heartyMeals++;
            return change;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        double affCost = 2.50;
        if (card.balance() >= affCost) {
            card.takeMoney(affCost);
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        double heartCost = 4.30;

        if (card.balance() >= heartCost) {
            card.takeMoney(heartCost);
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }

    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
