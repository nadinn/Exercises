package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {
       ISaveable mario = new Player("Mario",15,100);
        System.out.println(mario.toString());
        saveObject(mario);

        ((Player)mario).setHitPoints(20); // casting mario as Player class to access methods from there
        System.out.println(mario.toString());
        ((Player)mario).setWeapon("Axe");
        saveObject(mario);
        //loadObject(mario);
        System.out.println(mario);


        Monster werewolf = new Monster("Werewolf", 13, 200);
        System.out.println(werewolf);
        saveObject(werewolf);

    }


// method for reading values as if from I/O
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i= 0; i<objectToSave.write().size(); i++){
            System.out.println("saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
