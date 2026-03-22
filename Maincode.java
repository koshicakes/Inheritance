import java.util.*;

public class Main {

    public static void main(String[] args) {

        HardwareRepository repo = new HardwareRepository();

        List<Hardware> items = repo.getAllHardware();

        printMasterlist(items);
        printInventory(items);
    }

    public static void printMasterlist(List<Hardware> items) {

        System.out.println("\n=== HARDWARE MASTERLIST ===");

        for (Hardware h : items) {

            System.out.println(
                    h.getId() + " | " +
                    h.getBrand() + " | " +
                    h.getType() + " | " +
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

                if (h.getSpec() == 16)
                    laptop16++;

                if (h.getSpec() == 32)
                    laptop32++;
            }

            else if (h instanceof Phone) {

                if (h.getSpec() == 50)
                    phone50++;
            }
        }

        System.out.println("\n=== INVENTORY REPORT ===");

        System.out.println("16GB Laptops: " + laptop16);
        System.out.println("32GB Laptops: " + laptop32);
        System.out.println("50MP Phones: " + phone50);
    }
}