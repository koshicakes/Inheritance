import java.util.*;

public class Main {

    public static void main(String[] args) {

        HardwareRepository repo = new HardwareRepository();
        List<Hardware> items = repo.getAllHardware();

        Scanner scan = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {

            System.out.println("\n=== HARDWARE SYSTEM MENU ===");
            System.out.println("1. Show Hardware Masterlist");
            System.out.println("2. Show Inventory");
            System.out.println("3. Add Hardware Unit");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    printMasterlist(items);
                    break;

                case 2:
                    printInventory(items);
                    break;

                case 3:
                    addHardware(items, scan);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    public static void printMasterlist(List<Hardware> items) {

        System.out.println("\n=== HARDWARE MASTERLIST ===");

        for (Hardware h : items) {

            System.out.println(
                    h.getId() + " " +
                    h.getBrand() + " " +
                    h.getType() + " " +
                    h.interpretSpec()
            );
        }
    }


    public static void printInventory(List<Hardware> items) {

        int laptop16 = 0;
        int laptop32 = 0;
        int phone50 = 0;

        for (Hardware h : items) {

            if (h instanceof Laptop) {

                if (h.getSpec() == 16) {
                    laptop16++;
                }

                if (h.getSpec() == 32) {
                    laptop32++;
                }

            } else if (h instanceof Phone) {

                if (h.getSpec() == 50) {
                    phone50++;
                }
            }
        }

        System.out.println("\n=== INVENTORY REPORT ===");
        System.out.println("16GB Laptops: " + laptop16);
        System.out.println("32GB Laptops: " + laptop32);
        System.out.println("50MP Phones: " + phone50);
    }


    public static void addHardware(List<Hardware> items, Scanner scan) {

        System.out.println("\n=== Add Hardware Unit ===");

        System.out.print("Enter ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Brand: ");
        String brand = scan.nextLine();

        System.out.print("Enter Spec: ");
        int spec = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter Type (Laptop/Phone): ");
        String type = scan.nextLine();

        if (type.equalsIgnoreCase("Laptop")) {

            items.add(new Laptop(id, brand, spec));

        } else if (type.equalsIgnoreCase("Phone")) {

            items.add(new Phone(id, brand, spec));

        } else {

            System.out.println("Invalid hardware type.");
            return;
        }

        System.out.println("Hardware added successfully.");
    }
}
