package org.example.behavioral_patterns.visitor.arithmetic;

public class Constant extends Expression {
    int _valor;

    public Constant(int valor) {
        _valor = valor;
    }

    public void aceptar(VisitorExpression v) {
        v.visitConstant(this);
    }
}
