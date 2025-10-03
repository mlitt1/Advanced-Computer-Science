public class StaticDemo {
    public static void main(String[] args) {
        
        // if you have no constructor, ill make a default for you and assign all instance variables to their null state
        //StaticDemo object = new StaticDemo();

        //object.firstIfTest();

        // static methods are sometimes called helper methods
        // classes that hold static methods only are called helper classes
        String demo = StaticDemo.secondIfTest();
        System.out.println(demo);

        Math.random();
        
    }
    // this method belongs to the object of the class
    public void firstIfTest(){
        int x = 4;
        int y = 3;
        int z = 4;

        if(x < y) {
            System.out.println("x if less than y.");
        }
        if(x==z) {
            System.out.println("x is equal to z.");
        }
    }

    public static String secondIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if(x < y) {
            System.out.println("x if less than y.");
        }
        if(x==z) {
            System.out.println("x is equal to z.");
        }

        return "hello there";
    }
}
