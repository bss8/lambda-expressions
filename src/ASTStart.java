/* Generated By:JJTree: Do not edit this line. ASTStart.java Version 7.0.5 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTStart extends SimpleNode {
    public ASTStart(int id) {
        super(id);
    }

    public ASTStart(Prog3 p, int id) {
        super(p, id);
    }

    @Override
    public SimpleNode substitute(String varToSubstitute, SimpleNode expression) {
        expression.dump("");
        System.out.print("\n");

        String firstChildString = children[0].toString();
        System.out.println(firstChildString);

        if ("Lambda".equals(firstChildString)) {
            return ((ASTLambda) children[0]).substitute(varToSubstitute, expression);
        } else if ("Appl".equals(firstChildString)) {
            return ((ASTAppl) children[0]).substitute(varToSubstitute, expression);
        } else if (firstChildString.equals(varToSubstitute)) {
            return expression;
        }
        return this;
    }

    @Override
    public ASTStart normalOrderEvaluation() {
        return this;
    }

    @Override
    public String toString(String prefix) {
        return "";
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public String printExpr() {
        StringBuilder str = new StringBuilder(30);
        if (children != null) {
            for (Node child : children) {
                SimpleNode n = (SimpleNode) child;
                if (n != null) {
                    str.append(n.printExpr());
                }
            }
        }
        return str.toString();
    }

    @Override
    public void dump(String prefix) {
        if (children != null) {
            for (Node child : children) {
                SimpleNode n = (SimpleNode) child;
                if (n != null) {
                    n.dump(prefix + " ");
                }
            }
        }
    }

    @Override
    public void dumpFV(String prefix) {
        if (children != null) {
            for (Node child : children) {
                SimpleNode node = (SimpleNode) child;
                if (node != null) {
                    node.dumpFV(prefix + " ");
                }
            }
        }
    }
}
/* JavaCC - OriginalChecksum=42c3ebedfed11913df326306f2137d61 (do not edit this line) */
