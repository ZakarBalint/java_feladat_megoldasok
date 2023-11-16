package Class_dolgozat;

public class Noveny {
    public String nev;
    public int viz_menyiseg;

    public boolean kelle_ontozni()
    {
        if(this.viz_menyiseg <= 0)
        {
            return true;
        }

        return false;
    }

    public void allapot()
    {
        if(this.kelle_ontozni())
        {
            System.out.println("A " + this.nev + " növénynek vízre van szüksége");
        }
        else
        {
            System.out.println("A " + this.nev + " növénynek nincs szüksége vízre");
        }
    }


}
