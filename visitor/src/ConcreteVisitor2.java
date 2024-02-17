public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        concreteElementA.operationA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        concreteElementB.operationB();
    }
}