package Class_dolgozat;

public class Virag extends Noveny {
    
    public Virag(String _nev)
    {
        nev = _nev;
        viz_menyiseg = 0;
    }

    @Override
    public boolean kelle_ontozni()
    {
        if(this.viz_menyiseg < 5)
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
            System.out.println("A " + this.nev + " virágnak vízre van szüksége");
        }
        else
        {
            System.out.println("A " + this.nev + " virágnak nincs szüksége vízre");
        }
    }
}
