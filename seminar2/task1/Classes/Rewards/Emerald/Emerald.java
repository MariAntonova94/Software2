package seminar2.task1.Classes.Rewards.Emerald;

import seminar2.task1.Classes.IGameItem;

public class Emerald  implements IGameItem {
    @Override
    public void open() {
        System.out.println("Emerald!");
    }
}