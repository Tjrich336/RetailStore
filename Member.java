/*
 * The Member class holds the methods for the members, this class sets what a member entails.
 * This class determines the information needed from the user and adds them to the member list.
 */

/*
 * @author, Trevor Richardson
 * @version, Fall 22
 */


public class Member {
    private String firstName;
    private String lastName;
    private double moneySpent;
    private boolean isPaid;
    private boolean isPremiumMember;
    private String paymentMethod;

    /*
     * Method that gives the "Member" specifications.
     * @param, "String firstName" = member's first name.
     * @param, "String lastName" = member's last name.
     * @param, "double moneySpent" = total amount of money spent on membership.
     * @param, "boolean isPaid" = true/false has membership been paid.
     * @param, "boolean isPremiumMember" = true/false is a premium member.
     * @param, "String payMethod" = records member payment method.
     */
    public Member (String firstName, String lastName, double moneySpent, boolean isPaid, boolean isPremiumMember, String payMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.moneySpent = moneySpent;
        this.isPaid = isPaid;
        this.isPremiumMember = isPremiumMember;
    }

    /*
     * Method that retrieves the customer's first name.
     * @return, "firstName" = returns the customer's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /*
     * Method that retrieves the customer's last name.
     * @return, "lastName" = returns the customer's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /*
     * Method that retrieves the money spent on a membership.
     * @return, "moneySpent" = returns the amount the customer has spent on a membership if applicable.
     */
    public double getMoneySpent() {
        return moneySpent;
    }

    /*
     * Method that determines if the membership fee has been paid.
     * @return, "isPaid" = true/false if the membership was paid.
     */
    public boolean isPaid() {
        return isPaid;
    }

    /*
     * Method that determines if the customer is a premium member.
     * @return, "isPremiumMember()" = true/false whether the customer is a premium member.
     */
    public boolean isPremiumMember() {
        return isPremiumMember();
    }

    /*
     * Method that holds a customer's payment method.
     * @return, "paymentMethod" = credit/debit depending on membership status.
     */
    public String paymentMethod() {
        return paymentMethod;
    }

    /*
     * Method that determines if the memebership fee has been paid.
     * @param, "boolean isPaid" = true/false depending on membership status.
     */
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    /*
     * Method that determines if a customer is a premium member.
     * @param, "boolean isPremiumMember" = true/false depending on membership status.
     */
    public void setIsPremiumMember(boolean isPremiumMember) {
        this.isPremiumMember = isPremiumMember;
    }

    /*
     * Method that determines if a customer has a saved payment method.
     * @param, "String paymentMethod" = sets payment method depending on membership status.
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /*
     * Method that displays the customer's information.
     * @return, prints the member's first and last name, amount of money spent, if the membership has been paid, whether they are a premium member or not, and their payment method if applicable.
     */
    public String toString() {
        return "Customer (" + "Name: " + firstName + " " + lastName + ", Money Spent: " + String.format("$%,.2f", getMoneySpent()) + ", Membership Paid: " + isPaid + ", Premium Member: " + isPremiumMember + ", Payment Method: " + paymentMethod + ")";
    }
}