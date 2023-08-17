public class Account {

    public Account(String number, Double balance, String name, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public void depositMoney(double depositedMoney){
        this.balance+=depositedMoney;
        System.out.println("Deposit is Successful , new Balance is : "+this.balance);

    }

    public void withdraw(double withdrawMoney){
        if (this.balance-withdrawMoney<0){
            System.out.println("Withdraw Unsuccessful only : "+this.balance+" is left");

        }else {

            this.balance-=withdrawMoney;
            System.out.println("Withdraw Successful ,Current Balance "+this.balance);
        }

    }

    private String number;
    private Double balance;
    private String name;
    private String email;
    private String phoneNumber;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
