/**
 * Created by jc282222 on 12/09/16.
 */
import java.util.*;
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();
        item1.setInvoice(5555);
        item1.setDescription("Biscuit dog food");
        item1.setPrice(29.99);
        item2.setInvoice(6666);
        item2.setDescription("Sausage dog food");
        item2.setPrice(5.99);
        pet1.setInvoice(3333);
        pet1.setDescription("Standard poodle");
        pet1.setPrice(639.99);
        pet1.setIsVaccinated(true);
        pet1.setIsNeutered(true);
        pet1.setIsHousebroken(false);
        pet2.setInvoice(4444);
        pet2.setDescription("Jack Russel pup");
        pet2.setPrice(129.99);
        pet2.setIsVaccinated(true);
        pet2.setIsNeutered(false);
        pet2.setIsHousebroken(true);
        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }

    public static void display(ItemSold item) {
        System.out.println("Invoice #" + item.getInvoice());
        System.out.println("     Description: " + item.getDescription());
        System.out.println("     Price: $" + item.getPrice());
    }

    public static void displayPetData(PetSold item) {
        System.out.println("     Vaccinated is " + item.getIsVaccinated());
        System.out.println("     Neutered is " + item.getIsNeutered());
        System.out.println("     Housebroken is " + item.getIsHousebroken());
    }
}