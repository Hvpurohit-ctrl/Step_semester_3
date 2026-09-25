public class Question1 {
    private int health;
    private final int maxHealth;

    public Question1(int maxHealth) {
        this.maxHealth = maxHealth;
        health = maxHealth;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }

    public int getHealth() {
        return health;
    }
}