
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class ARRAY {

  public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        while (true) {
        System.out.println("___________________________");
        System.out.print("\tENTER NUMBER: ");
        int number = scanner.nextInt();
        
            System.out.println("\n\tOPTIONS");
            System.out.println("\t[1] INSERT TO ARRAY");
            System.out.println("\t[2] INSERT TO LINKED LIST");
            
            System.out.print("\n\tCHOICE: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                array.add(0, number); 
                System.out.print("\tARRAY AFTER INSERTION: ");
                System.out.println(array);
            } else if (choice == 2) {
                linkedList.addFirst(number); 
                System.out.print("\tLINKED LIST AFTER INSERTION: ");
                printLinkedList(linkedList);
            } else {
                System.out.println("\tInvalid choice. Try again.");
                System.out.println("___________________________");
                continue;
            }

            System.out.print("\tPROCEED? (Y/N): ");
            char proceed = scanner.next().charAt(0);
            if (proceed == 'N' || proceed == 'n') {
            System.out.println("\tEND OF THE PROGRAM\n");
            System.out.println("___________________________");
                break;
            }

            System.out.println("___________________________");
        }
        scanner.close();
    }

    
    private static void printLinkedList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println("-NULL");
    }

  

}