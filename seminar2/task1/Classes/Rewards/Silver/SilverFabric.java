package seminar2.task1.Classes.Rewards.Silver;

import seminar2.task1.Classes.IGameItem;
import seminar2.task1.Classes.ItemGenerator;

public class SilverFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}