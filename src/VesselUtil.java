import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * VesselUtil class
 * ----------------
 * UC6: Uses Collections framework to sort vessels
 * based on average speed.
 */
public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public void addVessel(Vessel vessel) {
        vesselList.add(vessel);
    }

    // Sort vessels by average speed (descending)
    public List<Vessel> sortVesselsBySpeed() {

        Collections.sort(vesselList, new Comparator<Vessel>() {
            @Override
            public int compare(Vessel v1, Vessel v2) {
                return Double.compare(
                        v2.getAverageSpeed(),
                        v1.getAverageSpeed()
                );
            }
        });

        return vesselList;
    }
}