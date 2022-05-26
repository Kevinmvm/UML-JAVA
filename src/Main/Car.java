package Main;

public class Car {
    private String color;
    private int maxVel;

    public Car (String color, int maxVel){
        this.color = color;
        this.maxVel = maxVel;
    }

    public void carInfo()
    {
        System.out.println("Car Info: Car Color= " + color + " Max Vel= " + maxVel);
    }
}