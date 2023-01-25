package Transport.Type;

public enum PassengerCapacityV2 {
    VERY_SMALL(10),
    SMALL (25),
    MEDIUM (40),
    MEDIUM2(50),
    LARGE (60),
    LARGE2(80),
    VERY_LARGE (100),
    VERY_LARGE2(120);


    private int translation;

    PassengerCapacityV2(int translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return ""+translation;
    }

}

