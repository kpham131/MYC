package MYCBackend.Account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Entity
@Table (name = "Accounts")
public class Account {

    @Id
    @Column(name = "account_id")
    private UUID accountID;

    @Column(name = "username")
    private String username;

    @Column(name = "role_id")
    private int role;

    @Column(name = "email")
    private String email;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "token")
    private String token;

    @Column(name = "password")
    private String password;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "dob")
    private Date doB;
    private final transient Map<Integer, String> roleTable= new HashMap<>();

    {
        roleTable.put(1, "customer");
        roleTable.put(2, "admin");
    }

    public Account(UUID accountID, String username, int role, String email, String fullName, String address, String phoneNumber, String token, String password, boolean isActive, Date doB) {
        this.accountID = accountID;
        this.username = username;
        this.role = role;
        this.email = email;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.token = token;
        this.password = password;
        this.isActive = isActive;
        this.doB = doB;
    }

    public Account() {
    }

    public UUID getAccountID() {
        return accountID;
    }

    public void setAccountID(UUID accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getDoB() {
        return doB;
    }

    public void setDoB(Date doB) {
        this.doB = doB;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", token='" + token + '\'' +
                ", password='" + password + '\'' +
                ", isActive=" + isActive +
                ", doB=" + doB +
                '}';
    }
    public void addRole(int roleID, String roleName) {
        roleTable.put(roleID, roleName);
    }

    public String getRoleName(int roleID) {
        return roleTable.get(roleID);
    }

    public int getRoleID(String role) {
        for (Integer key : roleTable.keySet()) {
            if(role.equals(roleTable.get(key)))
                return key.intValue();
        }
        return 0;
    }

}