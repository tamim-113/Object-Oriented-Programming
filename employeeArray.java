import java.util.Scanner;

public class employeeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int size = sc.nextInt();

        int[] ids = new int[size];
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.print("Enter ID: ");
            ids[i] = sc.nextInt();
            sc.nextLine(); // clear the leftover newline
            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();
        }

        System.out.println("\n--- Employee List ---");
        System.out.println("ID\tName");
        for (int i = 0; i < size; i++) {
            System.out.println(ids[i] + "\t" + names[i]);
        }

        sc.close();
    }
}