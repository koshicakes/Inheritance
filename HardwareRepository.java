import java.util.*;

public class HardwareRepository {

    public List<Hardware> getAllHardware() {

        HardwareDataSource ds = new HardwareDataSource();
        List<String[]> rawData = ds.fetchRawData();

        List<Hardware> hardwareList = new ArrayList<>();

        for (String[] row : rawData) {

            int id = Integer.parseInt(row[0]);
            String brand = row[1];
            int spec = Integer.parseInt(row[2]);
            String type = row[3];

            if (type.equalsIgnoreCase("Laptop")) {
                hardwareList.add(new Laptop(id, brand, spec));
            }

            else if (type.equalsIgnoreCase("Phone")) {
                hardwareList.add(new Phone(id, brand, spec));
            }
        }

        return hardwareList;
    }
}