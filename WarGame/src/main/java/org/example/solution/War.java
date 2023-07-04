package org.example.solution;

import java.io.IOException;
import java.util.Random;

public class War {

    public void battle(Army firstArmy, Army secondArmy) throws IOException {

        Warrior firstArmyWarrior = firstArmy.getWarrior();
        Warrior secondArmyWarrior = secondArmy.getWarrior();

        while (secondArmyWarrior != null && firstArmyWarrior != null) {

            Warrior winner = fight(firstArmyWarrior, secondArmyWarrior);

            if (winner.equals(firstArmyWarrior)) {
                secondArmyWarrior = secondArmy.getWarrior();
            } else {
                firstArmyWarrior = firstArmy.getWarrior();
            }

        }

        String winner = firstArmyWarrior == null ? secondArmy.getName() : firstArmy.getName();

        Logger.log("A győztes " + winner);

    }

    private Warrior fight(Warrior firstArmyWarrior, Warrior secondArmyWarrior) throws IOException {

        boolean firstWarriorIsAlive = true;
        boolean secondWarriorIsAlive = true;
        Random random = new Random();

        while (firstWarriorIsAlive && secondWarriorIsAlive) {
            boolean firstWarriorStart = random.nextBoolean();

            if (firstWarriorStart) {
                secondWarriorIsAlive = doDamage(firstArmyWarrior, secondArmyWarrior);
                if (secondWarriorIsAlive) {
                    firstWarriorIsAlive = doDamage(secondArmyWarrior, firstArmyWarrior);
                }
            } else {
                firstWarriorIsAlive = doDamage(secondArmyWarrior, firstArmyWarrior);
                if (firstWarriorIsAlive) {
                    secondWarriorIsAlive = doDamage(firstArmyWarrior, secondArmyWarrior);
                }
            }
        }

        return firstWarriorIsAlive ? firstArmyWarrior : secondArmyWarrior;


    }

    private boolean doDamage(Warrior attackWarrior, Warrior defendWarrior) throws IOException {

        defendWarrior.setHealth(defendWarrior.getHealth() - attackWarrior.getAttackValue());

        boolean isSurvived = defendWarrior.getHealth() > 0;
        String attackwarriorName = attackWarrior.getArmy().getName() + " - " + attackWarrior.getName();
        String deffendWarriorName = defendWarrior.getArmy().getName() + " - " + defendWarrior.getName();
        String damage = String.format("%04d", attackWarrior.getAttackValue());
        if (isSurvived) {



            Logger.log(attackwarriorName + " megtámadta " + deffendWarriorName + "-t és "
                    + damage +" sebzést okozott neki és " + defendWarrior.getHealth() +
                    " életereje maradt.");
        } else {
            Logger.log(attackwarriorName + " megtámadta " + deffendWarriorName + "-t és "
                    + damage + " sebzést okozott neki és meghalt");
        }


        return isSurvived;

    }


}
