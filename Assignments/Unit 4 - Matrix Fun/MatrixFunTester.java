public class MatrixFunTester {
    public static void main(String[] args) {
        MatrixFun kawhi = new MatrixFun();
        System.out.println(kawhi);

        MatrixFun bones = new MatrixFun(3,3);
        System.out.println(bones);

        int[][] cool = {{1,2,3},{4,5,6},{7,8,9}};
        MatrixFun lebron= new MatrixFun(cool);
        System.out.println(lebron);

        MatrixFun rui = new MatrixFun(cool);
        System.out.println(lebron.equals(rui));
        System.out.println(lebron.equals(cool));

        lebron.replaceAll(1,9);
        System.out.println(lebron);

        lebron.swapRow(0,1);
        System.out.println(lebron);
    }
}
