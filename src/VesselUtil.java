import java.util.ArrayList;
import java.util.List;

/*
 * VesselUtil class
 * ----------------
 * UC3: Retrieve vessel details using vesselId.
 */
public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public void addVessel(Vessel vessel) {
        vesselList.add(vessel);
    }

    public Vessel getVesselById(String vesselId) {

        // Linear search
        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equals(vesselId)) {
                return vessel;
            }
        }
        return null;
    }
}