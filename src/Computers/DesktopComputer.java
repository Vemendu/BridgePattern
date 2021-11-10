package Computers;

import Mouses.Mouse;

public class DesktopComputer implements Computer{
    Mouse mouse;
    boolean keyboardAttached;
    public DesktopComputer(Mouse mouse)
    {
        this.mouse=mouse;
        this.keyboardAttached = false;
    }

    public DesktopComputer()
    {
        this.keyboardAttached = false;
    }

    @Override
    public void changeSettings() {
        System.out.println("The settings are being changed");
    }

    @Override
    public void powerOn()
    {
        System.out.println("The computer has been powered on");
    }

    public void attachKeyboard() {
        keyboardAttached = true;
        System.out.println("The keyboard has been attached");
    }

    public void attachMouse(Mouse mouse) {
        this.mouse = mouse;
        System.out.println("The mouse has been attached");
    }
}
