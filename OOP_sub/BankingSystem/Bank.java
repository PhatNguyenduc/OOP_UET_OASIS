import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * .
     * @param inputStream 1
     */
    public void readCustomerList(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        Customer currrentCustomer = null;
        try {
            while ((line = reader.readLine()) != null) {

                if (Character.isAlphabetic(line.charAt(0))) {
                    String[] parts = line.split("\\s+(?=\\d)");
                    long idNumber = Long.parseLong(parts[1]);
                    String fullName = parts[0];
                    if (currrentCustomer != null) {
                        customerList.add(currrentCustomer);
                    }

                    currrentCustomer = new Customer(idNumber, fullName);
                } else if (Character.isDigit(line.charAt(0)) && currrentCustomer != null) {
                    String[] parts = line.split("\\s+");
                    long accountNumber = Long.parseLong(parts[0]);
                    String type = parts[1];
                    double balance = Double.parseDouble(parts[2]);
                    if (type.equals(Account.CHECKING)) {
                        currrentCustomer.addAccount(new CheckingAccount(accountNumber, balance));
                    } else if (type.equals(Account.SAVINGS)) {
                        currrentCustomer.addAccount(new SavingsAccount(accountNumber, balance));
                    }
                }
            }
            if (currrentCustomer != null) {
                customerList.add(currrentCustomer);
            }


        } catch (IOException  error) {
            error.printStackTrace();
        }
    }

    /**
     * .
     * @return res
     */
    public String getCustomersInfoByIdOrder() {
        Collections.sort(customerList, Comparator.comparing(Customer::getIdNumber));
        String s = "";
        for (Customer customer : customerList) {
            s += customer.getCustomerInfo() + "\n";
        }
        return s;
    }

    /**
     * .
     * @return res
     */

    public String getCustomersInfoByNameOrder() {
        Collections.sort(customerList, Comparator.comparing(Customer::getFullName));
        String s = "";
        for (Customer customer : customerList) {
            s += customer.getCustomerInfo() + "\n";
        }
        return s;
    }

    /**
     * .
     * @return res
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }
}







