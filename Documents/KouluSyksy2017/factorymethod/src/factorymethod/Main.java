package factorymethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        AterioivaOtus maarit = new Maarit();
        maarit.aterioi();
        AterioivaOtus sakke = new Koira();
        sakke.aterioi();
        
    }
}
