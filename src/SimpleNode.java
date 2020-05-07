/* Generated By:JJTree: Do not edit this line. SimpleNode.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */

import java.util.*;

public
class SimpleNode implements Node {
    public Set<String> freeVariables;
    public Node parent;
    public Node[] children;
    protected int id;
    public Object value;
    protected Prog3 parser;

    public SimpleNode(int i) {
        id = i;
        freeVariables = new HashSet<>();
    }

    public SimpleNode(Prog3 p, int i) {
        this(i);
        parser = p;
        freeVariables = new HashSet<>();
    }

    public void jjtOpen() {
    }

    public void jjtClose() {
    }

    public void jjtSetParent(Node n) {
        parent = n;
    }

    public Node jjtGetParent() {
        return parent;
    }

    public void jjtAddChild(Node n, int i) {
        if (children == null) {
            children = new Node[i + 1];
        } else if (i >= children.length) {
            Node c[] = new Node[i + 1];
            System.arraycopy(children, 0, c, 0, children.length);
            children = c;
        }
        children[i] = n;
    }

    public Node jjtGetChild(int i) {
        return children[i];
    }

    public int jjtGetNumChildren() {
        return (children == null) ? 0 : children.length;
    }

    public void jjtSetValue(Object value) {
        this.value = value;
    }

    public Object jjtGetValue() {
        return value;
    }

  /* You can override these two methods in subclasses of SimpleNode to
     customize the way the node appears when the tree is dumped.  If
     your output uses more than one line you should override
     toString(String), otherwise overriding toString() is probably all
     you need to do. */

    public String toString() {
        return Prog3TreeConstants.jjtNodeName[id];
    }

    public String toString(String prefix) {
        return prefix + toString();
    }

  /* Override this method if you want to customize how the node dumps
     out its children. */

    public void dump(String prefix) {
        System.out.println(toString(prefix));
        if (children != null) {
            for (Node child : children) {
                SimpleNode n = (SimpleNode) child;
                if (n != null) {
                    n.dump(prefix + " ");
                }
            }
        }
    }

    public Set<String> freeVars() {
        return freeVariables;
    }

    public void dumpFV(String prefix) {
        System.out.println(toString(prefix) + "   " + freeVars());
        if (children != null) {
            for (Node child : children) {
                SimpleNode n = (SimpleNode) child;
                if (n != null) {
                    n.dumpFV(prefix + " ");
                }
            }
        }
    }

    @Override
    public int getId() {
        return id;
    }

    public String printExpr() {
        return toString();
    }

    public SimpleNode substitute(String varToSubstitute, SimpleNode expression) {

        return this;
    }

    public SimpleNode application(String var, SimpleNode expr) {

        return this;
    }

    public SimpleNode normalOrderEvaluation() {

        return this;
    }

    public boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isOperator(String input) {
        return (input.equals("*") || input.equals("/") || input.equals("-") || input.equals("+"));
    }

    public SimpleNode beta_redux(ASTLambda lambda, SimpleNode app) {
        return lambda.application(lambda.children[0].toString(), app);
    }
}

/* JavaCC - OriginalChecksum=11640d5668e43b1173de65ac0796edc7 (do not edit this line) */
