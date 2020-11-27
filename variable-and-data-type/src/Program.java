import java.awt.event.KeyEvent;
import java.io.InputStream;
import sample.ex1.Variables;
import sample.ex2.Operators;
import sample.ex3.LinearEquationResolver;

public class Program {

  public static void main(String[] args) {
    System.out.print("Enter a command: ");
    int cmd;
    try (InputStream is = System.in) {
      do {
        cmd = is.read();
        switch (cmd) {
          case KeyEvent.VK_1:
            Variables.start(args);
            break;
          case KeyEvent.VK_2:
            Operators.start(args);
            break;
          case KeyEvent.VK_3:
            LinearEquationResolver.start(args);
            break;
          case KeyEvent.VK_4:

        }
      } while (cmd != KeyEvent.VK_ESCAPE && cmd != KeyEvent.VK_BACK_SPACE);
    } catch (Exception ex) {
      StackTraceElement[] stackTrace = ex.getStackTrace();
      System.err.println("Error ar file: " + stackTrace[stackTrace.length - 2].getFileName());
      System.err.println("Error at method: " + stackTrace[stackTrace.length - 2].getMethodName());
      System.err.println("Error at line: " + stackTrace[stackTrace.length - 2].getLineNumber());
    }
  }

}
