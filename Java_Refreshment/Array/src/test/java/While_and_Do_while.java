import org.junit.jupiter.api.Test;

public class While_and_Do_while {

    @Test
    public void whileExample() {
        int silnia5 = 1 * 2 * 3 * 4 * 5;
        int silnia6 = obliczSilnie(6);

    }

    private int obliczSilnie(int liczba) {
        int silnia = 1;
        int i = 2;
        if (liczba > 1) {
            while (i < liczba) {
                silnia *= i;
                i++;
            }
        }
        return silnia;
    }
}


