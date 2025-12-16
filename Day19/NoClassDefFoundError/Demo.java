class Helper
{
    void m1()
    {
        System.out.println("hello world");
    }
}
class Demo
{
    public static void main(String[] args)
    {
        try
        {
            Helper h1 = new Helper();
            h1.m1();
        }catch(NoClassDefFoundError e)
        {
            System.out.println("class not found");
        }
    }

}

// note: NoClassDefFoundError is an error that occurs when the (JVM) or a ClassLoader instance tries to load a
//       class and the class definition is not found in the classpath. 
//       This error typically arises when a class was present
//       during compile time but is missing during runtime.
//       It is important to note that NoClassDefFoundError is an error, not an exception,
//       NoClassDefFoundError is handeled using try-catch block.