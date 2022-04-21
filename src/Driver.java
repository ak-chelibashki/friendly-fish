import java.util.ArrayList;

/**
 * @author ak-chelibashki
 */
public class Driver {

    public static void main(String[] args) {
        /**
         * Generate fish objects
         */
        Fish fish1 = new Fish("Amber","AngelFish",5,2,3,1.5);
        Fish fish2 = new Fish("James","Guppy",1,0,0,0);
        Fish fish3 = new Fish("Arnold","Guppy",4,2,3,4);
        Fish fish4 = new Fish();


        fish4 = nicestFish(fish1,fish2);
        ArrayList<Fish> fishes = new ArrayList<Fish>();
        fishes.add(fish1);
        fishes.add(fish2);
        fishes.add(fish3);
        Fish fish5 = new Fish();
        fish5 = nicestFish(fishes);
        System.out.println("Most agresive fish is " +fish5.toString());

        displayNicestFish(nicestFish(fishes));
        System.out.println(fish1.generateInfo(fish1));
        ArrayList<Fish> fishy = new ArrayList<Fish>();
        fishy.add(fish1);
        fishy.add(fish2);
        fishy.add(fish3);
        fishy.add(fish4);
        System.out.println("Test!");
        fish1.displayInfo(fishy);

    }//end main
    /*
     *
     */
    public static Fish nicestFish(Fish obj1, Fish obj2) {

        if(obj1.getFriendliness() > obj2.getFriendliness()) {
            System.out.println("The friendlier type of fish is : "+obj1.getType());
            return obj1;
        }//end
        else if (obj2.getFriendliness() > obj1.getFriendliness()) {
            System.out.println("The friendlier type of fish is : "+obj2.getType());
            return obj2;
        }//end
        else {
            System.out.println("Objects are equal");
        }

        return obj1;
    }//end nicestfish method

    public static Fish nicestFish(ArrayList<Fish> fish) {
        Fish temp = new Fish();
        temp = fish.get(0);
        System.out.println(temp.toString());

        for(Fish fishy : fish) {
            if(fishy.getFriendliness() > temp.getFriendliness()) {
                temp = fishy;
            }//end if
        }//end foreach



        return temp;

    }//end method

    public static void displayNicestFish(Fish obj) {
        int hateRate = obj.getFriendliness();
        String fishType = obj.getType();
        String hate = getFriendlinessRating(hateRate);

        String line = "The friendlier tpype of fish is : " + fishType
                + " and it is rated as " + hate + " on the friendliness scale";
        System.out.println(line);


    }//end method

    public static String getFriendlinessRating(int hateRate) {
        String hate = "";


        switch (hateRate) {
            case 1:
                hate = "mean";
                break;
            case 2:
                hate = "not friendly";
                break;
            case 3:
                hate = "neutral";
                break;
            case 4:
                hate = "Friendly";
                break;
            case 5:
                hate = "very friendly";
                break;
        }//end switch

        return hate;
    }//end method

}//end class
