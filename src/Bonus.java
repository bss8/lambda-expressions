import java.io.*;
import java.util.*;

class Bonus {
    public static void main(String[] args) {
        String variable = "";
        System.out.println(">>> Lambda Expression Evaluator <<<");
        System.out.println("Enter an applied Lambda expression: ");
        Prog3 x = new Prog3(System.in);
        try {
            ASTStart z = x.Start();
            System.out.println("The abstract syntax tree: ");
            z.dump("");
            System.out.println();
            System.out.println("Enter the variable to be substituted: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            variable = (br.readLine()).trim();
            System.out.println();
            System.out.println("Enter the substituting applied Lambda expression: ");
            x.ReInit(System.in);
            ASTStart y = x.Start();
            System.out.println("The abstract syntax tree: ");
            ((SimpleNode) y.children[0]).dump("");
            System.out.println();
            System.out.println("The substitution result: ");
            SimpleNode sub = z.substitute(variable, (SimpleNode) y.children[0]);
            sub.dump("");
            System.out.println();
            System.out.println("Enter an applied Lambda expression: ");
            ASTStart v = (new Prog3(System.in)).Start();
            System.out.println();
            System.out.println("The normal order evaluation result: ");
            SimpleNode u = v.normalOrderEvaluation();
            u.dump("");
        } catch (Exception e) {
            System.out.println("Error:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}