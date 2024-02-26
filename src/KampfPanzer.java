public class KampfPanzer extends Panzer implements Austellungsstück {

    private Kanone glattrohrkanone;

    public KampfPanzer(String hersteller, double kmStand, double leistungkInKw, double masseInTonnen) {
        super(hersteller, kmStand, leistungkInKw, masseInTonnen);
        this.glattrohrkanone = new Kanone(8.0, 120, "Rheinmetall");
    }

    public void feuern(int schuesse) {
        this.glattrohrkanone.wandstarke -= 0.001 * schuesse;
    }

    public Kanone getGlattrohrkanone() {
        return glattrohrkanone;
    }

    @Override
    public void exponatVerleihen(String museum) {
        System.out.println("Im Museum "+  museum +".");
    }

    @Override
    public void stellplatzWechseln(int plaltzNr) {
        System.out.println("Ist jetzt auf den Stellplatz " +  plaltzNr +".");
    }
}
