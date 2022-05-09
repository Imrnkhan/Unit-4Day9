package Question2;

public class Customer {

    private String username;
    private String password;
    private String mobileNUmber;
    private String email;

    public Customer(){
        //zero argument constroctor
    }

    public Customer(String username, String password, String mobileNUmber, String email) {
        super();
        this.username = username;
        this.password = password;
        this.mobileNUmber = mobileNUmber;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNUmber() {
        return mobileNUmber;
    }

    public void setMobileNUmber(String mobileNUmber) {
        this.mobileNUmber = mobileNUmber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNumber(String mobile) {
    }

}
