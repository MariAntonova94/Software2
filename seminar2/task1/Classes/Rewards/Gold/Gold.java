package seminar2.task1.Classes.Rewards.Gold;

import seminar2.task1.Classes.IGameItem;

public class Gold implements IGameItem {
    @Override
    public void open() {
        System.out.println("Gold!");
    }
}