package Exercise;

import java.util.Scanner;

public class GroceryListTest {
    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceries = new GroceryList();

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }
    public static void addItem(){
        System.out.println("enter item");
        groceries.addToList(sc.nextLine());

    }
    public static void modifyItem(){
        System.out.println("enter position");
        int position = sc.nextInt();
        sc.nextLine();
        System.out.println("enter replacement item");
        String newItem = sc.nextLine();
        groceries.modifyItem(newItem, position-1);
    }
    public static void searchItem(){
        System.out.println("what item");
        String searchedItem= sc.nextLine();
        if (groceries.findItem(searchedItem)!= null){
            System.out.println( searchedItem+" found in list");
        } else
            System.out.println(searchedItem + " not in list");

    }

    public static void main (String args[]){
        boolean exit = false;
        int choice = 0;
        printInstructions();
        while (!exit){
            System.out.println("what do you want to do");
            choice= sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    groceries.printGroceries();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 5 :
                    searchItem();
                    break;
                case 6 :
                    exit= true;
                    break;
            }

        }
    }





}
