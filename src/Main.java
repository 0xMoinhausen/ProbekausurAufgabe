//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        KampfPanzer leopard2 = new KampfPanzer(
                "KMW",
                1250,
                1103,
                62.5
        );

        leopard2.getGlattrohrkanone().showData();
        leopard2.feuern(100);
        leopard2.getGlattrohrkanone().showData();
        leopard2.exponatVerleihen("Carl Benz");
        leopard2.stellplatzWechseln(1000);
    }


}