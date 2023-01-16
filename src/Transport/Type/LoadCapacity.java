package Transport.Type;

public enum LoadCapacity {
    N1(0,3.5f),
    N2(3.5f,12f),
    N3(12f,0);

    private float loadLimitBase;
    private float loadLimitMax;

    LoadCapacity(float loadLimitBase, float loadLimitMax) {
        this.loadLimitBase = loadLimitBase;
        this.loadLimitMax = loadLimitMax;
    }


    @Override
    public String toString() {
        return String.format("Грузоподьемность: %s,%s",(loadLimitBase!=0? "от "+loadLimitBase : ""),(loadLimitMax!=0? " до "+loadLimitMax : "")) ;
    }
}
