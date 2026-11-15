package SpB.Exception;

public class Register {
    public void register(String userId) {
        if (userId == null) {
            throw new IllegalArgumentException("ID가 비어 있습니다.");
        }
    }
}
