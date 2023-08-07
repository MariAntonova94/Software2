package seminar2.task1.Classes.Rewards.Bronze;

import seminar2.task1.Classes.IGameItem;

public class Bronze implements IGameItem {
    @Override
    public void open() {
        System.out.println("Bronze!");
    }
}