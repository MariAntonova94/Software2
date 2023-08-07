package seminar2.task1;

import seminar2.task1.Classes.ItemGenerator;
import seminar2.task1.Classes.Rewards.Bronze.BronzeFabric;
import seminar2.task1.Classes.Rewards.Emerald.EmeraldFabric;
import seminar2.task1.Classes.Rewards.Gold.GoldFabric;
import seminar2.task1.Classes.Rewards.Platinum.PlatinumFabric;
import seminar2.task1.Classes.Rewards.Ruby.RubyFabric;
import seminar2.task1.Classes.Rewards.Sapphire.SapphireFabric;
import seminar2.task1.Classes.Rewards.Silver.SilverFabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator fab1 = new GoldFabric();
        fab1.openReward();
        ItemGenerator fab2 = new EmeraldFabric();
        fab2.openReward();
        ItemGenerator fab3 = new SilverFabric();
        fab3.openReward();
        ItemGenerator fab4 = new BronzeFabric();
        fab4.openReward();
        ItemGenerator fab5 = new PlatinumFabric();
        fab5.openReward();
        ItemGenerator fab6 = new RubyFabric();
        fab6.openReward();
        ItemGenerator fab7 = new SapphireFabric();
        fab7.openReward();
        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);
        fabricList.add(fab6);
        fabricList.add(fab7);

        for(int i=0;i<20;i++)
        {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}