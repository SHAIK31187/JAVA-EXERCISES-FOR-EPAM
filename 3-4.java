public class Main{

     public static void main(String []args){
        int a[]={55,128,68,78,183};
        String s =null;
        for(int i: a){
            s = Character.toString((char)i);
            System.out.println(s);
        }
    }
}