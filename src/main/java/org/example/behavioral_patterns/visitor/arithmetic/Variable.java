package org.example.behavioral_patterns.visitor.arithmetic;

public class Variable extends Expression {
    String _variable;

    public Variable(String variable) {
        _variable = variable;
    }

    public void aceptar(VisitorExpression v) {
        v.visitVariable(this);
    }
}