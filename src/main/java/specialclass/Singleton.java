package specialclass;

public class Singleton {


 static Singleton singleton ;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(singleton == null )
            singleton =  new Singleton();
            return singleton;

}}
class org{
    public static void main(String[] args) {
        System.out.println( Singleton.getInstance().hashCode());
        System.out.println( Singleton.getInstance().hashCode());
        System.out.println( Singleton.getInstance().hashCode());
        System.out.println( Singleton.getInstance().hashCode());



    }
}