package cn.letcode.observe.observe02;

import java.util.ArrayList;
import java.util.List;

public class ShopSubject implements Subject {
    String goodsName;
    double oldPrice, newPrice;
    List<Observer> customerList;

    public ShopSubject() {
        customerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        if (!customerList.contains(observer))
            customerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        if (customerList.contains(observer))
            customerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : customerList) {
            observer.update(); // 仅仅观察着执行更新操作，但不提供数据
        }
    }

    public void setDiscountGoods(String name, double oldPrice, double newPrice) {
        this.goodsName = name;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        notifyObserver();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }
}
