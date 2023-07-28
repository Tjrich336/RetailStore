/*
 * The DVD class holds the methods for the dvd product.
 * This class holds the dvd's (parameters/specifications) and their toString statement.
 */

/*
 * @author, Trevor Richardson
 * @version, Fall 22
 */


public class DVD extends Product{

    /*
     * Method that gives the DVD product specifications.
     * @param, "String sequence" = Number that corresponds to the DVD's location in the inventory catalog.
     * @param, "int productID" = ID intially given to the DVD.
     * @param, "double price" = The DVD's unit price.
     * @param, "String description" = Contains the DVD's name.
     */
    public DVD(String sequence, int ID, double price, String description, int stock){
        super(sequence, ID, price, description, stock);
    }
    
    /*
     * Method that sets what information is printed for the DVD item.
     * @return, prints the DVD's number on the inventory list, ID number, name/title, and it's unit price.
     */
    @Override
    public String toString (){  
        return getSequence() + "." + " DVD || ID: " + getID() + ", " + "Description: " + getDescription() + ", " + "Price: $" + getPrice() + ", " + "Stock: " + getStock() + " unit(s)" + "\t";
    }
}