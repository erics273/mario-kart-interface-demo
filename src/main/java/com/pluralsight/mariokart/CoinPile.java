package com.pluralsight.mariokart;

import com.pluralsight.finance.IValuable;

public class CoinPile implements IValuable {

    private int coins;

    public CoinPile(int coins) {
        this.coins = coins;
    }

    @Override
    public double getValue() {
        return this.coins;
    }

    @Override
    public String toString() {
        return "CoinPile - Value: " + getValue();
    }
}
