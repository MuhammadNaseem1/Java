class oop
{
    public static void main(String[] args)
    {
        oop1 obj1=new oop1();
        obj1.meth1("Amin");
        
           oop2 obj=new oop2();
           obj.meth1("Waseem");
         //  obj.meth1("Naseem");
 obj=obj1;
 obj.meth1("Saleem");
    }
}
class oop1
{
    public void meth1(String name)
    {
        System.out.println("Hello "+name);
    }
   
}
class oop2 extends oop1{
 public void meth1(String name)
    {
       System.out.println( name);
    }
}