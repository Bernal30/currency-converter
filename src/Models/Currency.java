package Models;

public class Currency {

    //attributes
    private final String currencyName;
    private double currencyValue;

    //currency constructor
    public Currency(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(double currencyValue) {
        this.currencyValue = currencyValue;
    }

}
