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
public class Number implements Expression{

    int number;
    public Number(int number)       
    { 
        this.number = number; 
    }
    @Override
    public int interpret(Map<String, Expression> variables) {
        return this.number;
    }
    @Override
    public void accept(ExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
