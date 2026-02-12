public class ClassNotFoundQn03 {
    public static void main(String[] args) {
        try {
            Class.forName("ClassNotFoundQn");
        } catch (ClassNotFoundException e) {
            System.out.println("name: "+e.getMessage());
            e.printStackTrace();
        }
        /*name: ClassNotFoundQn
        java.lang.ClassNotFoundException: ClassNotFoundQn
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:527)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:315)
        at ClassNotFoundQn03.main(ClassNotFoundQn03.java:4) */
    }

}
