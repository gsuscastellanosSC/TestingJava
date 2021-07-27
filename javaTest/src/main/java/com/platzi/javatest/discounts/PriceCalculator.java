package com.platzi.javatest.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private Double discount = 0.0;

    public double getTotal() {
        double ans = 0;
        for (Double price : prices) {
            ans += price;
        }
        return ans * ((100-discount) / 100);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
