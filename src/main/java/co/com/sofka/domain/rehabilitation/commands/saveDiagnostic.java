package co.com.sofka.domain.rehabilitation.commands;

import co.com.sofka.domain.rehabilitation.values.Diagnostic_;

public class saveDiagnostic {

    private final Diagnostic_ diagnostic;

    public saveDiagnostic(Diagnostic_ diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Diagnostic_ getDiagnostic() {
        return diagnostic;
    }
}
