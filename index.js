import antlr4 from 'antlr4';
import fs from 'fs';
import LenguajeLexer from './generated/LenguajeLexer.js';
import LenguajeParser from './generated/LenguajeParser.js';
import Interpreter from './visitor/Interpreter.js';

const input = fs.readFileSync('input.txt', 'utf8');
console.log("📄 Contenido de input.txt:");
console.log(input);
console.log("\n");

const chars = new antlr4.InputStream(input);
const lexer = new LenguajeLexer(chars);
const tokens = new antlr4.CommonTokenStream(lexer);

console.log("⚙️ Lexer creado");

// Creamos el parser ANTES de imprimir los tokens
const parser = new LenguajeParser(tokens);

// Tabla de tokens
tokens.fill();
console.log(`Cantidad de tokens: ${tokens.tokens.length}\n`);
console.log("📜 Tabla de Tokens:");

tokens.tokens.forEach(token => {
  const typeName = parser.symbolicNames[token.type] || "UNKNOWN";
  console.log(`Tipo: ${typeName.padEnd(15)} Texto: "${token.text}"`);
});

console.log("\n🌳 Árbol de análisis sintáctico:");

const tree = parser.programa();
console.log(tree.toStringTree(parser.ruleNames));

// Interpretar
console.log("\n🚀 Resultado del intérprete:");
const interpreter = new Interpreter();
interpreter.visit(tree);
