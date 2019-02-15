package dayeleven;
import java.io.IOException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Calc {
public static void main(String[] args) throws IOException, FindFailed {
		Runtime.getRuntime().exec("calc.exe");
		Screen s = new Screen();
        s.click("C:\\Users\\QAPLANET\\Desktop\\Calc.sikuli\\seven.png");
        s.click("C:\\Users\\QAPLANET\\Desktop\\Calc.sikuli\\plus.png");
        s.click("C:\\Users\\QAPLANET\\Desktop\\Calc.sikuli\\one.png");
        s.click("C:\\Users\\QAPLANET\\Desktop\\Calc.sikuli\\equals.png");
        s.click("C:\\Users\\QAPLANET\\Desktop\\Calc.sikuli\\quit.png");
	}

}
