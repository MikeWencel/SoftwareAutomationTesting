package ClassObjectFields;

public class PlanetarySystem {
    private String starName;
    private String starType;
    private int numberOfPlanets;

    public PlanetarySystem(String starName, String starType, int numberOfPlanets) {
        this.starName = starName;
        this.starType = starType;
        this.numberOfPlanets = numberOfPlanets;

        System.out.println("Name of star is: " + starName +", type of star is: " + starType + ", number of planets: " + numberOfPlanets) ;
    }

    public PlanetarySystem() {

    }

    public String getStarName(){
        return starName;
    }

    public void  setNumOfPlanets(int number){
        numberOfPlanets = number;
    }

    public int getNumberOfPlanets(){
        return numberOfPlanets;
    }





}
