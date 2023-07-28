/*
 * The PremiumMember class inherits from the Member class (Parent Class), entails what a premium member is.
 * This class determines the information needed from the user and adds them to the premiumMember list.
 */

/*
 * @author, Trevor Richardson
 * @version, Fall 22
 */


public class PremiumMember extends Member {
    private String firstName;
    private String lastName;
    private double moneySpent;
    private boolean isPaid;
    private boolean isPremiumMember;
    private String paymentMethod;

    /*
     * Method that gives the "PremiumMember" specifications.
     * @param, "String firstName" = member's first name.
     * @param, "String lastName" = member's last name.
     * @param, "double moneySpent" = total amount of money spent on membership.
     * @param, "boolean isPaid" = true/false has membership been paid.
     * @param, "boolean isPremiumMember" = true/false is a premium member.
     * @param, "String payMethod" = records member payment method.
     */
    public PremiumMember(String firstName, String lastName, double moneySpent, boolean isPaid, boolean isPremiumMember, String payMethod) {
        super(firstName, lastName, moneySpent, isPaid, isPremiumMember, payMethod);
        this.firstName = firstName;
        this.lastName = lastName;
        this.moneySpent = moneySpent;
        this.isPaid = isPaid;
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
    @Override
    public String toString() {
        return "Customer (" + "Name: " + firstName + " " + lastName + ", Money Spent: " + String.format("$%,.2f", getMoneySpent()) + ", Membership Paid: " + isPaid + ", Premium Member: " + isPremiumMember + ", Payment Method: " + paymentMethod + ")";
    }
}