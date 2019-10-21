package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "Brazil";
    static String raceStartTime = "9.00am";

    
    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        nextBibNumber = nextBibNumber + 1;
        bibNumber = nextBibNumber;
    }

    public static void main(String[] args) {
        //create two athletes
    	Athlete Bolt = new Athlete("Bolt", 50);
    	Athlete McQueen = new Athlete("Kerchow", 50);
    	
    	//print their names, bibNumbers, and the location of their race. 
    	System.out.println(Athlete.raceLocation);
    	System.out.println(Bolt.name);
    	System.out.println(Bolt.bibNumber);
    	System.out.println(McQueen.name);
    	System.out.println(McQueen.bibNumber);
    }
}