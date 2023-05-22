package org.example.strategy;

import org.example.checker.HaltChecker;

// Implementación del programa Reverser
public class Reverser implements ExecutionStrategy {
    private String program;
    private HaltChecker haltChecker;

    public Reverser(String program, HaltChecker haltChecker) {
        this.program = program;
        this.haltChecker = haltChecker;
    }

    public void execute() {
        String result = haltChecker.checkHalt(program, program);

        if (result.equals("para")) {
            // Bucle infinito
            while (true) {
                // Lógica adicional
                // ...
            }
        } else {
            // Retorna inmediatamente
            return;
        }
    }
}
