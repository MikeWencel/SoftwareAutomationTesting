import org.junit.jupiter.api.Test;

public class Array_Test {
    @Test
    public void example(){
    String[] planety = new String[8];
    planety[0] = "Merkury";
    planety[1] = "Merkury";
    String planeta = planety[0];
    }

    @Test
    public void example2(){
        String[] planety = {"Mekrury","Wenus","Ziema","Mars","Jowisz","Saturn","Uran","Neptun"};
        String czwartaPlenta = planety[3];

    }

    @Test
    public void example3(){
        int [][] avgPlanet = new int[8][2];
        avgPlanet[0][0] = 1;
        avgPlanet[0][1] = 4879;
        avgPlanet[1][0] = 2;
        avgPlanet[1][2] = 2;

    }

    @Test
    public void example4(){
        int [][] avgPlanet = {{1,720},{2,1233},{3,3221}};


    }

}
