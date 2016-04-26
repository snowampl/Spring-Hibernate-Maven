package com.study.designPattern.command;

/**
 * Created by guobing on 2016/4/26.
 */
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void excute() {
        stock.buy();
    }
}
