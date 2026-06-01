/**
 * Project: Monster Lab
 * Purpose Details: Demonstrates abstraction, inheritance, polymorphism, and enums.
 * Course: IST 242
 * Author: Alexander Hurtak
 * Date Developed: 05/31/2026
 * Last Date Changed: 05/31/2026
 * Rev: 1
 */

package Monster;

public final class Dragon extends Monster {

    public Dragon(String name, int health, int level, String color) {
        super(name, health, level, color);
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " breathes fire using " + getPower() + "!");
    }
}