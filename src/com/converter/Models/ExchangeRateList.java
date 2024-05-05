package com.converter.Models;

import java.util.ArrayList;
import java.util.List;

public class ExchangeRateList {
    private final Object listEstructure;
    private final String nameList;

    List<String> currencyIsoList = new ArrayList<>();


    public ExchangeRateList(ConversionRateList conversionRate, String nameList) {
        this.nameList = nameList;
        this.listEstructure = conversionRate;
    }

    public String getNameList() {
        return nameList;
    }

    public Object getListEstructure() {
        return listEstructure;
    }
}
