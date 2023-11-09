package osztalyokOroklodese.Music;

public class BassGuitar extends StringedInstrument{
    
    public BassGuitar(int _strings, String _sound)
    {
        this.numberOfStrings = _strings;
        this.sound = _sound;
        this.name = "BassGuitar";
    }

    public BassGuitar(String _sound)
    {
        this.numberOfStrings = 4;
        this.sound = _sound;
        this.name = "BassGuitar";
    }

    @Override
    public String toString()
    {
        return this.name + "; " + this.sound + "; " + this.numberOfStrings;
    }
}
