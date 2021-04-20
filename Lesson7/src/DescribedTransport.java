public interface DescribedTransport {
    default String description() {
        return "No description";
    }
}
