package osztalyokOroklodese.music;

public class ElectricGuitar extends StringedInstrument{
    
    public ElectricGuitar(int _strings, String _sound)
    {
        this.numberOfStrings = _strings;
        this.sound = _sound;
        this.name = "ElectricGuitar";
    }

    public ElectricGuitar(String _sound)
    {
        this.numberOfStrings = 6;
        this.sound = _sound;
        this.name = "ElectricGuitar";
    }

    @Override
    public String toString()
    {
        return this.name + "; " + this.sound + "; " + this.numberOfStrings;
    }
}
