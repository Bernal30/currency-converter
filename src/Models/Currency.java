package Models;

public class Currency {

    //attributes
    private final String baseCode;
    private final Double conversionRate;


    //currency constructor
    public Currency(String baseCode, double conversionRate) {
        this.baseCode = baseCode;
        this.conversionRate = conversionRate;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public Double getConversionRate() {
        return conversionRate;
    }


}
