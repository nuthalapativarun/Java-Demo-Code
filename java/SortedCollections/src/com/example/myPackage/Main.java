package com.example.myPackage;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 62.00, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.5, 200);
        stockList.addStock(temp);
        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.5, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.4, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        if(sellItem(timsBasket, "Car", 1) != 1) {
            System.out.println("There are no more cars in stock ");
        }
        sellItem(timsBasket, "spinach", 1);
//        System.out.println(timsBasket);

        sellItem(timsBasket, "juice", 4);
        sellItem(timsBasket, "Cup", 12);
        sellItem(timsBasket, "Bread", 1);
//        System.out.println(timsBasket);

        Basket basket = new Basket("customer");
        sellItem(basket, "Cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "Cup", 1);

        System.out.println(basket);

        removeItem(timsBasket, "Car", 1);
        removeItem(timsBasket, "Cup", 9);
        removeItem(timsBasket, "Car", 1);

        System.out.println("Cars removed: " + removeItem(timsBasket, "Car", 1)); //should not remove any
        System.out.println(timsBasket);

        //remove all items from timsBasket
        removeItem(timsBasket, "Bread", 1);
        removeItem(timsBasket, "Cup", 3);
        removeItem(timsBasket, "juice", 4);
        removeItem(timsBasket, "Cup", 3);
        System.out.println(timsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkout(basket);
        System.out.println(basket);
        System.out.println(stockList);


//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        StockItem car = stockList.Items().get("Car");
        if(car != null) {
            car.adjustStock(2000);
        }
        if(car != null) {
            car.adjustStock((-1000));
        }

        System.out.println(stockList);
//        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkout(timsBasket);
        System.out.println(timsBasket);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We dont sell " + item);
            return 0;
        }

        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }

        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        //retrieve item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We dont sell " + item);
            return 0;
        }

        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }

        return 0;
    }

    public static void checkout(Basket basket) {
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
