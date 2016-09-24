/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretervisitor;

/**
 *
 * @author Mr T.Khine
 */
public class SyntaxAnalyzingVisitor implements ExpressionVisitor{

    @Override
    public void visit(Number number) {
        System.out.println("Check number ");
    }

    @Override
    public void visit(PlusExpression plus) {
        
        System.out.println("Check +");
        System.out.println("Check plus left ");
        plus.leftOperand.accept(this);
        System.out.println("Check plus right ");
        plus.rightOperand.accept(this);
    }

    @Override
    public void visit(MinusExpression minus) {
        System.out.println("Check -");
        System.out.println("Check minus left ");
        minus.leftOperand.accept(this);
        System.out.println("Check minus right ");
        minus.rightOperand.accept(this);
    }
    
}
