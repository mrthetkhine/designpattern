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
public interface ExpressionVisitor {
    void visit(Number number);
    void visit(PlusExpression plus);
    void visit(MinusExpression minus);
            
}
