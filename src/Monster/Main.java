/**
 * Project: Monster Lab
 * Purpose Details: Demonstrates abstraction, inheritance, polymorphism, and enums.
 * Course: IST 242
 * Author: Alexander Hurtak
 * Date Developed: 05/30/2026
 * Last Date Changed: 05/31/2026
 * Rev: 1
 */


package Monster;

public class Main {

    public static void main(String[] args) {

        Monster monster1 = new Dragon("Fatalis", 100, 10, "Black");
        Monster monster2 = new Zombie("Frankenstein", 60, 5, "Green");
        Monster monster3 = new Ghost("Casper", 50, 6, "White");
        Monster monster4 = new Vampire("Dracula", 90, 9, "Red");

        monster1.setPower(SpecialPower.FIRE_BREATH);
        monster2.setPower(SpecialPower.POISON);
        monster3.setPower(SpecialPower.INVISIBILITY);
        monster4.setPower(SpecialPower.TELEPORTATION);


        Monster[] monsters = {
                monster1,
                monster2,
                monster3,
                monster4,

        };

        for (Monster monster : monsters) {

            System.out.println("Name: " + monster.getName());
            System.out.println("Health: " + monster.getHealth());
            System.out.println("Level: " + monster.getLevel());
            System.out.println("Color: " + monster.getColor());
            System.out.println("Power: " + monster.getPower());

            monster.specialPowers();

            System.out.println();
        }
    }
}