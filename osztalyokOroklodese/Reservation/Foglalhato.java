package osztalyokOroklodese.Reservation;

interface Foglahato {
    String[] DOW = ["MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"];

    abstract String getDOW();
    abstract String getCode();
}
