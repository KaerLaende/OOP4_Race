package Transport;

public class CantDunDiagnosedException extends Exception {
    private  Transport transport;

    @Override
    public String toString() {
        return "Не возможно пройти диагностику: " /*как мне здесь прописать название того обьекта у которого была вызвана эта ошибка?*/;
    }

    public CantDunDiagnosedException(String message, Transport transport) {
        super(message);
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public CantDunDiagnosedException() {
    }
}
