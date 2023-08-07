package seminar2.task1.Classes.Rewards.Sapphire;

import seminar2.task1.Classes.IGameItem;
import seminar2.task1.Classes.ItemGenerator;

public class SapphireFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Sapphire();
    }
}