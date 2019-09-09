package Exercise;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList <String> groceries= new ArrayList<String>();

    public void addToList(String item){
        this.groceries.add(item);
    }
    public void printGroceries(){
        System.out.println("you have " + this.groceries.size() + " items");
        for(int i =0; i<this.groceries.size(); i++){
            System.out.println(i+1 + " : " + this.groceries.get(i));
        }
    }
    public void modifyItem(String item, int position){
        this.groceries.set(position, item);
        System.out.println("Added " + item+ " at position "+ position+1);
    }
    public void removeItem (int position){
        this.groceries.remove(position);
    }
    public String findItem (String item){
        int position = this.groceries.indexOf(item);
        if(position>=0){
            return this.groceries.get(position);
        }
        return null;
    }







}
