/*
* File: App.java
* Author: Kukta Tamara
* Copyright: 2023, Kukta Tamara
* Group: SZOFT II/1/E
* Date: 2023-11-29
* Github: https://github.com/KTamara86/Feladat009.git
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {

        Controller cont = new Controller();
            cont.start();
            cont.stop();
            cont.restart();
    }
}
