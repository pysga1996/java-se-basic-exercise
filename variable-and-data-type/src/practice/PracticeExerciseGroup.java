package practice;

import common.Exercise;
import common.ExerciseGroup;
import java.awt.event.KeyEvent;
import practice.ex1.Greeting;
import practice.ex2.Monetary;
import practice.ex3.NumberNarrator;
import practice.ex4.Shapes;
import practice.ex5.First20Primes;
import practice.ex6.Under100Primes;

public class PracticeExerciseGroup implements ExerciseGroup {

    @Override
    public void showMenu() {
        System.out.println("Enter a command: ");
        System.out.println("1. Greeting");
        System.out.println("2. Monetary");
        System.out.println("3. Number Narrator");
        System.out.println("4. Shapes");
        System.out.println("5. Find first 20 primes");
        System.out.println("6. Find primes less than 100");
    }

    @Override
    public void executeCommand(int cmd) {
        Exercise exercise;
        switch (cmd) {
            case KeyEvent.VK_1:
            case KeyEvent.VK_NUMPAD1:
                exercise = new Greeting();
                break;
            case KeyEvent.VK_2:
            case KeyEvent.VK_NUMPAD2:
                exercise = new Monetary();
                break;
            case KeyEvent.VK_3:
            case KeyEvent.VK_NUMPAD3:
                exercise = new NumberNarrator();
                break;
            case KeyEvent.VK_4:
            case KeyEvent.VK_NUMPAD4:
                exercise = new Shapes();
                break;
            case KeyEvent.VK_5:
            case KeyEvent.VK_NUMPAD5:
                exercise = new First20Primes();
                break;
            case KeyEvent.VK_6:
            case KeyEvent.VK_NUMPAD6:
                exercise = new Under100Primes();
                break;
            case KeyEvent.VK_0:
            case KeyEvent.VK_NUMPAD0:
                return;
            default:
                System.err.println("Unknown command!!!");
                return;
        }
        System.out.print("\n>>> Begin >>>\n");
        exercise.start();
        System.out.print("\n<<< End <<<\n\n");
    }
}
