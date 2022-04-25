/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meowity
 */
public class LyyraCard {

    private double cardBalance;

    public LyyraCard(double startingBalance) {
        this.cardBalance = startingBalance;

    }

    public String toString() {
        return "The card has " + this.cardBalance + " euros";
        //awkward English btw
    }

    public void payEconomical() {
        if (this.cardBalance - 2.50 >= 0) {
            this.cardBalance -= 2.50;
        }
    }

    public void payGourmet() {
        if (this.cardBalance - 4.00 >= 0) {
            this.cardBalance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount >= 0) {
            if (this.cardBalance + amount > 150) {
                this.cardBalance = 150;
            } else {
                this.cardBalance += amount;
            }
        }
    }
}
