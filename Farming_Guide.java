/**
 *
 * @author Sauranil Dey and Vidhya Kamakshi
 */
import java.io.*;
public class Farming_Guide {

    double amt,mincost,agriamt,farmamt,acre,familyres,farmres;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        Farming_Guide fg=new Farming_Guide();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------WELCOME TO THE FARMING GUIDE--------------------");
        System.out.println("Enter landtype");
        System.out.println("1.Wetland");
        System.out.println("2.Dry land");
        int ch = Integer.parseInt(in.readLine());
        switch(ch)
        {
            case 1 : fg.wetland();
                     break;
            case 2 :fg.dryland();
                     break;
            default : System.out.println("Invalid choice");
                break;
        }
    }

    private  void wetland()throws IOException {
        double arr=0;
        System.out.println("Enter no of acres"); 
        acre=Double.parseDouble(br.readLine());
        mincost=30000*acre;
        System.out.println("Enter amount you have");
        amt=Double.parseDouble(br.readLine());
        if(amt<mincost){
            arr=mincost-amt;
            System.out.println("Please make arrangement for Rs. "+arr);
        }
        else{
            familyres=0.1*amt;
            agriamt = amt-familyres;
            farmres=0.4*agriamt;
            farmamt=agriamt-farmres;
            if(farmamt<50000){
                System.out.println("You may cultivate Turmeric");
            }
            else{
                System.out.println("You may cultivate Paddy");
            }
             }
        System.out.println("Family reserve Rs. "+familyres);
        System.out.println("Agriculture amount Rs."+agriamt);
        System.out.println("Farming reserve Rs. "+farmres);
        System.out.println("Farming amount Rs. "+farmamt);
    }

    private  void dryland()throws IOException {
        double arr=0;
        System.out.println("Enter no of acres"); 
        acre=Double.parseDouble(br.readLine());
        mincost=4000*acre;
        System.out.println("Enter amount you have");
        amt=Double.parseDouble(br.readLine());
        if(amt<mincost){
            arr=mincost-amt;
            System.out.println("Please make arrangement for Rs. "+arr);
        }
        else{
            familyres=0.1*amt;
            agriamt = amt-familyres;
            farmres=0.4*agriamt;
            farmamt=agriamt-farmres;
            if(farmamt<20000){
                System.out.println("You may cultivate Cotton");
            }
            else{
                System.out.println("You may cultivate Wheat");
            }
             }
        System.out.println("Family reserve Rs. "+familyres);
        System.out.println("Agriculture amount Rs."+agriamt);
        System.out.println("Farming reserve Rs. "+farmres);
        System.out.println("Farming amount Rs. "+farmamt);
    }
    
        
        
    }
