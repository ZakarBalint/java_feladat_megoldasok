package Class_dolgozat;

public class Fa extends Noveny{
    
    public Fa(String _nev)
    {
        nev = _nev;
        viz_menyiseg = 0;
    }

    @Override
    public boolean kelle_ontozni()
    {
        if(this.viz_menyiseg < 10)
        {
            return true;
        }

        return false;
    }

    @Override
    
    public void allapot()
    {
        if(this.kelle_ontozni())
        {
            System.out.println("A " + this.nev + " fának vízre van szüksége");
        }
        else
        {
            System.out.println("A " + this.nev + " fának nincs szüksége vízre");
        }
    }
}
