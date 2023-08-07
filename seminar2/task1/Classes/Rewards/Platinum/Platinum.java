package seminar2.task1.Classes.Rewards.Platinum;

import seminar2.task1.Classes.IGameItem;

public class Platinum implements IGameItem {
    @Override
    public void open() {
        System.out.println("Platinum!");
    }
}