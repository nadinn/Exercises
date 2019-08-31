package Exercise;

public class Case {
    String model;
    String manufacurer;
    String powerSupply;
    Dimensions dimensions;

    public Case(String model, String manufacurer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacurer = manufacurer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
     public void powerButton(){
         System.out.println("Power button pressed");
     }

    public String getModel() {
        return model;
    }

    public String getManufacurer() {
        return manufacurer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
