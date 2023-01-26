package problema7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.JOptionPane;

public class Arbore2D {
    private Punct [] S;
    private Nod [] P;
    private ArrayList <Nod> L = new ArrayList<Nod>();
    private Punct [] dreptunghi;
    private int l;
    private int r;
    
    public void functQ(Nod nod,Punct[] dreptunghi)
    {

        if(nod == null)
        {

        }else
        {
            // System.out.println(nod.getNume());
            if(nod.isT() == false)
            {
                l = dreptunghi[0].getY();
                r = dreptunghi[2].getY();
            }else
            {
                l = dreptunghi[0].getX();
                r = dreptunghi[1].getX();
            }
    
            // System.out.println("1 "+l+ " " + nod.getM() + " " + r);
            // System.out.println("2 "+dreptunghi[0].getY()+ " " + nod.getY() + " " + dreptunghi[2].getY());
            // System.out.println("3 "+dreptunghi[0].getX()+ " " + nod.getX() + " " + dreptunghi[1].getX());
            if(nod.getM() > l && nod.getM() < r )
            {
                
                if(nod.getY() > dreptunghi[0].getY() && nod.getY() < dreptunghi[2].getY())
                {
                    if(nod.getX() > dreptunghi[0].getX() && nod.getX() < dreptunghi[1].getX())
                    {
                        addL(nod);
                    }
                }

                
            }
    
            if(nod.getM() >= l)
            {
                
                // System.out.println("A trecut in stanga " + nod.getS());
                functQ(nod.getS(), dreptunghi);
                
                
            }
            if(nod.getM() <= r)
            {
                
                // System.out.println("A trecut in dreapta " + nod.getD());
                functQ(nod.getD(), dreptunghi);
                
            }

        }
        
       


    }
    

    

    public void addL(Nod e)
    {
        L.add(e);
    }

    public Arbore2D(Punct [] dreptunghi)
    {
        this.dreptunghi = dreptunghi;
        S = new Punct[11];
        P = new Nod[11];
        L = new ArrayList<Nod>();

        S[0] = new Punct(1,2, "A");
        S[1] = new Punct(3,1, "B");
        S[2] = new Punct(5,6, "C");
        S[3] = new Punct(6,4, "D");
        S[4] = new Punct(7,7, "E");
        S[5] = new Punct(10,5, "F");
        S[6] = new Punct(11,15, "G");
        S[7] = new Punct(12,10 , "H");
        S[8] = new Punct(14,13, "I");
        S[9] = new Punct(16,3, "J");
        S[10] = new Punct(19,20, "K");

        P[0] = new Nod(S[0],false,S[0].getY());
        P[1] = new Nod(S[1],true,S[1].getX(),P[0]);
        P[3] = new Nod(S[3],false,S[3].getY());
        P[4] = new Nod(S[4],true,S[4].getX(),P[3]);
        P[2] = new Nod(S[2],false,S[2].getY(),P[1],P[4]);
        P[6] = new Nod(S[6],false,S[6].getY());
        P[7] = new Nod(S[7],true,S[7].getX(),P[6]);
        P[9] = new Nod(S[9],false,S[9].getY());
        P[10] = new Nod(S[10],true,S[10].getX(),P[9]);
        P[8] = new Nod(S[8],false,S[8].getY(),P[7],P[10]);
        P[5] = new Nod(S[5],true,S[5].getX(),P[2],P[8]);
        
        for (Punct punct : dreptunghi) {
            punct.setX((punct.getX()-50)/15);
            punct.setY((340-punct.getY())/15);            
        }
        // System.out.println(P[1].toString());
        // (x-50)/15
        // (340-y)/15
        functQ(P[5], dreptunghi);
        // System.out.println(L.toString());
        JOptionPane.showMessageDialog(null, "In dreptunghiul MNOP desenat in exemplu:\n a)Se afla "+L.size()+" puncte.\nb) "+L.toString());
        // JOptionPane.showMessageDialog(null, "In dreptunghiul MNOP\n"+Arrays.toString(dreptunghi) +"\n desenat in exemplu:\n a)Se afla "+" puncte.\nb) ");

    }
    
}
