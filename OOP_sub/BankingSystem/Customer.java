import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<Account>();

    public Customer() {}

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
    }

    public long getIdNumber() {
        return idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public void setFullName(String fullname) {
        this.fullName = fullname;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * .
     * @param account 1
     */
    public void removeAccount(Account account) {
        for (Account acc : accountList) {
            if (acc.getAccountNumber() == account.getAccountNumber()) {
                this.accountList.remove(acc);

            }
        }
    }

    /**
     * .
     * @return res
     */

    public List<Account> getAccountList() {
        return accountList;
    }




}
