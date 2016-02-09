/**
 * Created by kaba on 06/02/16.
 */
public class VolcanoApplication {

    public static void main(String[] args) {

        VolcanoRobot dante = new VolcanoRobot();
        VolcanoRobot virgil = new VolcanoRobot();

        dante.status = "exploring";
        dante.speed = 2;
        dante.temperature = 510;

        System.out.println("Dante's attributes");
        dante.showAttributes();

        System.out.println("Increasing speed to 3.");
        dante.speed = 3;
        dante.showAttributes();

        System.out.println("Increasing temperature to 670.");
        dante.temperature = 670;
        dante.showAttributes();

        System.out.println("Checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();

        virgil.status = "exploring";
        virgil.speed = 1;
        virgil.temperature = 400;

        System.out.println("Virgil's attributes");
        virgil.showAttributes();
    }

}
