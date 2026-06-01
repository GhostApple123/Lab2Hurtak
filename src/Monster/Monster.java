/**
 * Project: Monster Lab
 * Purpose Details: Demonstrates abstraction, inheritance, polymorphism, and enums.
 * Course: IST 242
 * Author: Alexander Hurtak
 * Date Developed: 05/27/2026
 * Last Date Changed: 05/31/2026
 * Rev: 1
 */

package Monster;

public abstract class Monster {

    private String name;
    private int health;
    private int level;
    private String color;
    private SpecialPower power;

    public Monster(String name, int health, int level, String color) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public String getColor() {
        return color;
    }

    public SpecialPower getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(SpecialPower power) {
        this.power = power;
    }

    public abstract void specialPowers();
}