package Edgars.DistanceCalculator;

public class DistanceCalc {
    private float fuelTank;
    private float fuelCons;
    private int passengers;
    private float maxDistance;

    public DistanceCalc(float fuelTank, float fuelCons, int passengers){
        this.fuelTank = fuelTank;
        this.fuelCons = fuelCons;
        this.passengers = passengers;

    }
    public void MaxDistance(){
        float extraCons = fuelCons * (passengers * 0.05f);
        maxDistance = fuelTank / (fuelCons + extraCons) * 100;
        System.out.format("Your max distance in km: " + "%.2f" + System.lineSeparator(), maxDistance);
    }
}
