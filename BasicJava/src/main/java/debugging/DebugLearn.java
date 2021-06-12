package debugging;

public class DebugLearn {
        int s;
      int a=6;
       static public  void sd()
        {
            int a=10; int b=1;
            System.out.println("sd");
            int c=a+b;
        }
    public static void main(String[] args) {
       int count=0;
     //  int[] d=new int[5];
        String[] d=new String[] {"hi","hello","mast","watch","ash"};
        DebugLearn obj= new DebugLearn();
        System.out.println("aaaa");
        System.out.println("aaaa");
        System.out.println("aaaa");
     
       System.out.println(obj.a);
        DebugLearn.sd();
        for(int i=1; i<=10; i++)
        {
            count++;
        }

    }
}
