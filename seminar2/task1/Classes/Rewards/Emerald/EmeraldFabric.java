package seminar2.task1.Classes.Rewards.Emerald;

import seminar2.task1.Classes.ItemGenerator;
import seminar2.task1.Classes.IGameItem;

public class EmeraldFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Emerald();
    }
}