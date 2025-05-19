import LenguajeVisitor from '../generated/LenguajeVisitor.js';

export default class Interpreter extends LenguajeVisitor {
  visitPrograma(ctx) {
    return this.visit(ctx.instrucciones());
  }

  visitInstrucciones(ctx) {
    for (const instr of ctx.instruccion()) {
      const result = this.visit(instr);
      if (result === 'RETURN') break;
    }
  }

  visitInstruccion(ctx) {
    return this.visitChildren(ctx);
  }

  visitSalida(ctx) {
    const texto = ctx.CADENA().getText();
    console.log(`🖨️ printf: ${texto.slice(1, -1)}`);
  }

  visitDecision(ctx) {
    const condicion = ctx.condicion().getText();
    if (condicion === '"1"') {
      for (const instr of ctx.instruccion()) {
        const result = this.visit(instr);
        if (result === 'RETURN') break;
      }
    } else {
      for (const instr of ctx.instruccion(1)) {
        const result = this.visit(instr);
        if (result === 'RETURN') break;
      }
    }
  }

  visitSentencia(ctx) {
    return 'RETURN';
  }
}
