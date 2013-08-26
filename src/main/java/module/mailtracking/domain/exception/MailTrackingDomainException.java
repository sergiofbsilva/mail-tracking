package module.mailtracking.domain.exception;

import javax.ws.rs.core.Response.Status;

import pt.ist.bennu.core.domain.exceptions.DomainException;

public class MailTrackingDomainException extends DomainException {

    public MailTrackingDomainException(String key, String... args) {
        super(null, key, args);
    }

    public MailTrackingDomainException(String bundle, String key, String... args) {
        super(bundle, key, args);
    }

    public MailTrackingDomainException(Status status, String bundle, String key, String... args) {
        super(status, bundle, key, args);
    }

    public MailTrackingDomainException(Throwable cause, String bundle, String key, String... args) {
        super(cause, bundle, key, args);
    }

    public MailTrackingDomainException(Throwable cause, Status status, String bundle, String key, String... args) {
        super(cause, status, bundle, key, args);
    }

}
