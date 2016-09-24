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
public interface Expression {
     public int interpret(Map<String,Expression> variables);
     public void accept( ExpressionVisitor visitor);
}
