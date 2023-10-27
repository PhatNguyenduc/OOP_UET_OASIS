public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * .
     * @param brand 1
     * @param model 1
     * @param registrationNumber 1
     * @param owner 1
     * @param numberOfDoors 1
     */
    public Car(String brand, String model,
               String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * .
     * @return res
     */
    public String getInfo() {
        String res = "Car:" + "\n";
        res += "\t" + "Brand: " + this.brand + "\n";
        res += "\t" + "Model: " + this.model + "\n";
        res += "\t" + "Registration Number: " + this.registrationNumber + "\n";
        res += "\t" + "Number of Doors: " + this.numberOfDoors + "\n";
        res += "\t" + "Belongs to " + this.owner.getName() + " - " + this.owner.getAddress() + "\n";

        return res;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
