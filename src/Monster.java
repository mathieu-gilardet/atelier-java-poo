class Monster {

    private String name;
    private int damage = (int)(Math.random() * 5);
    private int life = 20;

    public Monster(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void attack(Monster thatMonster) {
        //thatMonster.life - damage
//        thatMonster.life -= this.damage;
//        thatMonster.life = thatMonster.life - damage;
        thatMonster.setLife(thatMonster.getLife() - damage);

        if (thatMonster.getLife() > 0) {
            System.out.println(thatMonster.getName() + " has "
            + thatMonster.getLife() + " points remaining");
        } else {
            System.out.println(thatMonster.getName() + " ko!");
        }
    }
}