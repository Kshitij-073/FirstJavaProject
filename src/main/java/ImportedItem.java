public class ImportedItem extends Item {
    public ImportedItem(){}

    public ImportedItem(String name , Double price, int quantity){
        super(name , price , quantity);
    }

    @Override
    public void calcTaxLevied() {
      setTaxLevied(0.1 * getPrice());
      double surchargeApplied = 0;
      if (getTaxLevied() <= 100) {
          surchargeApplied = 5;
      }
      else if (getTaxLevied() > 100 && getTaxLevied() <= 200){
          surchargeApplied = 10;
      }
      else{
          surchargeApplied = 0.5 * getPrice();
      }
      setTaxLevied(getTaxLevied() + surchargeApplied);
      calcTotalPrice();
    }

    @Override
    public String getItemType() {
        return "IMPORTED";
    }
}
