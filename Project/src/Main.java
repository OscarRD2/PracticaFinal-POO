import Presentation.Menu;
import Presentation.Controller;


public class Main {

    public static void main(String[] args) {
	// write your code here


     Menu menu = new Menu();
     Controller c = new Controller(menu);
     c.run();

    }
}
