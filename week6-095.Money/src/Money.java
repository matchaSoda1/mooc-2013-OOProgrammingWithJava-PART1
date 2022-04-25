
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money b) {
        Money plus = new Money(this.euros + b.euros, this.cents + b.cents);
        return plus;
    }

    public boolean less(Money b) {
        //should be named isLessThan
        if (this.euros < b.euros) {
            return true;
        } else if ((this.euros == b.euros) && this.cents < b.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money b) {
        int zEuros = 0;
        int zCents = 0;
        Money zeroMoney = new Money(0, 0);

        if (this.less(b)) {
            return zeroMoney;
        } else if (this.cents - b.cents < 0) {
            Money c = new Money(this.euros-b.euros-1, 100+this.cents-b.cents);
            return c;
        } 
        Money result = new Money(this.euros-b.euros, this.cents-b.cents);
        return result;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
