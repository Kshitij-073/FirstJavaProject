abstract public class Item {
    private String name;
    private double price;
    private int quantity;
    private double taxLevied;
    private double totalPrice;

    public Item() {}

    public Item(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void calcTotalPrice(){
        totalPrice = (price + taxLevied) * quantity;
    }

    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }

    public void setTaxLevied(double taxLevied){
        this.taxLevied = taxLevied;
    }

    public double getTaxLevied(){
        return taxLevied;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    abstract public void calcTaxLevied();

    abstract public String getItemType();

}
