import java.util.Scanner;

public class ItemAddEntry {

    Scanner scanner;
    ItemCreator itemCreator;

    public ItemAddEntry(){
        scanner =  new Scanner(System.in);
        itemCreator = new ItemCreator();
    }

    public Item createItem(String name , double price , Integer quantity , String type){
        Item item = itemCreator.returnItem(getType(type));
        item.setName(name);
        item.setPrice(price);
        item.setQuantity(quantity);
        item.calcTaxLevied();
        return item;
    }

    public Item createItem(){
        Item item = itemCreator.returnItem(getType());
        item.setName(getItemName());
        item.setPrice(getItemPrice());
        item.setQuantity(getItemQuantity());
        item.calcTaxLevied();
        return item;
    }

    public Integer getType(String type){
        return  Integer.parseInt(type);
    }

    public Integer getType(){
        System.out.print("Enter item type [0- RAW, 1-MANUFACTURED, 2-IMPORTED]: ");
        String type = scanner.nextLine() ;
        return Integer.parseInt(type);
    }

    public String getItemName(){
        System.out.print("Enter name of item: ");
        String name = scanner.nextLine() ;
        return name;
    }

    public String getItemPrice(){
        System.out.print("Enter Price of Item: ");
        String price = scanner.nextLine() ;
        return Double.parseDouble(price) ;

    }

    public String getItemQuantity(){
        System.out.print("Enter quantity of item: ");
        String qty = scanner.nextLine() ;
        return Integer.parseInt(qty);
    }

}
