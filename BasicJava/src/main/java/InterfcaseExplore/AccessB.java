package InterfcaseExplore;

public class AccessB {

    public  void backsit()
    {
        System.out.println("backsit from accessB");
    }

    public static void main(String[] args) {
        AccessA g=new AccessA();
        System.out.println( g.start("bbb"));
        g.engine();
        g.gear();
    }
}
