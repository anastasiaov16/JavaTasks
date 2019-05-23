public class Hero {
    private int patrons = 10;
    private int lives = 5;

    public void Shoot(){
        if(patrons > 0){
            patrons--;
            System.out.println("Производим выстрел. Осталось " +  patrons + " патронов");

        }
        else
            System.out.println("Патронов больше нет");
    }
    // сохранение состояния
    public HeroMemento SaveState(){
        System.out.println("Сохранение игры. Параметры: " + patrons + " патронов, "  + lives + " жизней");
        return new HeroMemento(patrons, lives);
    }

    // восстановление состояния
    public void RestoreState(HeroMemento memento)
    {
        this.patrons=memento.Patrons;
        this.lives = memento.Lives;
        System.out.println("Восстановление игры. Параметры: " + patrons + " патронов, "  + lives + " жизней");
    }
}
