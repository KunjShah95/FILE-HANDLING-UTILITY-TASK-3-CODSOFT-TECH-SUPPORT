
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        Scanner scanner = new Scanner(System.in);
        String filePath;

        System.out.println("===File Handling Utility===");
        System.out.print("Enter the file path: ");
        filePath = scanner.nextLine();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Read File");
            System.out.println("2. Write to File");
            System.out.println("3. Modify File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 ->
                    fileHandler.readFile(filePath);
                case 2 -> {
                    System.out.print("Enter the content to write: ");
                    String content = scanner.nextLine();
                    fileHandler.writeFile(filePath, content);
                }
                case 3 -> {
                    System.out.print("Enter the content to append: ");
                    String appendContent = scanner.nextLine();
                    fileHandler.modifyFile(filePath, appendContent);
                }
                case 4 -> {
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                }
                default ->
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
