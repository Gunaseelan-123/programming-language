import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
class GiftDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the number of kids in the group
            int numKids = scanner.nextInt();

            // Read the number of gifts Santa Claus has
            int numGifts = scanner.nextInt();

            // Read the names of the first two kids who received the gift
            String firstKid = scanner.next();
            String secondKid = scanner.next();

            // Read the names of each kid and store them in a list
            List<String> kids = new ArrayList<>();
            for (int i = 0; i < numKids; i++) {
                String kidName = scanner.next();
                kids.add(kidName);
            }

            // Determine the direction of gift distribution
            String direction = (numGifts % 2 == 0) ? "clockwise" : "anti-clockwise";
            System.out.println("Direction of gift distribution: " + direction);

            // Find the kids who received the highest number of gifts
            List<String> highestGiftRecipients = new ArrayList<>();
            int maxGifts = 0;

            for (String kid : kids) {
                int numGiftsReceived = (kid.equals(firstKid) || kid.equals(secondKid)) ? 1 : 0;

                if (numGiftsReceived > maxGifts) {
                    highestGiftRecipients.clear();
                    highestGiftRecipients.add(kid);
                    maxGifts = numGiftsReceived;
                } else if (numGiftsReceived == maxGifts) {
                    highestGiftRecipients.add(kid);
                }
            }

            // Print the names of kids who received the highest number of gifts
            System.out.println("Kids who received the highest number of gifts:");
            for (String kid : highestGiftRecipients) {
                System.out.println(kid);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers for the number of kids and gifts.");
        }
    }
}
