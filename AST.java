class faux{ // collection of non-OO auxiliary functions (currently just error)
    public static void error(String msg){
        System.err.println("Interpreter error: "+msg);
        System.exit(-1);
    }
}

enum Type{
    DOUBLE_TYPE, BOOLTYPE
}


public abstract class AST{
    //abstract public Type typecheck(Environment env);
};

abstract class Expr extends AST{
    abstract public Double eval(Environment env);
    abstract public Type typecheck(Environment env);



}

class Addition extends Expr{
    Expr e1,e2;
    Addition(Expr e1,Expr e2){
        this.e1=e1;
        this.e2=e2;
    }
    public Double eval(Environment env){
        return e1.eval(env)+e2.eval(env);

    }

    @Override
    public Type typecheck(Environment env) {

        Type type1 = e1.typecheck(env);
        Type type2 = e2.typecheck(env);
        if (type1 == Type.DOUBLE_TYPE && type2 == Type.DOUBLE_TYPE) {
            return Type.DOUBLE_TYPE;
        }

        faux.error("Addition of non-integers ");
        return null;
    }
}

class Multiplication extends Expr{
    Expr e1,e2;
    Multiplication(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
	return e1.eval(env)*e2.eval(env);
    }

    @Override
    public Type typecheck(Environment env) {
        Type type1 = e1.typecheck(env);
        Type type2 = e2.typecheck(env);
        if (type1 == Type.DOUBLE_TYPE && type2 == Type.DOUBLE_TYPE) {
            return Type.DOUBLE_TYPE;
        }

         faux.error("Multiplication of non-integers ");
        return null;
    }
}




class Division extends Expr{
    Expr e1,e2;
    Division(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
        return e1.eval(env)/e2.eval(env);
    }

    @Override
    public Type typecheck(Environment env) {
        Type type1 = e1.typecheck(env);
        Type type2 = e2.typecheck(env);
        if (type1 == Type.DOUBLE_TYPE && type2 == Type.DOUBLE_TYPE) {
            return Type.DOUBLE_TYPE;
        }

        faux.error("Division of non-integers ");
        return null;
    }
}


class Subtraction extends Expr{
    Expr e1,e2;
    Subtraction(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
        return e1.eval(env)-e2.eval(env);
    }

    @Override
    public Type typecheck(Environment env) {
        Type type1 = e1.typecheck(env);
        Type type2 = e2.typecheck(env);
        if (type1 == Type.DOUBLE_TYPE && type2 == Type.DOUBLE_TYPE) {
            return Type.DOUBLE_TYPE;
        }

        faux.error("Subtraction of non-integers ");
        return null;
    }
}

class Constant extends Expr{
    Double d;
    Constant(Double d){this.d=d;}
    public Double eval(Environment env){
	return d;
    }

    @Override
    public Type typecheck(Environment env) {
        if (d instanceof Double) {
            return Type.DOUBLE_TYPE;
        }

        return null;
    }
}

class Variable extends Expr{
    String varName;
    Variable(String varName){this.varName = varName;}
    public Double eval(Environment env){
	    return env.getVariable(varName);
    }
    @Override
    public Type typecheck(Environment env) {
        if(env.getVariable(varName) instanceof Double) {
            return Type.DOUBLE_TYPE;
        }

        return null;
    }
}

abstract class Command extends AST{
    abstract public void eval(Environment env);
    abstract public void typecheck(Environment env);
}

// Do nothing command 
class NOP extends Command{
    public void eval(Environment env){}

    @Override
    public void typecheck(Environment env) {

    }
}

class Sequence extends Command{
    Command c1,c2;
    Sequence(Command c1, Command c2){
        this.c1=c1; this.c2=c2;

    }
    public void eval(Environment env){

        c1.eval(env);
        c2.eval(env);
    }

    @Override
    public void typecheck(Environment env) {

        c1.typecheck(env);
        c2.typecheck(env);

    }
}


class Assignment extends Command{
    String v;
    Expr e;
    Assignment(String v, Expr e){
	this.v=v; this.e=e;
    }
    public void eval(Environment env){
	Double d=e.eval(env);
	env.setVariable(v,d);
    }

    @Override
    public void typecheck(Environment env) {
        e.typecheck(env);
        env.setVariable(v, e.eval(env));
    }
}

class Output extends Command{
    Expr e;
    Output(Expr e){
	this.e=e;
    }
    public void eval(Environment env){
	Double d=e.eval(env);
	System.out.println(d);
    }

    @Override
    public void typecheck(Environment env) {
        e.typecheck(env);
    }
}

class While extends Command{
    Condition c;
    Command body;
    While(Condition c, Command body){
	this.c=c; this.body=body;
    }
    public void eval(Environment env){
	while (c.eval(env))
	    body.eval(env);
    }

    @Override
    public void typecheck(Environment env) {
         c.typecheck(env);
         body.typecheck(env);
    }
}



