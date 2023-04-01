package org.example.behavioral_patterns.interpreter;

import java.util.List;

public interface Expression {
    List<String> interpret(Context ctx);
}
