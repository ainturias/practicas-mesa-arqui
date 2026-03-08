package memento;

public class Game {

    private String name;
    private int level;
    private int kills;
    private static MementoManager mementoManager = new MementoManager();

    public Game() {
    }

    public Game(String name) {
        this.name = name;
    }

    public Game(String name, int level, int kills) {
        this.name = name;
        this.level = level;
        this.kills = kills;
    }

    public void save() {
        mementoManager.save(new Memento(this));
    }

    public void back() {
        Memento memento = mementoManager.undo();
        setLevel(memento.getLevel());
        setKills(memento.getKills());
    }

    // rehacer
    public void forward() {
        Memento memento = mementoManager.redo();
        setLevel(memento.getLevel());
        setKills(memento.getKills());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    @Override
    public String toString() {
        return "Game{" + "name=" + name + ", level=" + level + ", kills=" + kills + '}';
    }

}
