package seminar2.task1.Classes.Rewards.Bronze;

import seminar2.task1.Classes.IGameItem;
import seminar2.task1.Classes.ItemGenerator;

public class BronzeFabric extends ItemGenerator {

    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
}