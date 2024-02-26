public class Kanone {
    private String hersteller;
    public double wandstarke;
    private double durchmesser = 120.0;


    public Kanone(double wandstarke, double durchmesser, String hersteller) {
        this.wandstarke = wandstarke;
        this.durchmesser = durchmesser;
        this.hersteller = hersteller;
    }

    public String getHersteller() {
        return hersteller;
    }

    public double getDurchmesser() {
        return durchmesser;
    }

    public void showData() {
        System.out.println("Hersteller: " +  hersteller);
        System.out.println("Wandstärke: " +  wandstarke);
        System.out.println("Durchmesser: " + durchmesser);
    }
}
