/*
 * The main class is the test class, this class is what the user interacts with and contains the menu.
 * This class calls from other classes in order to call inventory information and store user input.
 */

/*
 * @author, Trevor Richardson
 * @version, Fall 22
 */


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class main extends RetailStore{ // Saves as main
    public static void main(String[] args) {
    
    try {
    // Initializes objects and variables.
    Product i = new Product() {};
    Scanner sc = new Scanner(System.in);
    double bPrice = 0.0;
    double cdPrice = 0.0;
    double dvdPrice = 0.0;
    int quantity = 0;
    int choice = 0;
    int choice1 = 0;
    int bookSales = 0;
    int cdSales = 0;
    int dvdSales = 0;
    int bookStock = 0;
    int cdStock = 0;
    int dvdStock = 0;
    String line = " ";
    
    
    ArrayList<Member> members = new ArrayList<>();
    ArrayList<PremiumMember> premiumMembers = new ArrayList<>();
    ArrayList<Member> newMembers = new ArrayList<>();
  
    try {
      Scanner fileScanner = new Scanner (new File("RetailInventory.csv"));
      
       while(fileScanner.hasNext()) {
           line = fileScanner.nextLine();
           String[] words = line.split(",");
              if (words[0].equals("Book")) {
                inventory.add(new Book(words[1], Integer.valueOf(words[2]), Double.valueOf(words[3]), words[4], Integer.valueOf(words[5])));
              }
              else if (words[0].equals("CD")) {
                inventory.add(new CD(words[1], Integer.valueOf(words[2]), Double.valueOf(words[3]), words[4], Integer.valueOf(words[5])));
              }
              else if (words[0].equals("DVD")) {
                inventory.add(new DVD(words[1], Integer.valueOf(words[2]), Double.valueOf(words[3]), words[4], Integer.valueOf(words[5])));
              }
       }
       fileScanner.close();
      }
      catch (FileNotFoundException ex) {
        System.out.println("Caught FileNotFoundException for RetailInventory.csv, Try again making sure the file name and path are correct.");
      }
      catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Caught ArrayIndexOutOfBoundsException for RetailInventory.csv, Try again and enter all required product fields.");
      }

    //Start Menu Display
  try {
    while (choice != 7) {
        System.out.println("Welcome to the onlinen Retailstore!");
        System.out.println("");
        System.out.println("Please select your desired option: ");
        System.out.println("\t 1. Make a purchase: ");
        System.out.println("\t 2. View the catalog: ");
        System.out.println("\t 3. Check membership status: ");
        System.out.println("\t 4. Restock inventory: ");
        System.out.println("\t 5. Total inventory value: ");
        System.out.println("\t 6. Compare products: ");
        System.out.println("\t 7. Exit the application: ");

      int menuNum = sc.nextInt();
  
      // Option 1: Make a purchase
      switch (menuNum) {
        case 1 :
          System.out.println("Which of the following would you like to purchase?");
          System.out.println("Enter the product's order number! (i.e 1,2,3) ");
          i.display();
          boolean correctItem = false;
                    try {
                        while (!correctItem) {
                            System.out.println(" ");
                            int itemChoice = sc.nextInt();
                            if (itemChoice == 1) {
                                System.out.println("Product quantity: ");
                                int pcount = sc.nextInt();
                                correctItem = true;
                                bPrice = i.getProduct(1972).getPrice() * pcount;
                                i.getProduct(1972).setStock(i.getProduct(1972).getStock() - pcount);
                              }
                            else if (itemChoice == 2) {
                                System.out.println("Product quantity: ");
                                int pcount = sc.nextInt();
                                correctItem = true;
                                cdPrice = i.getProduct(1233).getPrice() * pcount;
                                i.getProduct(1233).setStock(i.getProduct(1233).getStock() - pcount);
                              }
                            else if (itemChoice == 3) {
                                System.out.println("Product quantity: ");
                                int pcount = sc.nextInt();
                                correctItem = true;
                                dvdPrice = i.getProduct(1351).getPrice() * pcount;
                                i.getProduct(1351).setStock(i.getProduct(1351).getStock() - pcount);
                              }

                            System.out.println("Would you like to continue shopping? (Yes or No) ");
                            String shop = sc.next();
                              if (shop.equalsIgnoreCase("Yes")) {
                                
                              } 
                              else if (shop.equalsIgnoreCase("No")) {
                                double total = (bPrice + cdPrice + dvdPrice);
                                System.out.println("Your total is: $ " + total);
                                System.out.println("Thank you for your purchase! ");
                                System.out.println("");
                              }
                        }
                      }
                      catch (InputMismatchException ex) {
                        System.out.println("Enter an integer: ");
                        System.out.println("Try again!");
                        System.out.println("");
                        sc.nextLine();
                      }
        break;

        // Option 2: View Inventory 
        case 2 :
          i.display();
          System.out.println("");
          if (i.getSize() <= 0) {
              System.out.println("Items are currently out of stock :(");
              System.out.println("");
          }
        break;
        
        // Option 3: Check Member Status
        case 3 :
          PremiumMember pm1 = new PremiumMember("Trevor", "Richardson", 12.99, true, true, "Credit");
          pm1.setPaymentMethod("Credit");
          premiumMembers.add(pm1);
          PremiumMember pm2 = new PremiumMember("Susan", "Johnson", 18.97, true, true, "Debit");
          pm2.setPaymentMethod("Debit");
          premiumMembers.add(pm2);
          Member m1 = new Member("John", "Smith", 49.97, false, false, "Credit");
          m1.setPaymentMethod("Credit");
          members.add(m1);

        try {
          System.out.println("Please Choose your desired option: ");
          System.out.println("\t 1. Trevor Richardson");
          System.out.println("\t 2. Susan Johnson");
          System.out.println("\t 3. John Smith");
          System.out.println("\t 4. Become a member: ");
          int memberChoice = sc.nextInt();

          if (memberChoice == 1) {
            System.out.println(pm1);
            System.out.println("");
          }
          else if (memberChoice == 2) {
            System.out.println(pm2);
            System.out.println("");
          }
          else if (memberChoice == 3) {
            System.out.println(m1);
            System.out.println("");
          }
          else if (memberChoice == 4) {
            System.out.println("Enter your first name: ");
            String firstName = sc.next();
            System.out.println("Enter your last name: ");
            String lastName = sc.next();
            System.out.println("Choose your payment method: (Credit/Debit)");
            String pm = sc.next();
            System.out.println("Would you like to become a premium member? (Yes or No)");
            String account = sc.next();
          
            if (account.equalsIgnoreCase("Yes")) {
              System.out.println("Premium members are charged a monthly fee of: $12.99");
              double fee = 12.99;
              System.out.println("");

              if (pm.equalsIgnoreCase("Credit") || pm.equalsIgnoreCase("Debit")) {
                PremiumMember a = new PremiumMember(firstName, lastName, fee, true, true, "");
                a.setPaymentMethod(pm); 
                premiumMembers.add(a);
                newMembers.add(a);
                System.out.println(a);
                System.out.println("");
              }
            }
            else if (account.equalsIgnoreCase("No")) {
              Member a = new Member(firstName, lastName, 0.00, false, false, "");
              a.setPaymentMethod(pm);
              members.add(a);
              newMembers.add(a);
              System.out.println(a);
              System.out.println("");
            }
          }
        }
        catch (InputMismatchException ex) {
          System.out.println("Enter an integer 1 - 4");
                System.out.println("Try again!");
                System.out.println("");
                sc.nextLine();
        }
          break;

          // Option 4: Restock Inventory
          case 4 : 
            i.display();
            int idStock = 0;
            System.out.println("");
            System.out.println("Enter the item's ID number: ");
            try {
              idStock = sc.nextInt();
                if (idStock == i.getProduct(idStock).getID()) {
                    System.out.println("Enter the quantity of items being input: ");
                    quantity = sc.nextInt();
                    i.restockProduct(idStock, quantity);
                    i.display();
                }
              }
              catch (InputMismatchException ex) {
                System.out.println("Enter an integer");
                System.out.println("Try again!");
                System.out.println("");
                sc.nextLine();
              }
          break;

          // Option 5: Total Inventory Value
          case 5 :
            System.out.println("The total value of the inventory is: $ " + i.inventoryValue());
          break;

          // Option 6: Compare Products
          case 6 : 
            i.display();
           try {
            System.out.println("Enter the first product's ID number: ");
            choice = sc.nextInt();
            System.out.println("Enter the second product's ID number: ");
            choice1 = sc.nextInt();
          
            int a = 0;
            for (int b = 0; b <= i.getSize(); b++) {
              if (choice == i.getProduct(b).getID()) {
                a = b;
                b += i.getSize();
              }
            }

            int c = 0;
            for (int d = 0; d <= i.getSize(); d++) {
              if (choice1 == i.getProduct(d).getID()) {
                c = d;
                d += i.getSize();
              }
            }

            int compared = i.getProduct(a).compareTo(i.getProduct(c));
                    if (compared == -1) {
                        System.out.println("Product one is less expensive than product two.");
                    } 
                    else if (compared == 1) {
                        System.out.println("Product one is more expensive than product two.");
                    } 
                    else {
                        System.out.println("Product one and two are the same price.");
                    }
             }
             catch (InputMismatchException ex) {
             System.out.println("Enter an integer");
             System.out.println("Try again!");
             System.out.println("");
             sc.nextLine();
             }
          break;

          // Option 7: Exit the application
          case 7 :
            try {
              FileOutputStream fs = new FileOutputStream("RetailInventoryDay2.csv");
              PrintWriter outFS = new PrintWriter(fs);

              outFS.println("End of day product specification: ");
              outFS.println(" ");

                for (Product p : inventory) {
                  if (p instanceof Book) {
                    outFS.println("Book," + p.printOut());
                  }  
                  else if (p instanceof CD) {
                    outFS.println("CD," + p.printOut());
                  }
                  else if (p instanceof DVD) {
                    outFS.println("DVD," + p.printOut());
                  }
                }

              outFS.close();
              fs.close();
            }
            catch (FileNotFoundException ex) {
              System.out.println("Caught FileNotFoundException for RetailInventoryDay2.csv, Try again making sure the file name and path are correct.");
            }
            catch (IOException ex) {
              System.out.println("Caught IOException when closing output stream. Try again.");
            }

            try {
              FileOutputStream fr = new FileOutputStream("DailyReport.txt");
              PrintWriter outFR = new PrintWriter(fr);

              outFR.println("Daily Report: ");
              outFR.println(" ");

              outFR.println("Daily Sales: ");
              outFR.println("*** Will Return Negative If Products Are Restocked ***");
              outFR.println("");
              try {
                Scanner fileScanner2 = new Scanner (new File("RetailInventory.csv"));
                 while(fileScanner2.hasNext()) {
                     line = fileScanner2.nextLine();
                     String[] words = line.split(",");

                        if (words[0].equals("Book")) {
                          bookStock = Integer.valueOf(words[5]);
                          bookSales = bookStock - i.getProduct(1972).getStock();
                        }
                        else if (words[0].equals("CD")) {
                          cdStock = Integer.valueOf(words[5]);
                          cdSales = cdStock - i.getProduct(1233).getStock();
                        }
                        else if (words[0].equals("DVD")) {
                          dvdStock = Integer.valueOf(words[5]);
                          dvdSales = dvdStock - i.getProduct(1351).getStock();
                        }
                  }
                  int totalSales = bookSales + cdSales + dvdSales;
                  outFR.println("\t" + "Total Sales: " + totalSales + " unit(s)");
                  outFR.println("");
                  outFR.println("\t" + "\t" + "Book Sales: " + bookSales + " unit(s)");
                  outFR.println("");
                  outFR.println("\t" + "\t" + "CD Sales: " + cdSales + " unit(s)");
                  outFR.println("");
                  outFR.println("\t" + "\t" + "DVD Sales: " + dvdSales + " unit(s)");
                  outFR.println("");
                }
              catch (FileNotFoundException ex) {
                System.out.println("Caught FileNotFoundException for BookInventory.csv, Try again making sure the file name and path are correct.");
              }

              outFR.println("Revenue: ");
              outFR.println("*** Will Return Negative If Products Are Restocked ***");
              outFR.println("");
                double bookRevenue = bookSales * i.getProduct(1972).getPrice();
                double cdRevenue = cdSales * i.getProduct(1233).getPrice();
                double dvdRevenue = dvdSales * i.getProduct(1351).getPrice();
                double revenue = bookRevenue + cdRevenue + dvdRevenue;

                outFR.println("\t" + "Total Revenue: " + "$" + revenue);
                  outFR.println("");
                  outFR.println("\t" + "\t" + "Book Revenue: " + "$" + bookRevenue);
                  outFR.println("");
                  outFR.println("\t" + "\t" + "CD Revenue: " + "$" + cdRevenue);
                  outFR.println("");
                  outFR.println("\t" + "\t" + "DVD Revenue: " + "$" + dvdRevenue);
                  outFR.println("");

              outFR.println("Product specifications: ");
              outFR.println("");
              for (Product p : inventory) {
                outFR.println("\t" + p);
                outFR.println("");
              }
              outFR.println("New members: ");
              outFR.println("");
                for(Member m : newMembers) {
                  if (!newMembers.isEmpty()) {
                    outFR.println("\t" + m);
                    outFR.println("");
                  }
                }
                  if (newMembers.isEmpty()) {
                    outFR.println("\t" + "No new members today :(");
                    outFR.println("");
                  }
                
              outFR.close();
              fr.close();
            }
            catch (FileNotFoundException ex) {
              System.out.println("Caught FileNotFoundException for DailyReport.txt, Try again making sure the file name and path are correct.");
            }
            catch (IOException ex) {
              System.out.println("Caught IOException when closing output stream. Try again.");
            }

            System.out.println("You have successfully exited the application!");
            System.exit(0);
          break;  
      }
    }
  }
  catch (InputMismatchException ex) {
    System.out.println("Enter an integer 1 - 7");
                System.out.println("Try again!");
                System.out.println("");
  }
    sc.close();
  }
    catch (Exception ex) {
      System.out.println("Something went wrong, try again!");
    }
  }
}