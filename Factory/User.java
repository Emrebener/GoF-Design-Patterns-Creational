public final class User {
    private final String email;
    private final boolean verified;

    private User(String email, boolean verified) {
        this.email = email;
        this.verified = verified;
    }

    public static User newSignup(String email) {
        return new User(email, false);
    }

    public static User restoredFromBackup(String email) {
        return new User(email, true);
    }
}
