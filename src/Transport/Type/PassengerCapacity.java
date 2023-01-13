package Transport.Type;

public enum PassengerCapacity {

    VERY_SMALL("особо малая (до 10 мест)"),
    SMALL ("до 25"),
    MEDIUM ("40–50"),
    LARGE ("60–80"),
    VERY_LARGE ("100–120 мест");

    private String translation;

    PassengerCapacity(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "пассажировместимость: " + translation;
    }
}
