/*
 * The Product class holds the methods for the products.
 * This class holds the products and (parameters/specifications) as well as their specified arrayLists'.
 */

/*
 * @author, Trevor Richardson
 * @version, Fall 22
 */


public abstract class Product extends RetailStore implements Comparable{
    
    private int productID = 0;
    private String description = "";
    private double price = 0.0;
    private String purchaseItems;
    private int stock = 0;
    private String sequence = "";
    public Product() {}

    /*
     * Method that sets the parameters for the products.
     * @param, "String sequence" = number that corresponds to the items place in the inventory catalog.
     * @param, "int productID" = ID intially given to the individual product.
     * @param, "double price" = Product's unit price.
     * @param, "String description" = contains the product's name.
     */
    public Product(String sequence, int productID, double price, String description, int stock){
        this.sequence = sequence;
        this.productID = productID;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    /*
     * Method that retrieves an items ID number
     * @return, "productID" = returns the items ID.
     */
    public int getID(){
        return productID;
    }

    /*
     * Method that retrieves the items the user has purchased.
     * @return, "purchaseItems" = returns the customer's purchased items.
     */
    public String getPurchaseItems(){
        return purchaseItems;
    }
    
    /*
     * Method that retrieves an item's price.
     * @return, "price" = returns the item's unit price.
     */
    public double getPrice(){
        return price;
    }

    /*
     * Method that sets an item's price.
     * @param, "price" = an item's price.
     */
    public void setPrice(double price){
        this.price = price;
    }

    /*
     * Method that retrieves the item's name.
     * @return, "getDescription" = returns the item's name/title.
     */
    public String getDescription(){
        return description;
    }

    /*
     * Method that retrieves an item's stock.
     * @return, "stock" = returns an item's stock quanitity.
     */
    public int getStock(){
        return stock;
    }

    /*
     * Method that sets an item's stock.
     * @param, "stock" = sets an item's stock.
     */
    public void setStock(int stock){
        this.stock = stock;
    }

    /*
     * Method that compares one product to another.
     * @param, "Object t" = original object being compared to.
     * @return, "-1" = less than.
     * @return, "1" = more than.
     * @return, "0" = equal to.
     */
    @Override
    public int compareTo(Object t){
        if (((Product) t).getPrice() > this.getPrice()) {
            return -1;
        } else if (((Product) t).getPrice() < this.getPrice()) {
            return 1;
        }
        return 0;
    }

    /*
     * Method that retrieves the items sequence number in the catalog display.
     * @param, "String sequence" = the items order display number.
     * @return, "sequence" = returns the item whose number was entered.
     */
    public String getSequence(){
        return sequence;
    }

    /*
     * Method that prints out product specification in specific format in "BookInventoryDay2.csv"
     * @return, prints the item's sequence number, ID number, name/title, price, and stock.
     */
    public String printOut(){
        return getSequence() + "," + getID() + "," + getPrice() + "," + getDescription() + "," + getStock();
    }

    /*
     * Method that sets what information is printed for each item.
     * @return, prints the item's ID number, name/title, unit price, and stock.
     */
    public String toString(){
        return "Product: " + ", ID: " + getID() + ", " + getDescription() + ", " + getPrice() + ", " + getStock();
    }
}