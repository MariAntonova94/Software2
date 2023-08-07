package seminar2.task1.Classes.Rewards.Ruby;

import seminar2.task1.Classes.IGameItem;
import seminar2.task1.Classes.ItemGenerator;

public class RubyFabric extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Ruby();
    }
}