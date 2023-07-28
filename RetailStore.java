/*
 * The RetailStore class stores the methods for the inventory ArrayList and initializes the remaining ArrayLists.
 */

/*
 * @author, Trevor Richardson
 * @version, Fall 22
 */

import java.util.ArrayList;
public class RetailStore implements RetailStoreSpecification{ // Saves as "BookStore.java"

    static ArrayList<Product> inventory = new ArrayList<>();
    
    /*
     * Method that removes a purchased product from inventory.
     * @param, "int id" = the product's ID number.
     * @return, "true" = removes product from the inventory.
     * @return, "false" = does not remove product from the inventory.
     */
    public boolean removeProduct(int id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (id == inventory.get(i).getID()) {
                inventory.remove(inventory.get(i));
                return true;
            }
        }
        return false;
    }

    /*
     * Method that retrieves the inventory's size.
     * @return, "inventory.size()" = inventory size.
     */
    public int getSize() {
        return inventory.size();
    }

    /*
     * Method that displays the inventory catalog.
     * Counts from the first item in the catalog to the last and then displays all available products.
     */
    public void display() {
        System.out.println("");
        System.out.println("Catalog");
        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i));
        }
    }

    /*
     * Method that returns the specified product from the inventory ArrayList.
     * @param, "int id" = the product's ID number.
     * @return, "inventory.get(id)" = gets the specific product from the inventory ArrayList.
     */
    public Product getProduct(int id){
        for (int i = 0; i < inventory.size(); i ++){
            if (id == inventory.get(i).getID()){
                return inventory.get(i);
            }
        }
        return inventory.get(id);
    }

    /*
     * Method that restocks products.
     * @param, "int id" = the product's ID number.
     * @param, "int quantitiy" = the number of items the vendor would like to add to the item's stock.
     */
    @Override
    public void restockProduct(int id, int quanitity){
        for (int i = 0; i < inventory.size(); i++){
            if (id == inventory.get(i).getID()){
                inventory.get(i).setStock(quanitity + inventory.get(i).getStock());
            }
        }
    }

    /*
     * Method that calculates the inventories' total value based on a product's price and quantity.
     * @return, "totalValue" = returns the inventories' total value calculated from the (for loop).
     */
    @Override
    public double inventoryValue(){ 
            double bookTotal = 0.0;
            double cdTotal = 0.0;
            double dvdTotal = 0.0;
        for (int i = 0; i < inventory.size(); i++){
            bookTotal = inventory.get(0).getStock() * inventory.get(0).getPrice();
            cdTotal = inventory.get(1).getStock() * inventory.get(1).getPrice();
            dvdTotal = inventory.get(2).getStock() * inventory.get(2).getPrice();
        }
        return bookTotal + cdTotal + dvdTotal;
    }
}