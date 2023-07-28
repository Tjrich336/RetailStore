/*
 * The CD class holds the methods for the cd product.
 * This class holds the cd's (parameters/specifications) and their toString statement.
 */

/*
 * @author, Trevor Richardson
 * @version, Fall 22
 */


public class CD extends Product{
    
    /*
     * Method that gives the CD product specifications.
     * @param, "String sequence" = Number that corresponds to the CD's location in the inventory catalog.
     * @param, "int productID" = ID intially given to the CD.
     * @param, "double price" = The CD's unit price.
     * @param, "String description" = Contains the CD's name.
     */
    public CD(String sequence, int ID, double price, String description, int stock){
        super(sequence, ID, price, description, stock);
    }

    /*
     * Method that sets what information is printed for the CD item.
     * @return, prints the CD's number on the inventory list, ID number, name/title, and it's unit price.
     */
    @Override
    public String toString (){  
        return getSequence() + "." + " CD || ID: " + getID() + ", " + "Description: " + getDescription() + ", " + "Price: $" + getPrice() + ", " + "Stock: " + getStock() + " unit(s)" + "\t";
    }
}
