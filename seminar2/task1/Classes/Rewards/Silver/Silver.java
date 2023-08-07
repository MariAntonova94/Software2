package seminar2.task1.Classes.Rewards.Silver;

import seminar2.task1.Classes.IGameItem;

public class Silver implements IGameItem {

    @Override
    public void open() {
        System.out.println("Silver!");
    }
}