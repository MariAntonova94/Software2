package seminar2.task1.Classes.Rewards.Platinum;

import seminar2.task1.Classes.IGameItem;
import seminar2.task1.Classes.ItemGenerator;

public class PlatinumFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Platinum();
    }
}