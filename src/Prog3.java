/* Prog3.java */
/* Generated By:JJTree&JavaCC: Do not edit this line. Prog3.java */
class Prog3/*@bgen(jjtree)*/implements Prog3TreeConstants, Prog3Constants {/*@bgen(jjtree)*/
  protected JJTProg3State jjtree = new JJTProg3State();public static void main(String[] args) {
    System.out.println(">>> Lambda Expression Evaluator <<<");
        System.out.println("Enter an applied Lambda expression:");
    Prog3 x = new Prog3(System.in);
    try {
      ASTStart z = x.Start();
          System.out.println("The abstract syntax tree:");
      z.dump("");
          System.out.println("");
          System.out.println("The Lambda expression in the concrete syntax:");
          System.out.println(z.printExpr());
          System.out.println("");
          System.out.println("The abstract syntax tree with free variables:");
          z.dumpFV("");
    } catch (Exception e) {
      System.out.println("Error:");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }

  final public ASTStart Start() throws ParseException {/*@bgen(jjtree) Start */
  ASTStart jjtn000 = new ASTStart(JJTSTART);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
    try {
      Expression();
jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
{if ("" != null) return jjtn000;}
    } catch (Throwable jjte000) {
if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
    } finally {
if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
    }
    throw new Error("Missing return statement in function");
}

  final public void Expression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case CONSTANTS:{
      constant();
      break;
      }
    case VAR:{
      var();
      break;
      }
    case 11:{
      jj_consume_token(11);
      Branch();
      jj_consume_token(12);
      break;
      }
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Branch() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VAR:
    case CONSTANTS:
    case 11:{
      Appl();
      break;
      }
    case 13:{
      Lambda();
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void Appl() throws ParseException {
    Expression();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case VAR:
      case CONSTANTS:
      case 11:{
        ;
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        break label_1;
      }
ASTAppl jjtn001 = new ASTAppl(JJTAPPL);
                   boolean jjtc001 = true;
                   jjtree.openNodeScope(jjtn001);
      try {
        Expression();
      } catch (Throwable jjte001) {
if (jjtc001) {
                     jjtree.clearNodeScope(jjtn001);
                     jjtc001 = false;
                   } else {
                     jjtree.popNode();
                   }
                   if (jjte001 instanceof RuntimeException) {
                     {if (true) throw (RuntimeException)jjte001;}
                   }
                   if (jjte001 instanceof ParseException) {
                     {if (true) throw (ParseException)jjte001;}
                   }
                   {if (true) throw (Error)jjte001;}
      } finally {
if (jjtc001) {
                     jjtree.closeNodeScope(jjtn001,  2);
                   }
      }
    }
}

  final public void Lambda() throws ParseException {
    jj_consume_token(13);
    body();
}

  final public void body() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case VAR:{
      var();
ASTLambda jjtn001 = new ASTLambda(JJTLAMBDA);
           boolean jjtc001 = true;
           jjtree.openNodeScope(jjtn001);
      try {
        body();
      } catch (Throwable jjte001) {
if (jjtc001) {
             jjtree.clearNodeScope(jjtn001);
             jjtc001 = false;
           } else {
             jjtree.popNode();
           }
           if (jjte001 instanceof RuntimeException) {
             {if (true) throw (RuntimeException)jjte001;}
           }
           if (jjte001 instanceof ParseException) {
             {if (true) throw (ParseException)jjte001;}
           }
           {if (true) throw (Error)jjte001;}
      } finally {
if (jjtc001) {
             jjtree.closeNodeScope(jjtn001,  2);
           }
      }
      break;
      }
    case 14:{
      jj_consume_token(14);
      Appl();
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
}

  final public void var() throws ParseException {/*@bgen(jjtree) var */
                    ASTvar jjtn000 = new ASTvar(JJTVAR);
                    boolean jjtc000 = true;
                    jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(VAR);
jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
jjtn000.set(t.image);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  final public void constant() throws ParseException {/*@bgen(jjtree) constant */
                              ASTconstant jjtn000 = new ASTconstant(JJTCONSTANT);
                              boolean jjtc000 = true;
                              jjtree.openNodeScope(jjtn000);Token t;
    try {
      t = jj_consume_token(CONSTANTS);
jjtree.closeNodeScope(jjtn000, true);
          jjtc000 = false;
jjtn000.set(t.image);
    } finally {
if (jjtc000) {
            jjtree.closeNodeScope(jjtn000, true);
          }
    }
}

  /** Generated Token Manager. */
  public Prog3TokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[4];
  static private int[] jj_la1_0;
  static {
	   jj_la1_init_0();
	}
	private static void jj_la1_init_0() {
	   jj_la1_0 = new int[] {0xc80,0x2c80,0xc80,0x4080,};
	}

  /** Constructor with InputStream. */
  public Prog3(java.io.InputStream stream) {
	  this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Prog3(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source = new Prog3TokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
	  ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
	 try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Prog3(java.io.Reader stream) {
	 jj_input_stream = new SimpleCharStream(stream, 1, 1);
	 token_source = new Prog3TokenManager(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
	   jj_input_stream = new SimpleCharStream(stream, 1, 1);
	} else {
	   jj_input_stream.ReInit(stream, 1, 1);
	}
	if (token_source == null) {
 token_source = new Prog3TokenManager(jj_input_stream);
	}

	 token_source.ReInit(jj_input_stream);
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Prog3(Prog3TokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(Prog3TokenManager tm) {
	 token_source = tm;
	 token = new Token();
	 jj_ntk = -1;
	 jjtree.reset();
	 jj_gen = 0;
	 for (int i = 0; i < 4; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
	 Token oldToken;
	 if ((oldToken = token).next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 if (token.kind == kind) {
	   jj_gen++;
	   return token;
	 }
	 token = oldToken;
	 jj_kind = kind;
	 throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
	 if (token.next != null) token = token.next;
	 else token = token.next = token_source.getNextToken();
	 jj_ntk = -1;
	 jj_gen++;
	 return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
	 Token t = token;
	 for (int i = 0; i < index; i++) {
	   if (t.next != null) t = t.next;
	   else t = t.next = token_source.getNextToken();
	 }
	 return t;
  }

  private int jj_ntk_f() {
	 if ((jj_nt=token.next) == null)
	   return (jj_ntk = (token.next=token_source.getNextToken()).kind);
	 else
	   return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
	 jj_expentries.clear();
	 boolean[] la1tokens = new boolean[15];
	 if (jj_kind >= 0) {
	   la1tokens[jj_kind] = true;
	   jj_kind = -1;
	 }
	 for (int i = 0; i < 4; i++) {
	   if (jj_la1[i] == jj_gen) {
		 for (int j = 0; j < 32; j++) {
		   if ((jj_la1_0[i] & (1<<j)) != 0) {
			 la1tokens[j] = true;
		   }
		 }
	   }
	 }
	 for (int i = 0; i < 15; i++) {
	   if (la1tokens[i]) {
		 jj_expentry = new int[1];
		 jj_expentry[0] = i;
		 jj_expentries.add(jj_expentry);
	   }
	 }
	 int[][] exptokseq = new int[jj_expentries.size()][];
	 for (int i = 0; i < jj_expentries.size(); i++) {
	   exptokseq[i] = jj_expentries.get(i);
	 }
	 return new ParseException(token, exptokseq, tokenImage);
  }

  private boolean trace_enabled;

/** Trace enabled. */
  final public boolean trace_enabled() {
	 return trace_enabled;
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}