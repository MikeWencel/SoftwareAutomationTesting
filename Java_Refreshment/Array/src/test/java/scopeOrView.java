import org.junit.jupiter.api.Test;

public class scopeOrView {
    int liczba1 = 5;
    int liczba2 = 4;
    int suma = liczba1 + liczba2;

    @Test
    public void wypiszLiczbe(){
        System.out.println("Zmienna liczba1 jest równa: " + liczba1);
        int liczbaWMetodzie = 2;
    }
}
