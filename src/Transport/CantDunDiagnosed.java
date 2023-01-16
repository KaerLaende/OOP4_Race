package Transport;

public class CantDunDiagnosed extends Exception {
    private final Transport transport;

    public CantDunDiagnosed(String message, Transport transport) {
        super(message);
        this.transport = transport;
    }

}
