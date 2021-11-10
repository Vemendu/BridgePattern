import Computers.Computer;
import Computers.DesktopComputer;
import Computers.LaptopComputer;
import Mouses.Mouse;
import Mouses.WiredMouse;
import Mouses.WirelessMouse;

public class Main {
    public static void main(String[] args) {
        Mouse Corsair = new WiredMouse();
        Computer lenovoLegion = new LaptopComputer();
        lenovoLegion.attachMouse(Corsair);
        lenovoLegion.powerOn();
        Mouse Logitech = new WirelessMouse();
        Computer gamingComputer = new DesktopComputer(Logitech);
        gamingComputer.powerOn();
        gamingComputer.changeSettings();
    }
}
