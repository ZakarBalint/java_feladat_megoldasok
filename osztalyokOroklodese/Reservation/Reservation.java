package osztalyokOroklodese.Reservation;

import java.util.Random;

class Reservation implements Foglalhato{

    String day;
    String code;

    public Reservation()
    {
        day = getDOW();
        code = getCode();
    }

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
        Random R = new Random();
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String code = "";

        for(int i = 0; i < 8; i++)
        {
            code += SALTCHARS.charAt(R.nextInt(36));
        }

        return code.toUpperCase();
    }

    @Override
    public String toString()
    {
        return "Booking# " + this.code + " for " + this.day;
    }
}
