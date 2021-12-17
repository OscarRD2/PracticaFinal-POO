package Presentation;

public class Controller {

 private final Menu menu;

    public Controller(Menu menu) {
        this.menu = menu;
    }

    public void run() {
        String option;
        do {
            menu.showMenu();
            option = menu.askForString("Pick a faction: ");
            //executeOption(option);
        } while (option != "I" || option != "II");
    }

}
