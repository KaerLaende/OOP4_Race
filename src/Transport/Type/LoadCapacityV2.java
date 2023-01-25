package Transport.Type;

public enum LoadCapacityV2 {
   N1(3.5f), N2(12f);
    private float loadLimit;

    LoadCapacityV2(float loadLimit) {
        this.loadLimit = loadLimit;
    }

    @Override
    public String toString() {
        return loadLimit + "тонн" ;
    }

}
