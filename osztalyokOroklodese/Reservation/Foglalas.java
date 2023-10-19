package osztalyokOroklodese.Reservation;

import java.util.Random;

class Reservation implements Foglalhato{

    @Override
    public String getDOW()

    {
        Random R = new Random();
        int index = R.nextInt(6);
        return this.DOW[index];
    }

    @Override
    public String getCode()
    {
        return "";
    }

    

}
