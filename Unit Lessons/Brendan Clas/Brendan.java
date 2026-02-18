public abstract class Brendan {
    
    // instance variables
    private int age = 16;
    private String fullname = "Brendan You";
    private double money = 10000000;

    // constructors

    public Brendan(int age, String fullname, double money) {
        this.age = age;
        this.fullname = fullname;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // methods

    public abstract void prizepicks(double money);
    
}
