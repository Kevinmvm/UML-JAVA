package Main;

public class Seat extends Car{
    private String distribuidor;

    public Seat(String color, int maxVel, String distribuidor) {
        super(color, maxVel);
        this.distribuidor = distribuidor;
    }

    public void SeatStartDemo()
    {
        Engine SeatEngine = new Engine();
        SeatEngine.engineStart();
        SeatEngine.engineStop();
    }

    public void carAtrSeat()
    {
        System.out.println("Overview: Distributor=  " + distribuidor);
    }
}
 