package Exercise;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> itemList = new LinkedList<String>();
        itemList.add("item 1 ");
        itemList.add("item 2 ");
        itemList.add("item 3 ");
        itemList.add("item 4 ");
        itemList.add("item 5 ");

        itemList.add(1, "item 1.5");
        printList(itemList);


    }
    private static void printList(LinkedList<String> myList){
        Iterator<String> ite =myList.iterator();
        while (ite.hasNext()){
            System.out.println("printing: " + ite.next()); // .next() returns the current value before moving on to the next value
        }
        System.out.println("end of items");


    }
}
