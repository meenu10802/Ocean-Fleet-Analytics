import java.util.ArrayList;
import java.util.List;

/*
 * VesselUtil class
 * ----------------
 * UC4: Identify vessels with highest average speed.
 */
public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public void addVessel(Vessel vessel) {
        vesselList.add(vessel);
    }

    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> result = new ArrayList<>();
        double maxSpeed = 0;

        // Find maximum speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // Collect vessels with max speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                result.add(vessel);
            }
        }

        return result;
    }
}