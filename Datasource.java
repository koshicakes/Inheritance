import java.util.*;

public class HardwareDataSource {

    public List<String[]> fetchRawData() {

        List<String[]> data = new ArrayList<>();

        // Built-in hardware units (for presentation)
        data.add(new String[]{"1", "Dell XPS 13", "16", "Laptop"});
        data.add(new String[]{"2", "Samsung S24", "50", "Phone"});
        data.add(new String[]{"3", "MacBook Pro", "32", "Laptop"});

        return data;
    }
}
