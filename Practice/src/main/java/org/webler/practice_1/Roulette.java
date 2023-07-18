package org.webler.practice_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Roulette {

    private int balance;
    private final int startingBalance;
    private int round = 1;
    private boolean[] blacks = new boolean[]{false, false, true, false, true, false, true, false, true, false, true, true, false, true, false, true, false, true, false, true, true, false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false

    };
    private Scanner sc = new Scanner(System.in);

    Roulette(int balance) {
        this.balance = Math.min(Math.max(1000, balance), 10000);
        this.startingBalance = this.balance;
    }

    private void printBetOptions(int round) {

        System.out.println(round + ". - kör.");
        System.out.println("Kérem adja meg a fogadás típusát és az összeget szóközzel elválasztva! Egyenleg: " + this.balance);

        System.out.println("1. számra fogadás");
        System.out.println("2. színre fogadás");
        System.out.println("3. páros/páratlan fogadás");
        System.out.println("4. 1-18 / 19-36 fogadás");
        System.out.println("5. 1-12 / 13-24 / 25 - 36 fogadás");

    }

    private int spinWheel() {
        Random rnd = new Random();
        this.round++;
        return rnd.nextInt(0, 37);
    }

    private void betOnNumber(int amount) {
        int selectedNumber = 0;
        while (true) {
            System.out.println("Kérem adja meg a számot amire fogadni szeretne!");
            System.out.println("A vissza lépéshez írjon be -1 et!");
            selectedNumber = sc.nextInt();

            if (selectedNumber == -1) {
                return;
            }
            if (selectedNumber > 0 && selectedNumber < 37) {
                break;
            } else {
                System.out.println("Kérem adjon meg egy rendes számot!");
            }
        }


        int number = spinWheel();
        if (selectedNumber == number) {
            System.out.println("Gratulálok nyertél");
            this.balance += amount * 35;
        } else {
            this.balance -= amount;
            System.out.println("Sajnos nem nyertél, a nyertes szám a " + number + " !");
        }

    }

    private void betOnColor(int amount) {
        int selectedNumber = -5;

        while (true) {
            System.out.println("Kérem adja meg a színt amire fogadni szeretne!");
            System.out.println("0 fekete");
            System.out.println("1 fehér");
            System.out.println("A vissza lépéshez írjon be -1 et!");
            selectedNumber = sc.nextInt();
            if (selectedNumber == -1) {
                return;
            }
            if (selectedNumber == 0 || selectedNumber == 1) {
                break;
            } else {
                System.out.println("Kérem adjon meg egy rendes számot!");
            }
        }


        int number = spinWheel();

        if (number == 0) {
            this.balance -= amount;
            System.out.println("Sajnos nem nyertél, a golyó a nullán állt meg!");
        }

        int color = blacks[number] ? 0 : 1;

        if (selectedNumber == color) {
            System.out.println("Gratulálok nyertél");
            this.balance += amount * 2;
        } else {
            this.balance -= amount;
            System.out.println("Sajnos nem nyertél, a nyertes szín a " + (color == 0 ? "fekete" : "fehér") + " !");
        }

    }

    private void betOnParity(int amount) {
        int selectedNumber = -5;

        while (true) {
            System.out.println("Kérem adja meg a színt amire fogadni szeretne!");
            System.out.println("0 páros");
            System.out.println("1 páratlan");
            System.out.println("A vissza lépéshez írjon be -1 et!");
            selectedNumber = sc.nextInt();
            if (selectedNumber == -1) {
                return;
            }
            if (selectedNumber == 0 || selectedNumber == 1) {
                break;
            } else {
                System.out.println("Kérem adjon meg egy rendes számot!");
            }
        }


        int number = spinWheel();

        if (number == 0) {
            this.balance -= amount;
            System.out.println("Sajnos nem nyertél, a golyó a nullán állt meg!");
        }

        if (number % 2 == selectedNumber) {
            System.out.println("Gratulálok nyertél");
            this.balance += amount * 2;
        } else {
            this.balance -= amount;
            System.out.println("Sajnos nem nyertél, a szám a " + number + " !");
        }

    }

    private void betOnHalf(int amount) {
        int selectedNumber = -5;

        while (true) {
            System.out.println("Kérem adja meg a színt amire fogadni szeretne!");
            System.out.println("0 1-18");
            System.out.println("1 19-36");
            System.out.println("A vissza lépéshez írjon be -1 et!");
            selectedNumber = sc.nextInt();
            if (selectedNumber == -1) {
                return;
            }
            if (selectedNumber == 0 || selectedNumber == 1) {
                break;
            } else {
                System.out.println("Kérem adjon meg egy rendes számot!");
            }
        }


        int number = spinWheel();

        if (number == 0) {
            this.balance -= amount;
            System.out.println("Sajnos nem nyertél, a golyó a nullán állt meg!");
        }


        int shift = selectedNumber * 18;
        if (number >= 1 + shift && number <= 18 + shift) {
            System.out.println("Gratulálok nyertél");
            this.balance += amount * 2;
        } else {
            this.balance -= amount;
            System.out.println("Sajnos nem nyertél, a szám a " + number + " !");
        }

    }

    private void betOnThird(int amount) {
        int selectedNumber = -5;

        while (true) {
            System.out.println("Kérem adja meg a színt amire fogadni szeretne!");
            System.out.println("0 1-12");
            System.out.println("1 13-24");
            System.out.println("2 25-36");
            System.out.println("A vissza lépéshez írjon be -1 et!");
            selectedNumber = sc.nextInt();
            if (selectedNumber == -1) {
                return;
            }
            if (selectedNumber == 0 || selectedNumber == 1 || selectedNumber == 2) {
                break;
            } else {
                System.out.println("Kérem adjon meg egy rendes számot!");
            }
        }


        int number = spinWheel();

        if (number == 0) {
            this.balance -= amount;
            System.out.println("Sajnos nem nyertél, a golyó a nullán állt meg!");
        }

        int third = -1;
        if (number > 0 && number < 13) {
            third = 0;
        }
        if (number > 12 && number < 25) {
            third = 1;
        }
        if (number > 24 && number < 37) {
            third = 2;
        }


        if (selectedNumber == third) {
            System.out.println("Gratulálok nyertél");
            this.balance += amount * 2;
        } else {
            this.balance -= amount;
            System.out.println("Sajnos nem nyertél, a szám a " + number + " !");
        }

    }


    private void log(String s) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.write(s+"\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void game() {


        while (true) {
            printBetOptions(round);

            int input = sc.nextInt();
            int bet = sc.nextInt();
            int sBalance = this.balance;



            if (bet > this.balance) {
                System.out.println("Nincs ennyi pénzed");
                continue;
            }

            switch (input) {
                case 1:
                    betOnNumber(bet);
                    break;
                case 2:
                    betOnColor(bet);
                    break;
                case 3:
                    betOnParity(bet);
                    break;
                case 4:
                    betOnHalf(bet);
                    break;
                case 5:
                    betOnThird(bet);
                    break;
                default:
                    System.out.println("Hibás input!");
                    break;
            }

            String s = this.round-1+"# Starting balance:"+sBalance+ "selected bet  " +input + " amount: " + bet + (sBalance<balance?"WIN":"LOSE") + "new balance " + balance;
            log(s);

            if (balance < 1) {
                System.out.println("Vesztettél!");
                return;
            }
            if (balance >= startingBalance * 2) {
                System.out.println("Győztél!");
                return;
            }


        }

    }


}
