package Class_dolgozat;

import java.util.ArrayList;
import java.util.List;

public class Kert {
    public List<Virag> Viragok;
    public List<Fa> Fak;

    public Kert()
    {
        Viragok = new ArrayList<Virag>();
        Fak = new ArrayList<Fa>();
    }

    public void ontoz(int menyiseg)
    {

        System.out.println("Öntözés " + menyiseg);

        int ontozendo_db = 0;

        for (Fa fa : Fak) {
            
            if(fa.kelle_ontozni())
            {
                ontozendo_db++;
            }
        }

        for (Virag virag : Viragok) {
            
            if(virag.kelle_ontozni())
            {
                ontozendo_db++;
            }
        }

        int ontozheto_viz = menyiseg / ontozendo_db;

        for (Fa fa : Fak) {
            
            if(fa.kelle_ontozni())
            {
                fa.viz_menyiseg += ontozheto_viz * 0.4;
            }
        }

        for (Virag virag : Viragok) {
            
            if(virag.kelle_ontozni())
            {
                virag.viz_menyiseg += ontozheto_viz * 0.75;
            }
        }

        kertAllapot();
    }

    public void kertAllapot()
    {
        for (Virag virag : Viragok) {            
            virag.allapot();
        }

        for (Fa fa : Fak) {
            fa.allapot();
        }


    }

    public static void main(String[] args) {
        Kert kert = new Kert();

        Virag sargaVirag = new Virag("sárga");
        Virag kekVirag = new Virag("kék");

        kert.Viragok.add(sargaVirag);
        kert.Viragok.add(kekVirag);

        Fa loncFa = new Fa("lonc");
        Fa narancsFa = new Fa("narancs");

        kert.Fak.add(narancsFa);
        kert.Fak.add(loncFa);

        kert.kertAllapot();

        kert.ontoz(40);

        kert.ontoz(70);
    }
}
