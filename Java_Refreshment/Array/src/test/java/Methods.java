import org.junit.jupiter.api.Test;


public class Methods {
    @Test
    public void example(){
        double poleTrapezuPierwszego = obliczPoleTrapezu(8,10,5);
        double poleTrapezuDrugiego = ((8+10)*5) / 2;
        double poleTrapezuTrzeciego = ((8+10)*5) / 2;
        String tekst = "Pola trapezów to: " + poleTrapezuPierwszego + ", " + poleTrapezuDrugiego + ", " + poleTrapezuTrzeciego + ". ";
        wypiszKoniec();
    }

    double obliczPoleTrapezu(double pierwszaPodstawa,double drugaPodstawa,double wysokosc){
        double poleTrapezu = ((pierwszaPodstawa + drugaPodstawa)*wysokosc)/2;
        return poleTrapezu;
    }

    void wypiszKoniec(){
        System.out.println("Koniec testu.");
    }
}
