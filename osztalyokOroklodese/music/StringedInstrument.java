package osztalyokOroklodese.Music;

public abstract class StringedInstrument extends Instrument {

    int numberOfStrings;

    public void sound()
    {
        this.play();
    }

    @Override
    protected void play()
    {
        System.out.println(this.sound);
    }
}



