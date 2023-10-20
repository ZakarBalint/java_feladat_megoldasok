package osztalyokOroklodese.Reservation;

interface Foglalhato {
    String[] DOW = {"MON", "TUE", "WEN", "THU", "FRI", "SAT", "SUN"};

    abstract String getDOW();
    abstract String getCode();
}
