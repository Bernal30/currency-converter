package Models;


public class ExchangeRateList {

    private final String nameList;

    public ExchangeRateList(ConversionRateList conversionRate, String nameList) {
        this.nameList = nameList;
    }

    public String getNameList() {
        return nameList;
    }

}
