public class ScopeDemo {
    private String world = "World"; // instance variableg are globl
    public static void main(String[] args) {
        ScopeDemo demo = new ScopeDemo();   
    }

    public String method2(){
        String hello = "Hello";
        String goodbye = " ";
        if(true){
            goodbye = "Goodbye";
        }

        return hello;
    }

    public String method1(){
       return method2() + world; 
    }
}
