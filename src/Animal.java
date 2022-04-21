/**
 * @author ak-chelibashki
 */
public abstract class Animal {
    /**
     * Class instances
     */
    private int weight, height = 0;
    private double speed = 0;


    /**
     * Default constructor assigning default values to all class instances
     */
    public Animal() {
        this.weight = 0;
        this.height = 0;
        this.speed = 0;
    }//end constructor

    /**
     * Overwritten constructor to assign user defined values
     * to class all instances
     * @param w
     * @param h
     * @param s
     */
    public Animal(int w, int h, double s) {
        this.weight = w;
        this.height = h;
        this.speed = s;
    }//end constructor

    /**
     * Method to calculate the number of hours
     * required to go these miles
     * @param miles
     * @return
     */
    public double getTime(double miles) {
        return miles/this.speed;
    }//end method

    /**
     * method to retrieve weight value
     * @return
     */
    public int getWeight() {
        return this.weight;
    }//end method

    /**
     * method to update weight value
     * @param w
     */
    public void setWeight(int w) {
        this.weight = w;
    }//end method

    /**
     * method to retrieve value stored for height
     * @return
     */
    public int getHeight() {
        return this.height;
    }//end method

    /**
     * method to update height value
     * @param h
     */
    private void setHeight(int h) {
        this.height = h;
    }//end method

    /**
     * method to retrieve speed value
     * @return
     */
    public double getSpeed() {
        return this.speed;
    }//end method

    /**
     * method to update speed value
     * @param s
     */
    public void setSpeed(double s) {
        this.speed = s;
    }//end method

    /**
     * Overloaded method to generate a string with information about the
     * animal details
     * @return
     */
    public String toString() {
        String line;
        line = "\nWeight:\t"+this.weight +"\nHeight:\t"+this.height + "\nMax Speed:\t"+this.speed;
        return line;
    }//end method

}//end class