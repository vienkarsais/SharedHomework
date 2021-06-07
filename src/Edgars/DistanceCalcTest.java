package Edgars;

public class DistanceCalcTest {
    public static void main(String[] args) {
        DistanceCalc test1 = new DistanceCalc(10f,10f,1);
        DistanceCalc test2 = new DistanceCalc(70f,7f,0);
        DistanceCalc test3 = new DistanceCalc(55.5f,5.5f,5);
        test1.MaxDistance();
        test2.MaxDistance();
        test3.MaxDistance();
    }
}
