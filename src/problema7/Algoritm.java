package problema7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.JOptionPane;

public class Algoritm {
    private Punct [] S;
    private Punct [] L1; // ordonat pe orizontala
    private Punct [] L2; // ordonat pe verticala
    private Punct [] dreptunghi;
    private int [][] matrice = new int[12][12];

    public Algoritm(Punct [] dreptunghi)
    {
        //determinare dreptunghi
        this.dreptunghi = dreptunghi;
        S = new Punct[11];
        //introducere S
        S[0] = new Punct((1*15)+50,340-(2*15), "A");
        S[1] = new Punct((3*15)+50,340-(1*15), "B");
        S[2] = new Punct((5*15)+50,340-(6*15), "C");
        S[3] = new Punct((6*15)+50,340-(4*15), "D");
        S[4] = new Punct((7*15)+50,340-(7*15), "E");
        S[5] = new Punct((10*15)+50,340-(5*15), "F");
        S[6] = new Punct((11*15)+50,340-(15*15), "G");
        S[7] = new Punct((12*15)+50,340-(10*15) , "H");
        S[8] = new Punct((14*15)+50,340-(13*15), "I");
        S[9] = new Punct((16*15)+50,340-(3*15), "J");
        S[10] = new Punct((19*15)+50,340-(20*15), "K");

        //ordonare L1 si L2
        L1 = S.clone();
        L2 = S.clone();
        Arrays.sort(L1,new Comparator<Punct>() {
            @Override
            public int compare(Punct p1,Punct p2)
            {
                if(p1.getX()<p2.getX())
                {
                    return -1;
                }else
                {
                    return 1;
                }
            }
            
        });
         Arrays.sort(L2, new Comparator<Punct>() {
            @Override
            public int compare(Punct p1,Punct p2)
         {
            if(p1.getY()<p2.getY())
            {
                return -1;
            }else
            {
                return 1;
            }
         }
            

         });

        // System.out.println(Arrays.toString(L1));
        // System.out.println(Arrays.toString(L2));
         
        //completare matrice


//         for (int i = 0; i < 12; i++) {
//             matrice[i][0]=0;
//             for (int j = 1; j < 12; j++) {
               
//                     int k = Arrays.binarySearch(L2, L1[j-1],new Comparator<Punct>() {

//                         @Override
//             public int compare(Punct p1,Punct p2)
//          {
//             if(p1.getY()<p2.getY())
//             {
//                 return -1;
//             }else if(p1.getY()>p2.getY())
//             {
//                 return 1;
//             }else 
//             {
//                 if(p1.getX() == p2.getX())
//                 {
//                     return 0;
//                 }
//             }
//             return 0;
//          }          
//                     });





//                     for (int l = 0; l <=k; l++) {
//                         matrice[l][j] = matrice[l][j-1];
//                     }
//                     for(int l = k+1 ;l < 12;l++)
//                     {
//                         matrice[l][j] = matrice[l][j-1]+1;
//                     }
                
                
//             }
            
//         }
// // ASD
//         for (int i = 11; i>= 0; i--) {
//             for (int j = 0; j<12; j++) {
//                 System.out.print(matrice[i][j]+" ");
                
//             }
//             System.out.println();
            
//         }

//     //    cautare puncte
//     // QA
//      ArrayList qA = new ArrayList<Punct>();

//      for (int i = 0; i < L1.length; i++) {
//         if(L1[i].getX()<=dreptunghi[0].getX())
//         {
//             if(L1[i].getY()<=dreptunghi[0].getY())
//             {
//                 qA.add(L1[i]);
//             }
//         }else
//         {
//             break;
//         }
        
//      }

//      ArrayList qB = new ArrayList<Punct>();

//      for (int i = 0; i < L1.length; i++) {
//         if(L1[i].getX()<=dreptunghi[1].getX())
//         {
//             if(L1[i].getY()<=dreptunghi[1].getY())
//             {
//                 qB.add(L1[i]);
//             }
//         }else
//         {
//             break;
//         }
        
//      }

//      ArrayList qC = new ArrayList<Punct>();

//      for (int i = 0; i < L1.length; i++) {
//         if(L1[i].getX()<=dreptunghi[2].getX())
//         {
//             if(L1[i].getY()<=dreptunghi[2].getY())
//             {
//                 qC.add(L1[i]);
//             }
//         }else
//         {
//             break;
//         }
        
//      }

//      ArrayList qD = new ArrayList<Punct>();

//      for (int i = 0; i < L1.length; i++) {
//         if(L1[i].getX()<=dreptunghi[3].getX())
//         {
//             if(L1[i].getY()<=dreptunghi[3].getY())
//             {
//                 qD.add(L1[i]);
//             }
//         }else
//         {
//             break;
//         }
        
//      }

//     //  HashMap qABCD = new HashMap<Punct>();
//      qB.removeAll(qA);
//      qB.removeAll(qC);
//      qB.addAll(qD);

//      System.out.println(qB.toString());


// ASD
    ArrayList puncte = new ArrayList<Punct>();
    for (int i = 0; i < L1.length ; i++) {
        if(L1[i].getX() >= dreptunghi[0].getX() && L1[i].getX() <= dreptunghi[1].getX())
        {
            if(L1[i].getY() <= dreptunghi[0].getY() && L1[i].getY() >= dreptunghi[2].getY())
            {
                puncte.add(L1[i]);
            }
        }else if(L1[i].getX() > dreptunghi[1].getX())
        {
            break;
        }
        
    }

    System.out.println(Arrays.toString(dreptunghi));
    


    JOptionPane.showMessageDialog(null, "In dreptunghiul MNOP\n"+Arrays.toString(dreptunghi) +"\n desenat in exemplu:\n a)Se afla "+puncte.size()+" puncte.\nb) "+puncte.toString());

    }


        


    
    
}
