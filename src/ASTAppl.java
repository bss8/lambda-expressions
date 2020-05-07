/* Generated By:JJTree: Do not edit this line. ASTAppl.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */

import java.util.*;

public
class ASTAppl extends SimpleNode {
    public ASTAppl(int id) {
        super(id);
    }

    public ASTAppl(Prog3 p, int id) {
        super(p, id);
    }

    @Override
    public String printExpr() {
        StringBuilder str = new StringBuilder(30);
        str.append("(");
        if (children != null) {
            for (int i = 0; i < children.length; i++) {
                SimpleNode n = (SimpleNode) children[i];
                if (n != null) {
                    str.append(n.printExpr());
                    if (i == 0) {
                        str.append(" ");
                    }
                }
            }
        }
        return str + ")";
    }

    @Override
    public Set<String> freeVars() {
        Set<String> hash = new HashSet<>();
        if (children != null) {
            for (Node child : children) {
                SimpleNode n = (SimpleNode) child;
                if (n != null) {
                    hash.addAll(n.freeVars());
                }
            }
        }
        return hash;
    }

    @Override
    public SimpleNode substitute(String varToSubstitute, SimpleNode expression) {
        for (int i = 0; i < children.length; i++) {
            SimpleNode node = (SimpleNode) children[i];
            if (node.toString().equals(varToSubstitute)) {
                children[i] = expression;
            } else if ("Appl".equals(node.toString()) || "Lambda".equals(node.toString())) {
                Node tmp = node.substitute(varToSubstitute, expression);
                children[i] = tmp;
            }
        }
        return this;
    }

    @Override
    public SimpleNode application(String var, SimpleNode expr) {
        // TODO
        return this;
    }

    @Override
    public SimpleNode normalOrderEvaluation() {
        // TODO
        return this;
    }
}
/* JavaCC - OriginalChecksum=184736a6319e09e036ab6c1e4261efd8 (do not edit this line) */
