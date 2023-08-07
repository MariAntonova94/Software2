package seminar2.task1.Classes;

public abstract class ItemGenerator {
    public void openReward()
    {
        IGameItem gameItem = createItem();
        gameItem.open();

    }
    public abstract IGameItem createItem();
}