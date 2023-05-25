import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        //This statement evaluates the user's choice and performs different actions based on the chosen option.
        while(flag){
            printActions();
            switch(Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }
//method: This method is responsible for adding items to the "groceries" list.
    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        for(String i: items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) < 0)
            groceries.add(trimmed);
        }
    }
//method: This method is responsible for removing items from the "groceries" list.
    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");

        for(String i: items){
            String trimmed = i.trim();
            groceries.remove(trimmed);

        }
    }
 /*method: This method displays the available actions to the user.*/
    private static void printActions(){
        String textBlock = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }
}



////
