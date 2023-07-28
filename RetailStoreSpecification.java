/*
 * The RetailStoreSpecification class is the interface that is used by the RetailStore class.
 * This class holds the "restockProduct()" and "inventoryValue()" methods.
 */

 
/*
 * @author, Trevor Richardson
 * @version, Fall 22
 */


public interface RetailStoreSpecification {

    /*
     * RetailStoreSpecificationo interface method that allows the vendor to update inventory quantity.
     * Allows vendor to input product ID then enter the quanitity wished to add to the inventory.
     */
    public void restockProduct(int id, int stock);

    /*
     * RetailStoreSpecification interface method that calculates the inventories' value.
     * Based on quantity and price per product.
     */
    public double inventoryValue();
    
}