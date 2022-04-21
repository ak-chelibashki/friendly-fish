import java.util.ArrayList;

/**
 * @author ak-chelibashki
 */

public class Fish extends Animal{
    /**
     * Class instances
     */
    private String typeOfFish, name;
    private int friendliness;

    /**
     * Default constructor
     * generate Fish with default values
     */
    public Fish() {
        this ("NA","Unkown",3, 0, 0, 0.0);

    }//end

    /**
     *  Constructor to
     * Accepts all required parameters
     * to initialize Fish object
     */
    public Fish(String name, String typeF, int frss,int w, int h, double s) {
        super(w,h,s);
        this.name = name;
        this.typeOfFish = typeF;
        this.friendliness = frss;
    }//end constructor

    /**
     * Constructor to
     * Accept only one parameter
     * @param typeF
     */
    public Fish(String typeF) {
        super();
        this.typeOfFish = typeF;
    }//end constructor

    /*
     * Method to retrieve fish friendliness
     */
    public int getFriendliness() {
        return this.friendliness;
    }//end method

    /**
     * Method to update fish name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }//end method

    /**
     * Method to update fish friendliness
     * @param friendliness
     */
    public void setFriendliness(int friendliness) {
        this.friendliness = friendliness;
    }//end method

    /**
     * Method to retrieve fish name
     * @return
     */
    public String getName() {
        return this.name;
    }//end method

    /**
     * Method to retrieve fish type
     * @return
     */
    public String getType() {
        return this.typeOfFish;
    }//end method

    /**
     * Method to generate string with object values
     * @return
     */
    public String toString() {
        return super.toString()+"\n"+this.name+"\n"+this.typeOfFish+"\n"+this.friendliness;
    }//end to string method

    /**
     * Method to generate string with information
     * about the object
     * @param fish
     * @return
     */
    public String generateInfo(Fish fish) {
        String line = " ";
        line = "\nFish Type:\t"+fish.getType()+"\nName:\t"+fish.getName()
                +"\nFriendliness:\t"+fish.getFriendliness()+toString();

        return line;
    }//end method

    /**
     * Method go generate a string with the information
     * extracted from the fish objects
     * @param fishes
     */
    public void displayInfo(ArrayList<Fish> fishes) {
        String line = "";
        for(Fish fish : fishes) {
            line +=generateInfo(fish);
        }

        System.out.println(line);
    }//end method

}//end class

