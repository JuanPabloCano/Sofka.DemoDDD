package co.com.sofka.domain.rehabilitation.events;

import co.com.sofka.domain.rehabilitation.values.Diagnostic_;
import co.com.sofka.generic.DomainEvent;

public class DiagnosticSaved extends DomainEvent {

    private final Diagnostic_ diagnostic;

    public DiagnosticSaved(Diagnostic_ diagnostic) {
        super("sofka.rehabilitation.diagnosticSaved");
        this.diagnostic = diagnostic;
    }

    public Diagnostic_ Diagnostic() {
        return diagnostic;
    }
}
