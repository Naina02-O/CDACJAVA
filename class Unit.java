class Unit{
   static int totalU=320;
    static int u1 = 100-0;
    static int u2 = 200-100;
    static int u3 = 300-200;
    static int u4 = 20;
     static int cost1, cost2, cost3, cost4, totalBill;
public static void main(String[] args){
    
     
     findunit();
     unitdisplay();
}


public static void findunit(){
        cost1 = u1 * 1;
        cost2 = u2 * 2;
        cost3 = u3 * 3;
        cost4 = u4 * 4;
        totalBill = cost1 + cost2 + cost3 + cost4;

}
public static void unitdisplay(){
   System.out.println("Rates"); 
System.out.println("1-100 hundred = 1Rs/unit");
System.out.println("100-200 hundred = 2Rs/unit");
System.out.println("200-300 hundred = 3Rs/unit");
System.out.println("300 and above = 4Rs/unit");
  System.out.println("Units Used");
  System.out.println("1-100:" + u1 + " units = " + cost1);
        System.out.println("100-200:" + u2 + " units = " + cost2 );
        System.out.println("200-300:" + u3 + " units = " + cost3);
        System.out.println("300 and above:" + u4 + " units = " + cost4);
        System.out.println("\nTotal Bill = " + totalBill);

}
}