public class Game {  //originator
    private String level;
    private int time;

    public void setLevel(String level,int time) {
        this.level = level;
        this.time = time;
    }
    public void loadSave(Save save){
        level=save.getLevel();
        time=save.getTime();
    }
    public Save save(){
        return new Save(level,time);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", time=" + time +
                '}';
    }
}
