package Transport.Type;

public enum BodyType {
    SEDAN("седан"),HETCHBACK("хетчбек"),COUPE("купе"),
    UNIVERSAL("универсал"), SUV("джип"),CROSSOVER("кроссовер"),
    PICKUP("пикап"),VAN("фургон"),MINIVAN("минивэн");

    private String translation;

    BodyType(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "тип кузова авто - "+translation;
    }
}
