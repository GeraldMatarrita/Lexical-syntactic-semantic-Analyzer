grammar miLenguaje;

@parser::header {
  import java.util.Map;
  import java.util.HashMap;
  import InterpreterPattern.*;
}

@parser::members {
  Map<String, Object> symbolTable = new HashMap<String, Object>();
}

start: declaracionFuncion EOF;

declaraciones returns [ASTNode node]:
                declaracion {$node = $declaracion.node;};

declaracion returns [ASTNode node]:
                declaracionFuncion {$node = $declaracionFuncion.node; } (declaraciones {$node = $declaraciones.node; })*
                | declaracionVariable {$node = $declaracionVariable.node; } (declaraciones {$node = $declaraciones.node; })*;
declaracionVariable returns [ASTNode node]:
                TIPO ID ';'
                { $node = new VariableDeclaration($ID.text);};

declaracionFuncion returns [ASTNode node] :
                TIPO ID '(' ')' '{'
                {
                    List<ASTNode> body = new ArrayList<ASTNode>();
                    symbolTable.put("actualFunction", $ID.text);
                }
//                declaracion { $node = new FunctionDeclaration($ID.text , $TIPO.text);}
                sentencias {body.add($sentencias.node);}
                '}'
                {
                    for (ASTNode node : body) {
                        node.execute(symbolTable);
                    }
                };

sentencias returns [ASTNode node] :
                sentencia {$node = $sentencia.node;}
                | sentencias sentencia {$node = $sentencia.node;};

sentencia returns [ASTNode node] :
                 declaracionVariable {$node = $declaracionVariable.node;}
                | asignacion {$node = $asignacion.node;}
                | ifDeclaracion {$node = $ifDeclaracion.node;}
                | volverDeclaracion {$node = $volverDeclaracion.node;};

//                | whileDeclaracion
//                | volverDeclaracion
asignacion returns [ASTNode node]
                : ID '=' expresion ';'
                { $node = new Assignation($ID.text, $expresion.node);};

ifDeclaracion returns [ASTNode node]:
                  'Puede' '(' expresion ')'
                  {
                      List<ASTNode> body = new ArrayList<ASTNode>();
                  }
                  '{' sentencia (s1 = sentencia { body.add($s1.node);})* '}'
                  'Entonces'
                  {
                        List<ASTNode> elseBody = new ArrayList<ASTNode>();
                  }
                  '{' sentencia (s2 = sentencia { elseBody.add($s2.node);})* '}'
                  {
                        $node = new If($expresion.node, body, elseBody);
                  };

volverDeclaracion returns [ASTNode node]:
                'retornar' expresion ';' {$node = new Return($expresion.node);};

expresion returns [ASTNode node] :
                t1=factor {$node = $t1.node;}
                ( '+' t2=factor {$node = new Addition($node, $t2.node);}) *
                | t1=factor {$node = $t1.node;}
                ( '-' t2=factor {$node = new Subtraction($node, $t2.node);}) *;

factor returns [ASTNode node] :
                t1=termino {$node = $t1.node;}
                ( '*' t2=termino {$node = new Multiplication($node, $t2.node);}) *
                | t1=termino {$node = $t1.node;}
                ( '/' t2=termino {$node = new Division($node, $t2.node);}) *;

termino returns [ASTNode node] :
                NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));}
                | BOOLEAN {$node = new Constant($BOOLEAN.text == "hecho"? true : false);}
                | ID { $node = new VariableReference($ID.text); }
                | '(' expresion {$node = $expresion.node; } ')';

TIPO: 'entero' | 'caracter';
BOOLEAN: 'hecho' | 'noHecho';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
