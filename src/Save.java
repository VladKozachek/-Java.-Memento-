public class Save {  //Memento
    private final String level;
    private final int time;

    public Save(String level, int time) {
        this.level = level;
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public int getTime() {
        return time;
    }
}
