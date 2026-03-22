import java.util.*;

public class HardwareDataSource {

    public List<String[]> fetchRawData() {

        Scanner scan = new Scanner(System.in);
        List<String[]> data = new ArrayList<>();

        data.add(new String[]{"1","Dell XPS 13","16","Laptop"});
        data.add(new String[]{"2","Samsung S24","50","Phone"});
        data.add(new String[]{"3","MacBook Pro","32","Laptop"});
        
        System.out.print("Enter number of records: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Hardware Data");

            System.out.print("ID: ");
            int id = scan.nextInt();
            scan.nextLine();

            System.out.print("Brand: ");
            String brand = scan.nextLine();

            System.out.print("Spec: ");
            int spec = scan.nextInt();
            scan.nextLine();

            System.out.print("Type (Laptop/Phone): ");
            String type = scan.nextLine();

            data.add(new String[]{
                    String.valueOf(id),
                    brand,
                    String.valueOf(spec),
                    type
            });
        }

        return data;
    }
}
