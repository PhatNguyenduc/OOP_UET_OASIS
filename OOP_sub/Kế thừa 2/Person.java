public class Person {

    private String name;
    private String address;

    /**
     * .
     * @param name 1
     * @param address 2
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }


    public String toString() {

        return "Person[name=" + this.getName() + ",address=" + this.getAddress() + "]";
    }



}
