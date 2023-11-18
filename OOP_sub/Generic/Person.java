import java.util.Comparator;

public class Person implements Comparable<Person> {
    protected String name;
    protected String address;

    protected int age;

    public Person(){}

    /**
     * .
     * @param name 1
     * @param age 1
     * @param address 1
     */

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public int CompareTo(Person p) {
//        int res = 0;
//       if(this.getName().compareTo(p.getName())  > 0) {
//           res = 1;
//       }
//       else if(this.getName().compareTo(p.getName()) < 0) {
//           res = -1;
//       }
//       else if(this.getName().equals(p.getName())) {
//           if(this.getAge() > p.getAge()) {
//               res = 1;
//           }
//           else res = -1;
//       }
//       return res;
//    }
@Override
public int compareTo(Person p) {
    int nameComparison = this.name.compareTo(p.name);
    if (nameComparison != 0) {
        return nameComparison;
    } else {
        return Integer.compare(this.age, p.age);
    }
}
}
