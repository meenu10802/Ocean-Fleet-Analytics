import java.util.Scanner;

/*
 * UserInterface class
 * -------------------
 * UC5: Handles console-based input and output.
 */
public class UserInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VesselUtil util = new VesselUtil();

        System.out.println("Enter number of vessels:");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(":");

            Vessel vessel = new Vessel(
                    data[0],
                    data[1],
                    Double.parseDouble(data[2]),
                    data[3]
            );

            util.addVessel(vessel);
        }

        for (Vessel v : util.getAllVessels()) {
            System.out.println(v.getVesselId() + " | " +
                    v.getVesselName() + " | " +
                    v.getVesselType() + " | " +
                    v.getAverageSpeed());
        }

        scanner.close();
    }
}