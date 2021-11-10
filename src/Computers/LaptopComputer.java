package Computers;

import Mouses.Mouse;

public class LaptopComputer implements Computer{
    Mouse mouse;
    private final boolean keyboardAttached = false;
    public LaptopComputer(Mouse mouse)
    {
        this.mouse=mouse;
    }

    public LaptopComputer()
    {
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

    @Override
    public void attachMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
