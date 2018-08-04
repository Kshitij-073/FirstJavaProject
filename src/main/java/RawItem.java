public class RawItem extends Item{

    public RawItem(){}

    public RawItem(String name , Double price, int quantity){
        super(name , price , quantity);
    }

    @Override
    public void calcTaxLevied() {
        setTaxLevied(0.125 * getPrice());
        calcTotalPrice();
    }

    @Override
    public String getItemType() {
        return "RAW";
    }
}
