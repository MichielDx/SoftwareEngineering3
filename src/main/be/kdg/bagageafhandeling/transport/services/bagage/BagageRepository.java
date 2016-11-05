package main.be.kdg.bagageafhandeling.transport.services.bagage;

import main.be.kdg.bagageafhandeling.transport.models.bagage.Bagage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arthur Haelterman on 4/11/2016.
 */
public class BagageRepository {
    private static List<Bagage> bagageList;

    public BagageRepository() {
        bagageList = new ArrayList<>();
    }

    public synchronized void addBagage(Bagage bagage) {
        bagageList.add(bagage);
    }

    public synchronized static void updateBagage(Bagage bagage) {
        bagageList.set(bagage.getBagageID(), bagage);
    }

    public static Bagage getBagage(int bagageID) {
        return bagageList.get(bagageID);
    }
}
