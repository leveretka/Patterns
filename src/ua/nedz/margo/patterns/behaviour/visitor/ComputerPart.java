package ua.nedz.margo.patterns.behaviour.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
