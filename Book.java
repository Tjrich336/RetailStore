/*
 * The Book class holds the methods for the book product.
 * This class holds the book's (parameters/specifications) and their toString statement.
 */

/*
 * @author, Trevor Richardson
 * @version, Fall 22
 */


public class Book extends Product{
    
    /*
     * Method that gives the book product specifications.
     * @param, "String sequence" = Number that corresponds to the book's location in the inventory catalog.
     * @param, "int productID" = ID intially given to the book.
     * @param, "double price" = The book's unit price.
     * @param, "String description" = Contains the book's name.
     */
    public Book(String sequence, int ID, double price, String description, int stock){
        super(sequence,ID, price, description, stock);
    }
    
    /*
     * Method that sets what information is printed for the book item.
     * @return, prints the book's number on the inventory list, ID number, name/title, and it's unit price.
     */
    @Override
    public String toString(){
        return getSequence() + "." + " Book || ID: " + getID() + ", " + "Description: " + getDescription() + ", " + "Price: $" + getPrice() + ", " + "Stock: " + getStock() + " unit(s)" + "\t";
    }
}
