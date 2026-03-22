public class Laptop extends Hardware {
    public Laptop(int id, String brand, String type, int spec) {
        super(id, brand, type, spec);
    }

    @Override
    public String interpretSpec() {
        return spec + "GB RAM"; // Laptop specific logic
    }
}
