//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All void visitors must implement this interface.
 */

public interface Visitor {

   //
   // void Auto class visitors
   //

   public void visit(NodeList n);
   public void visit(NodeListOptional n);
   public void visit(NodeOptional n);
   public void visit(NodeSequence n);
   public void visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Line() )*
    * f1 -> <EOF>
    */
   public void visit(Goal n);

   /**
    * f0 -> Expression()
    */
   public void visit(Line n);

   /**
    * f0 -> IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ListExpr()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | MultiplyExpression()
    *       | DivideExpression()
    *       | GTExpression()
    *       | LTExpression()
    *       | EQExpression()
    *       | IfExpression()
    *       | DefineExpression()
    *       | Assignment()
    *       | ProcedureExp()
    *       | CarExpr()
    *       | CdrExpr()
    *       | Application()
    */
   public void visit(Expression n);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n);

   /**
    * f0 -> "#t"
    */
   public void visit(TrueLiteral n);

   /**
    * f0 -> "#f"
    */
   public void visit(FalseLiteral n);

   /**
    * f0 -> "("
    * f1 -> "list "
    * f2 -> ( IntegerLiteral() )*
    * f3 -> ")"
    */
   public void visit(ListExpr n);

   /**
    * f0 -> "("
    * f1 -> "+"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(PlusExpression n);

   /**
    * f0 -> "("
    * f1 -> "-"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(MinusExpression n);

   /**
    * f0 -> "("
    * f1 -> "*"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(MultiplyExpression n);

   /**
    * f0 -> "("
    * f1 -> "/"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(DivideExpression n);

   /**
    * f0 -> "("
    * f1 -> ">"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(GTExpression n);

   /**
    * f0 -> "("
    * f1 -> "<"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(LTExpression n);

   /**
    * f0 -> "("
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(EQExpression n);

   /**
    * f0 -> "("
    * f1 -> "if"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(IfExpression n);

   /**
    * f0 -> "("
    * f1 -> "define"
    * f2 -> Identifier()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(DefineExpression n);

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n);

   /**
    * f0 -> "("
    * f1 -> "car"
    * f2 -> Expression()
    * f3 -> ")"
    */
   public void visit(CarExpr n);

   /**
    * f0 -> "("
    * f1 -> "cdr"
    * f2 -> Expression()
    * f3 -> ")"
    */
   public void visit(CdrExpr n);

   /**
    * f0 -> "("
    * f1 -> "set!"
    * f2 -> Identifier()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(Assignment n);

   /**
    * f0 -> "("
    * f1 -> "lambda"
    * f2 -> "("
    * f3 -> ( Identifier() )*
    * f4 -> ")"
    * f5 -> Expression()
    * f6 -> ")"
    */
   public void visit(ProcedureExp n);

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ( Expression() )*
    * f3 -> ")"
    */
   public void visit(Application n);

}

