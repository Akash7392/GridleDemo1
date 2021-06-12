package InterfcaseExplore;

public  class AccessA implements BasicA{
  public String p;
  public AccessA(String p)
  {
      this.p=p;
      System.out.println(p);
  }

    public AccessA() {

    }

    public  void sitA()
    {
        System.out.println("sit A from AccessA");
    }

    public static void main(String[] args) {

        AccessA a= new AccessA("pppp");
                 new AccessA("dddd");
        a.sitA();
        a.engine();
       String test= a.start("kick");
        System.out.println(test);

    }

    @Override
    public void engine() {
        System.out.println("implement in access A");
    }

    @Override
    public String start(String s) {
        return s;
    }

    @Override
    public void gear() {

    }

    @Override
    public String Clutch(String c) {
        return null;
    }
}
