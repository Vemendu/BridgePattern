package Mouses;

public class WirelessMouse implements Mouse{
    public int dpi;
    @Override
    public void increaseDpi(int dpi)
    {
        this.dpi+=dpi;
        if(this.dpi>8000)
            this.dpi=8000;
    }
    @Override
    public void decreaseDpi(int dpi)
    {
        this.dpi-=dpi;
        if(this.dpi<0)
            this.dpi=0;
    }
}
