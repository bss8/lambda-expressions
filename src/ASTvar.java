/* Generated By:JJTree: Do not edit this line. ASTvar.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTvar extends SimpleNode {
  public ASTvar(int id) {
    super(id);
  }

  public ASTvar(Prog3 p, int id) {
    super(p, id);
  }

  private String VAL;

  public void set(String val) {
	fvars.add(val.trim());
    VAL = val.trim();
  }
  
  public String toString() {
    return VAL;
  }
}
/* JavaCC - OriginalChecksum=12801cdc90218f2b84369a9112c49f60 (do not edit this line) */