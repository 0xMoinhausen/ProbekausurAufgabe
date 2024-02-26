public class Panzer {

    private String hersteller;
    private double kmStand;
    private double leistungkInKw;
    private double masseInTonnen;

    public Panzer(String hersteller, double kmStand, double leistungkInKw, double masseInTonnen) {
        this.hersteller = hersteller;
        this.kmStand = kmStand;
        this.leistungkInKw = leistungkInKw;
        this.masseInTonnen = masseInTonnen;
    }

    public String getHersteller() {
        return hersteller;
    }

    public double getKmStand() {
        return kmStand;
    }

    public double getLeistungkInKw() {
        return leistungkInKw;
    }

    public double getMasseInTonnen() {
        return masseInTonnen;
    }

}
