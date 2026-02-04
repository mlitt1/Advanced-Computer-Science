public class SkyviewTester {

    public static void main(String[] args) {

        try {
            double[] scanned = {
                0,1,2,3,4,
                5,6,7,8,9,
                10,11,12,13,14,
                15,16,17,18,19,
                20,21,22,23,24
            };
            
            SkyView myView = new SkyView(5, 5, scanned);
            System.out.println(myView);

            SkyView v1 = new SkyView(3, 3,
                new double[]{0,1,2,3,4,5,6,7,8});

            SkyView v2 = new SkyView(3, 3,
                new double[]{0,1,2,3,4,5,6,7,8});

            SkyView v3 = new SkyView(3, 3,
                new double[]{0,1,2,3,100,5,6,9,18});

            System.out.println(v1.equals(v2));
            System.out.println(v1.equals(v3));

            System.out.println(myView.getAverage(0, 1, 0, 2));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}