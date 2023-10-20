package osztalyokOroklodese.Music;

public class Violin extends StringedInstrument{
    public Violin(int _strings, String _sound)
    {
        this.numberOfStrings = _strings;
        this.sound = _sound;
        this.name = "Violin";
    }

    public Violin(String _sound)
    {
        this.numberOfStrings = 4;
        this.sound = _sound;
        this.name = "Violin";
    }

    @Override
    public String toString()
    {
        return "Violin: " + this.name + "; " + this.sound + "; " + this.numberOfStrings;
    }
}
