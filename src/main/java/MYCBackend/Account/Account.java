package MYCBackend.Account;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Account {
    private String AccountID, Username, Role, Email, FullName, Address, PhoneNumber, Token;
    private String Password;
    private boolean IsActive;
    private Date DoB;
    private final transient Map<Integer, String> roleTable= new HashMap<>();

    {
        roleTable.put(1, "customer");
        roleTable.put(2, "admin");
    }

    public Account(String accountID, String username, String role, String email, String fullName, String address, String phoneNumber, String token, boolean isActive, Date doB) {
        AccountID = accountID;
        Username = username;
        Role = role;
        Email = email;
        FullName = fullName;
        Address = address;
        PhoneNumber = phoneNumber;
        Token = token;
        IsActive = isActive;
        DoB = doB;
    }

    public Account() {
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String accountID) {
        AccountID = accountID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date doB) {
        DoB = doB;
    }

    @Override
    public String toString() {
        return "Account{" +
                "AccountID='" + AccountID + '\'' +
                ", Username='" + Username + '\'' +
                ", Role='" + Role + '\'' +
                ", Email='" + Email + '\'' +
                ", FullName='" + FullName + '\'' +
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Token='" + Token + '\'' +
                ", IsActive=" + IsActive +
                ", DoB=" + DoB +
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

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Account o = (Account) obj;
        return this.AccountID.equals(o.AccountID) && this.IsActive == o.IsActive && this.Address.equals(o.Address)
                && this.Email.equals(o.Email) && this.FullName.equals(o.FullName) && this.Username.equals(o.Username)
                && this.Password.equals(o.Password) && (this.DoB.compareTo(o.DoB)) == 0
                && this.PhoneNumber.equals(o.PhoneNumber) && this.Role.equals(o.Role);
    }
}
