package Transport;

public class CantClassCompatibleException extends RuntimeException {
    public CantClassCompatibleException() {
    }

    public CantClassCompatibleException(String message) {
        super(message);
    }

    public CantClassCompatibleException(String message, Throwable cause) {
        super(message, cause);
    }

    public CantClassCompatibleException(Throwable cause) {
        super(cause);
    }

    public CantClassCompatibleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "Не совместимы категории водитель и транспорт";
    }
}
