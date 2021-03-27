package guru.springframework;

public class Money {

    protected int amount;
    protected String currency;

    public String getCurrency() {
        return currency;
    }



    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }
    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }


    @Override
    public boolean equals(Object object){
        Money money = (Money)object;
        return money.amount == amount && money.currency.equals(currency);
    }


    public Money times(int multiplier){
        return new Money(this.amount * multiplier, currency);
    }


//    @Override
//    public String toString() {
//        return "Money{" +
//                "amount=" + amount +
//                ", currency='" + currency + '\'' +
//                '}';
//    }
}
