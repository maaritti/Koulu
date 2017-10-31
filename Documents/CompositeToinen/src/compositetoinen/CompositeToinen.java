/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositetoinen;

/**
 *
 * @author maaritemilia
 */
public class CompositeToinen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LaiteosaComposite kaikkiLaiteosat = new Kotelo(90);
        LaiteosaComposite emolevy = new Emolevy(100);
        emolevy.addLaiteosa(new Prosessori(150.50));
        emolevy.addLaiteosa(new Muistipiiri(25.75));
        emolevy.addLaiteosa(new Muistipiiri(25.75));
        emolevy.addLaiteosa(new Verkkokortti(20));
        emolevy.addLaiteosa(new Naytonohjain(199.90));
        kaikkiLaiteosat.addLaiteosa(emolevy);
        System.out.println("Kokoonpanon hinta: " + kaikkiLaiteosat.getHinta() + " €");

         TietsikkaFactory tietokoneTehdas = new VerkkisFactory();
        LaiteosaComposite tehdaskokoonpano = tietokoneTehdas.createKotelo();
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createEmolevy());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createProsessori());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMuistipiiri());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMuistipiiri());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createVerkkokortti());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createNaytonohjain());
        System.out.println("Verkkokauppakokoonpanon hinta: " + tehdaskokoonpano.getHinta() + " €");
        
        tietokoneTehdas = new KoneFactory();
        tehdaskokoonpano = tietokoneTehdas.createKotelo();
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createEmolevy());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createProsessori());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMuistipiiri());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createMuistipiiri());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createVerkkokortti());
        tehdaskokoonpano.addLaiteosa(tietokoneTehdas.createNaytonohjain());
        System.out.println("Jimmskokoonpanon hinta: " + tehdaskokoonpano.getHinta() + " €");
    }
    
    
}
