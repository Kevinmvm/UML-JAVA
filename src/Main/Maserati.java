package Main;

public class Maserati extends Car {
    private String nomDist;
    private String anysProd;

    public Maserati(String color, int maxVel, String nomDist, String anysProd) {
        super(color, maxVel);
        this.nomDist = nomDist;
        this.anysProd = anysProd;
    }

    public void MaseratiStartDemo()
    {
        Engine MaseratiEngine = new Engine();
        MaseratiEngine.engineStart();
        MaseratiEngine.engineStop();
    }


    public void carAtrMaserati()
    {
        System.out.println("Overview: Designer = " + nomDist + "Production = " + anysProd);
    }

}

