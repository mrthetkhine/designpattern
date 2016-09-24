/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpretervisitor;

import java.util.Map;

/**
 *
 * @author Mr T.Khine
 */
public class PlusExpression implements Expression {
    Expression leftOperand;
    Expression rightOperand;
    public PlusExpression(Expression left, Expression right) { 
        leftOperand = left; 
        rightOperand = right;
    }
		
    public int interpret(Map<String,Expression> variables)  { 
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
