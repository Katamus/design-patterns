package org.example.behavioral_patterns.visitor.arithmetic;

public class Sum extends OpBinary {
    public Sum(Expression izq, Expression der) {
        super(izq, der);
    }

    public void aceptar(VisitorExpression v) {
        v.visitSum(this);
    }
}