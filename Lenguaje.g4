grammar Lenguaje;

// Reglas del parser
programa
    : instrucciones
    ;

instrucciones
    : instruccion*
    ;

instruccion
    : salida
    | decision
    | sentencia
    ;

salida
    : PRINTF LPAREN CADENA RPAREN SEMI
    ;

decision
    : IF LPAREN condicion RPAREN LBRACE instruccion* RBRACE ELSE LBRACE instruccion* RBRACE
    ;

sentencia
    : RETURN SEMI
    ;

condicion
    : CADENA
    ;

// Reglas del lexer (mayúsculas por convención)

// Palabras clave
IF      : 'if';
ELSE    : 'else';
PRINTF  : 'printf';
RETURN  : 'return';

// Símbolos
LPAREN  : '(';
RPAREN  : ')';
LBRACE  : '{';
RBRACE  : '}';
SEMI    : ';';

// Cadenas entre comillas
CADENA  : '"' (~["\\] | '\\' .)* '"';

// Ignorar espacios en blanco
WS      : [ \t\r\n]+ -> skip;
