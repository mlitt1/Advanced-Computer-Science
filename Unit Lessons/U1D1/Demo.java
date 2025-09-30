public class Demo {

        private int hello;
        private int world;
        private String goodbye;
    public static void main(String[] args) {

    public int getHello() {
        return hello;
    }

    public void setHello(int hello) {
        this.hello = hello;
    }
    
    public int getWorld() {
        return world;
    }

    public void setWorld(int world) {
        this.world = world;
    }
    
    public String getGoodbye() {
        return goodbye;
    }
    
    public void setGoodbye(String goodbye) {
        this.goodbye = goodbye;
    }
        
        // AND - all conditions have to be true
        // OR - one condition has to be true
        int age = 20;
        boolean isFelon = false;
        if((age >= 18 && age >= 35) && !isFelon) {
            System.err.println("You can run for presidency and vote!");
        }

        age = 15;

        if(age < 18 || (isFelon || age > 101)) {
            System.out.println("THis person is not eligible for presidency");
        }

        boolean isRegistered = true;
        boolean isCitizen = true;
        String country = "USA";
        String favColor = "Green";

        if(isRegistered) {
            if(age >= 18) {
                if(isCitizen) {
                    if(country.equals("USA")) {
                        System.out.println("You can vote!");
                    }
                }
            }
        }

        if(isRegistered) {
            return;
        }

        if(age < 18) {
            return;
        }
        if(!isCitizen) {

        }
        if(!country.equals("USA")) {
            return;
        }
        if(!favColor.equals("Green")) {
            return;
        }
        System.out.println("YOu can vote!");


    }
    
}