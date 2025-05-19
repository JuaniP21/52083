import antlr4 from 'antlr4';

class LenguajeBaseVisitor extends antlr4.tree.ParseTreeVisitor {
    visitChildren(ctx) {
        if (!ctx) return null;
        return ctx.children?.map(child => child.accept(this)) ?? null;
    }
}

export default LenguajeBaseVisitor;
