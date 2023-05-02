import java.util.Scanner;

public class Menu {
    public void menuText() {
        Scanner scanner = new Scanner(System.in);
        Change change = new Change();
        Add add = new Add();

        System.out.println("Do you want to edit an account or add a new one? \n'edit' or 'new'");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("edit")) {
            change.changeInfo();
        }
        else if (choice.equalsIgnoreCase("new")) {
            add.addToDatabase();
        }
    }
}
