grammar miLenguaje;

@parser::header {
  import java.util.Map;
  import java.util.HashMap;
}

@parser::members {
  Map<String, Object> symbolTable = new HashMap<String, Object>();
}

program: expr;
expr: declaraciones;
declaraciones: declaracion;
declaracion: declaracionFuncion
          | declaracionVariable;
declaracionVariable :tipo ID ';'
{  };
tipo            : 'entero' | 'caracter';
declaracionFuncion : tipo ID '(' parametros?')' '{' declaraciones sentencias '}';
parametros      : parametro ',' parametro;
parametro       : tipo ID;
sentencias      : sentencia
                | sentencias sentencia;
sentencia       :
// declaracionVariable
//                | asignacion
                 ifDeclaracion {$node = $ifDeclaracion.node;};
//                | whileDeclaracion
//                | volverDeclaracion
//                | declaracionExpresion;
asignacion      : ID '=' expresion ';'
{  };
ifDeclaracion   : 'Puede' '(' expresion ')'
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

whileDeclaracion : 'Ciclo' '(' expresion ')' '{' sentencias '}';
volverDeclaracion : 'retornar' expresion ';';
declaracionExpresion : expresion ';';
expresion returns [ASTNode node] :
//                expresion ('>' | '<' | '>=' | '<=') expresion
                t1=factor {$node = $t1.node;}
                ( '+' t2=factor {$node = new Addition($node, $t2.node);}) *
                | t1=factor {$node = $t1.node;}
                ( '-' t2=factor {$node = new Subtraction($node, $t2.node);}) *;


factor returns [ASTNode node] : t1=termino {$node = $t1.node;}
                ( '*' t2=termino {$node = new Multiplication($node, $t2.node);}) *
                | t1=termino {$node = $t1.node}
                ( '/' t2=termino {$node = new Division($node, $t2.node);}) *;

termino returns [ASTNode node] :
                NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));}
                | boolean {$node = new Constant($boolean.text == "facto"? true : false);}
//                | ID {  }
                | '(' expresion {$node = $expresion.node; } ')';

boolean : 'facto' | 'nfacto';


ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
