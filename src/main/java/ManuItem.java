public class ManuItem extends  Item {
    public ManuItem(){}

    public ManuItem(String name , Double price, int quantity){
        super(name , price , quantity);
    }

    @Override
    public void calcTaxLevied() {
        double price = getPrice();
        setTaxLevied((0.125 * price) + 0.02 * (price + (0.125 * price)) );
        calcTotalPrice();
    }

    @Override
    public String getItemType() {
        return "MANUFACTURED";
    }
}
