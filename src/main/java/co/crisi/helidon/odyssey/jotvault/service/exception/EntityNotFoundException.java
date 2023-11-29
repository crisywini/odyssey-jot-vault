package co.crisi.helidon.odyssey.jotvault.service.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
