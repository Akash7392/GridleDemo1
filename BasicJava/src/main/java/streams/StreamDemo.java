package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    ArrayList<String> b;


    public  void FIndingAlphabetInString() {
        //to count the string stating with alphabet "A"
        ArrayList<String> a = new ArrayList<>();
        a.add("Akash");
        a.add("Prakash");
        a.add("Nikhil");
        a.add("Abhijit");
        a.add("Apoorva");
        int count = 0;

        for (int i = 0; i < a.size(); i++) {
            String s = a.get(i);
            if (s.startsWith("A")) {
                count++;
                System.out.println("All string =" + s);
            }
        }
    }

    public  void FIndingAlphabetInStringBYUsing_Stream() {
        //to count the string stating with alphabet "A"
        ArrayList<String> a = new ArrayList<String>();
        a.add("Akash");
        a.add("Prakash");
        a.add("Nikhil");
        a.add("Abhijit");
        a.add("Apoorva");
        int count = 0;

       List c= a.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
        System.out.println(c);
        for (Object f:c)
        {
           String h= f.toString();
            System.out.println(h);
        }


    }
       public    void printresultUsingLamada()
       {
          b= new ArrayList<String>();

           b.add("Akasha");
           b.add("Prakash");
           b.add("Nikhil");
           b.add("Abhijit");
           b.add("Apoorva");
           b.stream().filter(s ->s.length()==6).forEach(s -> System.out.println(s));

       }
    public    void Map_Using()
    {
        b= new ArrayList<String>();

        b.add("Akasha");
        b.add("Prakash");
        b.add("Nikhil");
        b.add("Abhijit");
        b.add("Apoorva");
        b.stream().filter(s ->s.startsWith("a")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

    }
   public  void Converting_Arrry_to_Arraylist()
   {
       
      List<String> l= Arrays.asList("Sam","Can","Maan","Inte","Soap");
      l.stream().sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

   }
   public  void anymatchingIn_arrayList()
   {
       ArrayList <String> g= new ArrayList<String>();
         g.add("sam");
       g.add("curry");
       g.add("dev");
    try {
      boolean t= g.stream().anyMatch(s-> s.equalsIgnoreCase("dev"));
        System.out.println(t);
      }
    catch (Exception e)
    {
        System.out.println("does not executed");
    }
   }

    public static void main(String[] args) {
        StreamDemo a=new StreamDemo();
        a.FIndingAlphabetInString();
      a.FIndingAlphabetInStringBYUsing_Stream();
      a.printresultUsingLamada();
     a.Map_Using();
       a.Converting_Arrry_to_Arraylist();
        a.anymatchingIn_arrayList();
        }

    }
















