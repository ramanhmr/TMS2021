package car;

public class FailedToStartException extends Exception {

    public FailedToStartException(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
