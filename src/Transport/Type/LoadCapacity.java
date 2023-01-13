package Transport.Type;

public enum LoadCapacity {
    N1 ("с полной массой до 3,5 тонн"),
    N2 ("с полной массой свыше 3,5 до 12 тонн"),
    N3 ("с полной массой свыше 12 тонн");

    private String translation;

    LoadCapacity(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "грузоподьемность: " + translation ;
    }
}
