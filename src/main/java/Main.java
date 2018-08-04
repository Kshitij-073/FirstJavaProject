import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Item> itemList = new ArrayList<>();
        ItemAddEntry itemToAdd = new ItemAddEntry();
        Scanner reader = new Scanner(System.in);
        Boolean isContinue = true;
        char tryAgain;

        if (args.length > 1) {
            for(int i = 0 ; i < args.length ; i++){
                String name = args[0];
                Double price = Double.parseDouble(args[1]);
                Integer qty = Integer.parseInt(args[2]);
                String type = args[3];

                itemList.add(itemToAdd.createItem(name , price , qty , type));
            }
        }

        System.out.print("Do you want to continue (Y/N)? ");
        tryAgain = reader.next(".").charAt(0);

        while(isContinue == true){
            if (tryAgain == 'N' || tryAgain == 'n'){
                isContinue = false;
            }
            itemList.add(itemToAdd.createItem());
        }

        if (itemList.size() > 0) {
            //print all items
            printAllItems(itemList);

        }


}

       public static void printAllItems(List<Item> items){
           for(Item item: items){
               System.out.println("name -" + item.getName());
               System.out.println("price -" + item.getPrice());
               System.out.println("tax levied -" + item.getTaxLevied());
               System.out.println("total price is -" + item.getTotalPrice());
           }
    }
}
