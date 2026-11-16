import java.util.Scanner;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private long ncin;
    private String address;
    private float balance;

    public Person(){
        this.id =id;
        this.lastName =lastName;
        this.firstName =firstName;
        this.ncin =ncin;
        this.address =address;
        this.balance =balance;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName( String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName( String firstName){
        this.firstName = firstName;
    }

    public long getNcin() {
        return ncin;
    }

    public void setNcin(long ncin) {
        this.ncin = ncin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void initPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        this.id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = sc.nextLine();

        System.out.print("Enter first name: ");
        this.firstName = sc.nextLine();

        System.out.print("Enter ncin: ");
        this.ncin = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter adress: ");
        this.address = sc.nextLine();

        System.out.print("Enter initial balance: ");
        this.balance = sc.nextFloat();
    }

    public int isPersonEmpty(){
        if(this.id == 0 && (this.lastName == null || this.lastName.isEmpty()) && (this.firstName == null || this.firstName.isEmpty())){
            return 1;
        }
        return 0;
    }

    public void display(){
        System.out.println("id: " + id +
                           "| last name: " + lastName +
                           "| first name: " + firstName +
                           "ncin: " + ncin +
                           "| adress: " + address +
                           "| balance: " + balance);
    }

    public int debit(float amount){
        if (amount > 0 && this.balance >= amount){
            this.balance -= amount;
            return 1;
        }
        return 0;
    }

    public int add(float amount){
        if(amount > 0){
            this.balance += amount;
            return 1;
        }
        return 0;
    }
}

