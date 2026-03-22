public class Hardware {

    private int id;
    private String brand;
    private String type;
    protected int spec;

    public Hardware(int id, String brand, int spec, String type) {
        this.id = id;
        this.brand = brand;
        this.spec = spec;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getSpec() {
        return spec;
    }

    public String interpretSpec() {
        return spec + "";
    }
}