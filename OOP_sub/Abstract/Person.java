import java.util.ArrayList;


public class Person {
    private String name;
    private String address;
    private java.util.List<Vehicle> vehicleList = new ArrayList<>();

    /**
     * .
     * @param name 1
     * @param address 1
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * .
     * @param vehicle 1
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * .
     * @param registrationNumber 1
     */
    public void removeVehicle(String registrationNumber) {
        int index = -1;
            for (int i = 0; i < vehicleList.size(); i++) {
                if (vehicleList.get(i).getRegistrationNumber() == registrationNumber) {
                    index = i;
                }
            }
            if (index != -1) {
                vehicleList.remove(index);
            }
    }

    /**
     * .
     * @return res
     */
    public String getVehiclesInfo() {
        String res = this.name;

        if (vehicleList.size() < 1) {
            res += " has no vehicle!";
        } else {
            res += " has:" + "\n" + "\n";
            for (int i = 0; i < vehicleList.size(); i++) {
                res += vehicleList.get(i).getInfo();
            }
        }
        return res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
