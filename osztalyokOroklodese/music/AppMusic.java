package osztalyokOroklodese.Music;

public class AppMusic {
    public static void main(String[] args) {
        Violin hegedu = new Violin("Screech");
        BassGuitar bassGitar = new BassGuitar(4, "Duum-duum-duum");
        ElectricGuitar electricGuitar = new ElectricGuitar("Twang");

        hegedu.sound();
        System.out.println(hegedu.toString());
        System.out.println(hegedu);
    }
}
