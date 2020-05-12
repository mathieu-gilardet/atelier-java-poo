public class Arena {

    public static void main(String[] args) {
        Monster monster1 = new Monster("Carapuce");
        Monster monster2 = new Monster("Salameche");
        monster1.attack(monster2);
        monster2.attack(monster1);
        monster1.attack(monster2);
        monster1.attack(monster2);
        monster1.attack(monster2);
        monster2.attack(monster1);
        monster1.attack(monster2);
        monster2.attack(monster1);
        monster1.attack(monster2);
        monster2.attack(monster1);
        monster1.attack(monster2);
        monster2.attack(monster1);
        monster1.attack(monster2);
        monster2.attack(monster1);

    }

}
