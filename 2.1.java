import java.util.*;
public class StringListOperations {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 List<String> stringList = new ArrayList<>();
 
 while (true) {
 System.out.println("\n1. Insert");
 System.out.println("2. Search");
 System.out.println("3. Delete");
 System.out.println("4. Display");
 System.out.println("5. Exit");
 System.out.print("Enter your choice: ");
 
 int choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 
 switch (choice) {
 case 1:
 System.out.print("Enter the item to be inserted: ");
 String itemToInsert = scanner.nextLine();
 stringList.add(itemToInsert);
 System.out.println("Inserted successfully");
 break;
 
case 2:
 System.out.print("Enter the item to search: ");
 String itemToSearch = scanner.nextLine();
 if (stringList.contains(itemToSearch)) {
 System.out.println("Item found in the list.");
 } else {
 System.out.println("Item not found in the list.");
 }
 break;
 
 case 3:
 System.out.print("Enter the item to delete: ");
 String itemToDelete = scanner.nextLine();
 if (stringList.remove(itemToDelete)) {
 System.out.println("Deleted successfully");
 } else {
 System.out.println("Item does not exist.");
 }
 break;
 
 case 4:
 System.out.println("The Items in the list are:");
 for (String item : stringList) {
 System.out.println(item);
 }
 break;
 
 case 5:
 System.out.println("Exiting...");
 scanner.close();
 return;
 
 default:
 System.out.println("Invalid choice! Please enter a valid option.");
 }
 }
 }
}
