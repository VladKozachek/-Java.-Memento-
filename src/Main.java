public class Main {
    public static void main(String[] args) {
        Game game=new Game();    //создали игру
        game.setLevel("Уровень 1",50000); //выбрали уровень
        System.out.println(game); //вывели на экран

        File file=new File();   //создали хранителя  состояния
        file.setSave(game.save()); //записали в хранитель, состояние игры


        game.setLevel("Уровень 2",100000); // играем дальше
        System.out.println(game);             //выводим новый уровень на экран

        System.out.println("Загрузка");
        game.loadSave(file.getSave());     // загружаем старое сохранение из хранителя
        System.out.println(game);         // выводим на экран
    }
}
