package logeeknight.slide6;

public class Syntax {
    public String toString(Role role) {
        switch (role) {
            case SPEAKER:
                return "Speaker";
            case LISTENER:
                return "Listener";
            default:
                throw new IllegalStateException("Unexpected role " + role);
        }
    }
}


enum Role {
    SPEAKER,
    LISTENER
}