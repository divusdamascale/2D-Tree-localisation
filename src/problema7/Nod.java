package problema7;

import java.lang.invoke.LambdaConversionException;

public class Nod {
private int x,y;
private String nume;
private boolean t; //false ->orizontal true->vertical 
private int m;
private Nod S;
private Nod D;
private Nod lam;

public boolean isT() {
    return t;
}

public int getM() {
    return m;
}

public Nod getS() {
    return S;
}

public Nod getD() {
    return D;
}

public String getNume() {
    return nume;
}

public int getX() {
    return x;
}

public int getY() {
    return y;
}

public Nod(Punct pct, boolean t, int m, Nod S, Nod D ) {
    x=pct.getX();
    y=pct.getY();
    nume=pct.getNume();
    this.t=t;
    this.m=m;
    this.S=S;
    this.D=D;
}

public Nod(Punct pct, boolean t, int m, Nod S) {
    x=pct.getX();
    y=pct.getY();
    nume=pct.getNume();
    this.t=t;
    this.m=m;
    this.S=S;
    this.D=null;
}



public Nod(Punct pct, boolean t, int m ) {
    x=pct.getX();
    y=pct.getY();
    nume=pct.getNume();
    this.t=t;
    this.m=m;
    this.S=null;
    this.D=null;
}

@Override

public String toString()
{
    StringBuffer sb = new StringBuffer();
    sb.append(nume);
    sb.append(" ( ");
    sb.append(x);
    sb.append(", ");
    sb.append(y);
    sb.append(" ) ");
    
    return sb.toString();
}
    
}
