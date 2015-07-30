package preTrainee;

public class StorageUtils {

    public static double calculateAveragePrice(Storage storage) {
        double totalPrice = 0;
        for(Product product : storage){
            totalPrice += product.getPriceProduct() * product.getTotalAmount();
        }
        return totalPrice / storage.count();
    }
}
