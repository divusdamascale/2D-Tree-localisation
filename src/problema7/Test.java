package problema7;
public class Test {

    public static void main(String[] args) {
        Punct S[] = new Punct[4];
        S[0] = new Punct(306, 24, "A");
        S[1] = new Punct(383, 24, "B");
        S[2] = new Punct(306, 83, "C");
        S[3] = new Punct(383, 83, "D");
        new Algoritm(S);
    }
    
}
