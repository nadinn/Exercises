package Exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
//        cities.add("Bath");
//        cities.add("Preston");
//        cities.add("York");
//        cities.add("Swansea");
//        cities.add("Newport");
//        cities.add("Inverness");
//        cities.add("Derby");
//        cities.add("Aberdeen");
//        printCities(cities);

        addInOrder(cities,"London");
        addInOrder(cities,"Bath");
        addInOrder(cities,"Preston");
        addInOrder(cities,"York");
        addInOrder(cities,"Swansea");
        addInOrder(cities,"Newport");
        addInOrder(cities,"Inverness");
        addInOrder(cities,"Derby");
        addInOrder(cities,"Aberdeen");
        printCities(cities);


    }
    // method for printing elements in a LinkedList using an Iterator
    public static void printCities(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Printing city: " + i.next());
        }
        System.out.println("=======End of list=======");
    }

    // method for adding new elements to a LinkedList in alphabetical order using a ListIterator
    public static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int compareCity = stringListIterator.next().compareTo(newCity);
            if (compareCity == 0) {
                System.out.println("This city is already present ");
                return false;
            } else if (compareCity > 0) {
                stringListIterator.previous(); // if the new city comes before the present one we go back to the original position since .next() has moved the pointer
                stringListIterator.add(newCity);
                return true;
            } else if (compareCity < 0) {
                // if the new city does not come before the present one then do nothing
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

}
