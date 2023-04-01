package org.example.behavioral_patterns.visitor.arithmetic;

public abstract class OpBinary extends Expression{
    Expression _izq, _der;
    public OpBinary(Expression izq, Expression der) {
        _izq = izq; _der = der;
    }
}
