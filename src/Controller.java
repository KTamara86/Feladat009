/*
* File: Controller.java
* Author: Kukta Tamara
* Copyright: 2023, Kukta Tamara
* Group: SZOFT II/1/E
* Date: 2023-11-29
* Github: https://github.com/KTamara86/Feladat009.git
* Licenc: GNU GPL
*/

public class Controller implements Controllable {


    @Override
    public void start() {
        System.out.println("Start funkció működik!");   
    }

    @Override
    public void stop() {
        System.out.println("Stop funkció működik!"); 
    }  
    
    @Override
    public void restart() {
        System.out.println("Restart funkció működik!");
    }
}
