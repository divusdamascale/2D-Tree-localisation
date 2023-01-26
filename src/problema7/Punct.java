package problema7;
public class Punct {
private int x,y;
public void setX(int x) {
    this.x = x;
}

public void setY(int y) {
    this.y = y;
}

private String nume;

public String getNume() {
    return nume;
}

public int getX() {
    return x;
}

public int getY() {
    return y;
}

public Punct(int x, int y,String nume) {
    this.x = x;
    this.y = y;
    this.nume = nume;
}

@Override

public String toString()
{
    StringBuffer sb = new StringBuffer();
    sb.append(nume);
    sb.append(" ( ");
    sb.append((x-50)/15);
    sb.append(", ");
    sb.append((340-y)/15);
    sb.append(" )");
    return sb.toString();
}

    
}
