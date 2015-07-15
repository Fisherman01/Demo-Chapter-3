import java.util.Scanner;

/**
 * Created by avisser on 14-7-2015.
 */
public class MainDemoChaptThree {

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ze var is not going vell herr Feldmarshall....ze Amerikans are vinning......zey have taken ze crossroads");
        scan.nextLine();
        System.out.println("vat should ve do?");
        scan.nextLine();
        System.out.println("Easy Leutnant....ve make more tanks. Ze mighty Tiger");
        scan.nextLine();
        System.out.println("How many should ve make herr Feldmarshall?");
        scan.nextLine();
        System.out.println("How much space do ve have in total Leutnant");
        scan.nextLine();

        Runtime rt = Runtime.getRuntime();

        System.out.println("Ve have " + rt.totalMemory() + " in total herr Feldmarschall");

        scan.nextLine();
        System.out.println("And free?");
        scan.nextLine();
        System.out.println("Ve have " + rt.freeMemory() + " free Herr Feldmarschall");
        scan.nextLine();
        System.out.println("How many Tigers should ve build then?");
        int amount = scan.nextInt();

        Tiger tiger = null;
        for (int i = 0; i < amount; i++) {
            tiger = new Tiger();
            tiger = null;
        }

        System.out.println(amount + " Tigers build and ready for battle herr Feldmarschall");
        scan.nextLine();
        scan.nextLine();
        System.out.println("Let zem attack ze Amerikans Leutnant");
        scan.nextLine();
        System.out.println("Meanwhile at the crossroads.......");
        scan.nextLine();
        System.out.println("sarge?");
        scan.nextLine();
        System.out.println("...");
        scan.nextLine();
        System.out.println("Sarge!");
        scan.nextLine();
        System.out.println("hmm");
        scan.nextLine();
        System.out.println("SARGE!");
        scan.nextLine();
        System.out.println("Shut up corporal....I'm trying to sleep");
        scan.nextLine();
        System.out.println("But there's a whole bunch of Tigers coming towards us sarge!!");
        scan.nextLine();
        System.out.println("What's that corporal?  Tigers?");
        scan.nextLine();
        System.out.println("All hands on deck!.....");
        scan.nextLine();
        System.out.println("Sarge....we are in tank....");
        scan.nextLine();
        System.out.println("oh...ehh...");
        scan.nextLine();
        System.out.println("Klingons on the starboard bow!!...set phasers to stun!.....resistance is futile!!");
        scan.nextLine();
        System.out.println("SARGE!");
        scan.nextLine();
        System.out.println("okay, okay....Look sharp guys!!....load the armour piercing!!");
        scan.nextLine();
        System.out.println("....");
        scan.nextLine();
        System.out.println("....");
        scan.nextLine();
        System.out.println("What's taking them so long sarge?");
        scan.nextLine();
        System.out.println("Looks like they are standing still corporal");
        scan.nextLine();
        System.out.println("I think they are surrendering Sarge...listen to the radio....Germany surrendered!!");
        scan.nextLine();
        System.out.println("The war is over!");
        scan.nextLine();
        System.out.println("What do we do with all those tanks Sarge?");
        scan.nextLine();
        System.out.println("How much space left Corporal?");
        scan.nextLine();
        System.out.println("ehh..." + rt.freeMemory() + " is free now Sarge");
        scan.nextLine();
        System.out.println("Then destroy them corporal");
        scan.nextLine();
        System.out.println("okay Sarge...");
        scan.nextLine();
        rt.gc();
        System.out.println("How much do we have now Corporal?");
        scan.nextLine();
        System.out.println("ehh.." + rt.freeMemory() + " is free now Sarge");
        scan.nextLine();
        System.out.println("good boy....now let me sleep");
        scan.nextLine();
        System.out.println("Bur sarge...shouldn't we be fixing the track?");
        scan.nextLine();
        System.out.println("shut up corporal....");
    }

}
