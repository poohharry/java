package vending;


public class Drink {

	private static String name;
    private static int price;
    private static int stock;
    private static int sales;
    
    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setPlusStock(int stock) {
        this.stock += stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSales_money() {
        return price * sales;
    }

    public void setSales(int sales) {
        this.sales += sales;
    }
    
}
