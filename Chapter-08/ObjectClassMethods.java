public class ObjectClassMethods 
{
    public static void main(String[] args) {
        Dog aDog = new Dog();
        Cat aCat = new Cat();
        
        // equals()
        if(aDog.equals(aCat))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");        
        }

        // hashCode()
        System.out.println(aCat.hashCode());

        // toString()
        System.out.println(aCat.toString());

        // getClass()
        System.out.println(aCat.getClass());
    }    
}