class Forloop extends Command{
    String str;
    Expr e1, e2;
    Command body;
    Forloop(String str, Expr e1, Expr e2, Command body){
        this.str = str;
        this.e1 = e1;
        this.e2 = e2;
        this.body=body;
    }
    public void eval(Environment env){

        double e1Double = e1.eval(env);
        int e1Int = (int) e1Double;

        double e2Double = e2.eval(env);
        int e2Int = (int) e2Double;

        for (int i = e1Int; i <= e2Int ; i++) {
            env.setVariable(str, (double) i);
            body.eval(env);
        }

    }

    @Override
    public void typecheck(Environment env) {
        env.setVariable(str, e1.eval(env));
       // e1.typecheck(env);
        body.typecheck(env);
    }
}

class Array extends Command{
    String arrName;
    Expr index, value;

    Array(String arrName, Expr index, Expr value){
        this.arrName = arrName;
        this.index = index;
        this.value = value;
    }

    public void eval(Environment env){
        String arrNameWithIndex = arrName +"[" + index.eval(env).intValue() + "]";
        env.setVariable(arrNameWithIndex, value.eval(env));
    }

    @Override
    public void typecheck(Environment env) {
        value.typecheck(env);
        String arrNameWithIndex = arrName +"[" + index.eval(env).intValue() + "]";
        env.setVariable(arrNameWithIndex,value.eval(env) );


    }

}



class ArrayRead extends Expr{
    String arrName;
    Expr index;

    ArrayRead(String arrName, Expr index){
        this.arrName = arrName;
        this.index = index;
    }

    public Double eval(Environment env){

        String arrNameWithIndex = arrName +"[" + index.eval(env).intValue() + "]";
        return env.getVariable(arrNameWithIndex);
    }

    @Override
    public Type typecheck(Environment env) {
        if (env.getVariable(arrName) instanceof Double) {
            faux.error(arrName + " was defined as double, now used as array");
        }

        String arrNameWithIndex = arrName +"[" + index.eval(env).intValue() + "]";
        Double value = env.getVariable(arrNameWithIndex);
        if (value instanceof Double) {
            return Type.DOUBLE_TYPE;
        } else {
            faux.error("Array " + arrNameWithIndex + " not defined");
        }

        return null;
       // return index.typecheck(env);

    }
}








class IfStatement extends Command{
    Condition c;
    Command body;
    IfStatement(Condition c, Command body){
        this.c=c; this.body=body;
    }
    public void eval(Environment env){
        if (c.eval(env)) {
            body.eval(env);
        }
    }

    @Override
    public void typecheck(Environment env) {
         c.typecheck(env);
         body.typecheck(env);
    }
}


abstract class Condition extends AST{
    abstract public Boolean eval(Environment env);
    abstract public Type typecheck(Environment env);
}

class Unequal extends Condition{
    Expr e1,e2;
    Unequal(Expr e1,Expr e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
	return ! e1.eval(env).equals(e2.eval(env));
    }
    @Override
    public Type typecheck(Environment env) {
        return null;
    }
 
}

class Equal extends Condition{
    Expr e1,e2;
    Equal(Expr e1,Expr e2){
        this.e1=e1; this.e2=e2;
    }

    public Boolean eval(Environment env){
        return e1.eval(env).equals(e2.eval(env));
    }

    @Override
    public Type typecheck(Environment env) {
        return null;
    }

}


class GreaterThan extends Condition{
    Expr e1,e2;
    GreaterThan(Expr e1,Expr e2){
        this.e1=e1; this.e2=e2;
    }

    public Boolean eval(Environment env){

        boolean result = false;
        if (e1.eval(env) > e2.eval(env)) {
            result = true;
        }
        return result;
    }


    @Override
    public Type typecheck(Environment env) {
        return null;
    }

}



class LessThan extends Condition{
    Expr e1,e2;
    LessThan(Expr e1,Expr e2){
        this.e1=e1; this.e2=e2;
    }

    public Boolean eval(Environment env){
        boolean result = false;
        if (e1.eval(env) < e2.eval(env)) {
            result = true;
        }
        return result;
    }

    @Override
    public Type typecheck(Environment env) {
        return null;
    }
}



class OrBinary extends Condition{
    Condition c1,c2;
    OrBinary(Condition c1,Condition c2){
        this.c1=c1; this.c2=c2;
    }

    public Boolean eval(Environment env){
        boolean result = false;


        if (c1.eval(env) || c2.eval(env)) {
            result = true;
        }
        return result;
    }

    @Override
    public Type typecheck(Environment env) {
        return null;
    }
}


class AndBinary extends Condition{
    Condition c1,c2;
    AndBinary(Condition c1,Condition c2){
        this.c1=c1; this.c2=c2;
    }

    public Boolean eval(Environment env){
        boolean result = false;
        if (c1.eval(env) && c2.eval(env)) {
            result = true;
        }
        return result;
    }

    @Override
    public Type typecheck(Environment env) {
        return null;
    }
}



























