package seminar2.task1.Classes.Rewards.Gold;

import seminar2.task1.Classes.ItemGenerator;
import seminar2.task1.Classes.IGameItem;

public class GoldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}