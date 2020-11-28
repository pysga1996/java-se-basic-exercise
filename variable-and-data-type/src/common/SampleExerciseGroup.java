package common;

import java.awt.event.KeyEvent;
import sample.ex1.Variables;
import sample.ex10.Interest;
import sample.ex11.GreatestCommonDivisor;
import sample.ex2.Operators;
import sample.ex3.SystemTime;
import sample.ex4.Menu;
import sample.ex5.LinearEquationResolver;
import sample.ex6.Prime;
import sample.ex7.LeapYear;
import sample.ex8.Weight;
import sample.ex9.Days;

public class SampleExerciseGroup implements ExerciseGroup {

    @Override
    public void showMenu() {
        System.out.println("Enter a command: ");
        System.out.println("1. Variable");
        System.out.println("2. Operator");
        System.out.println("3. System Time");
        System.out.println("4. Design Menu");
        System.out.println("5. Linear Equation Resolver");
        System.out.println("6. Prime checker");
        System.out.println("7. Leap Year checker");
        System.out.println("8. Weight Calculator");
        System.out.println("9. Count days in month");
        System.out.println("A. Interest Calculator");
        System.out.println("B. Greatest common divisor");
    }

    @Override
    public void executeCommand(int cmd) {
        Exercise exercise;
        switch (cmd) {
            case KeyEvent.VK_1:
                exercise = new Variables();
                break;
            case KeyEvent.VK_2:
                exercise = new Operators();
                break;
            case KeyEvent.VK_3:
                exercise = new SystemTime();
                break;
            case KeyEvent.VK_4:
                exercise = new Menu();
                break;
            case KeyEvent.VK_5:
                exercise = new LinearEquationResolver();
                break;
            case KeyEvent.VK_6:
                exercise = new Prime();
                break;
            case KeyEvent.VK_7:
                exercise = new LeapYear();
                break;
            case KeyEvent.VK_8:
                exercise = new Weight();
                break;
            case KeyEvent.VK_9:
                exercise = new Days();
                break;
            case KeyEvent.VK_A:
                exercise = new Interest();
                break;
            case KeyEvent.VK_B:
                exercise = new GreatestCommonDivisor();
                break;
            case KeyEvent.VK_0:
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
