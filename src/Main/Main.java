package Main;

public class Main {

    public static void main(String[] args) {

        // Creating an object of Maserati class
        Maserati quattroporte = new Maserati("RED", 329, "Ken Okuyama", "2003–2012");
        quattroporte.carInfo();
        quattroporte.carAtrMaserati();
        quattroporte.MaseratiStartDemo();

        // Creating an object of Seat class
        Seat leon = new Seat("WHITE", 200, "SEAT Lesseps, Motor Letamendi Motor");
        leon.carInfo();
        leon.carAtrSeat();
        leon.SeatStartDemo();
    }
}
