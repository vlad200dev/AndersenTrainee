package task_1;

public class StillNotReadyCoreException extends Exception {

    public StillNotReadyCoreException(String message) {
        super("Still not working at full capacity");
    }

    public StillNotReadyCoreException() {
    }
}
