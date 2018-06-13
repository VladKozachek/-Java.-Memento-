public class File {  //Caretaker   //хранит состояние игры
    private Save save;

    public Save getSave() {  //возвращаем состояние сохраненной иры
        return save;
    }

    public void setSave(Save save) {  //записываем состояние сохраненной иры
        this.save = save;
    }
}
