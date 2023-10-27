public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * .
     * @param brand 1
     * @param model 1
     * @param registrationNumber 1
     * @param owner 1
     * @param hasSidecar 1
     */
    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;

    }

    /**
     * .
     * @return res
     */
    public String getInfo() {
        String res = "Motor Bike:" + "\n";
        res += "\t" + "Brand: " + this.brand + "\n";
        res += "\t" + "Model: " + this.model + "\n";
        res += "\t" + "Registration Number: " + this.registrationNumber + "\n";
        res += "\t" + "Has Side Car: " + this.hasSidecar + "\n";
        res += "\t" + "Belongs to " + this.owner.getName() + " - " + this.owner.getAddress() + "\n";

        return res;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
