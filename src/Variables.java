/**
 * Created by kaba on 06/02/16.
 */
public class Variables {

    public static void main(String[] args) {
        final char UP = 'U';
        byte initialLevel = 12;
        short location = 13250;
        int score = 3500100;
        boolean newGame = true;

        System.out.println("Level: " + initialLevel);
        System.out.println("Up: " + UP);

        int hex = 0xFF;
        int bin = 0b001101;
        int oct = 010;

        System.out.println("Hex: " + hex);
        System.out.println("Bin: " + bin);
        System.out.println("Oct: " + oct);
    }
}
