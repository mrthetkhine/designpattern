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
public class CodeGenerationVisitor implements ExpressionVisitor{

    @Override
    public void visit(Number number) {
        System.out.println("PUSH "+number.number);
    }

    @Override
    public void visit(PlusExpression plus) {
        
        
        plus.leftOperand.accept(this);
        plus.rightOperand.accept(this);
        System.out.println("ADD");
    }

    @Override
    public void visit(MinusExpression minus) {
       
        minus.leftOperand.accept(this);
       
        minus.rightOperand.accept(this);
        System.out.println("SUB");
    }
    
}
