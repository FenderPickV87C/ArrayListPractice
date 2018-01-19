package main;

public class DraftClass
{
    ArrayList<Player> eligiblePlayers;

    public DraftClass()
    {
        eligiblePlayers = new ArrayList<Player>();
    }

    public void addPlayer(Player p)
    {
        eligiblePlayers.add(p);
    }
}
