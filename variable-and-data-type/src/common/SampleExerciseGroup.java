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

    private Exercise exercise;

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
        switch (cmd) {
            case KeyEvent.VK_1:
                this.exercise = new Variables();
                break;
            case KeyEvent.VK_2:
                this.exercise = new Operators();
                break;
            case KeyEvent.VK_3:
                this.exercise = new SystemTime();
                break;
            case KeyEvent.VK_4:
                this.exercise = new Menu();
                break;
            case KeyEvent.VK_5:
                this.exercise = new LinearEquationResolver();
                break;
            case KeyEvent.VK_6:
                this.exercise = new Prime();
                break;
            case KeyEvent.VK_7:
                this.exercise = new LeapYear();
                break;
            case KeyEvent.VK_8:
                this.exercise = new Weight();
                break;
            case KeyEvent.VK_9:
                this.exercise = new Days();
                break;
            case KeyEvent.VK_A:
                this.exercise = new Interest();
                break;
            case KeyEvent.VK_B:
                this.exercise = new GreatestCommonDivisor();
                break;
            default:
                System.err.println("Unknown command!!!");
                return;
        }
        exercise.start();
    }

}
