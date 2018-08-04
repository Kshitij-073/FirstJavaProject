
public class ItemCreator {

    public Item returnItem(Integer type){
        switch (type){
            case 0:
                return new RawItem();

            case 1:
                return new ManuItem();

            case 2:
                return new ImportedItem();

                default:
                    return new RawItem();
        }
    }
}
