public class HelloWorld {
    public static String hello( String name ) {
        if ( name == null || name.isEmpty() ) {
            return new String( "Hello, World!" );
        } else {
            return new String( "Hello, " + name + "!" );
        }
    }
}
