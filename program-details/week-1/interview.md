## Question 1
How can we pass multiple or variable number of arguments to a method on each invocation call?

We can pass variable number of arguments to a method using varargs feature. Below is an example of passing multiple arguments of the same type to a method.

    public void childrenNames(String... names) {
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);
    }

Note:

* The type name is followed by three dots, a space, and then the variable name.
* The varargs variable is treated like an array.
* The varargs variable must appear at the last in the method signature.
* As a consequence of the above, there can only be a single varargs in a method signature.

The above method can be invoked as follows:
    
    childrenNames();
    childrenNames("jane");        
    childrenNames("jane", "tom", "peter");

## Question 2
Consider the following overloaded methods and determine which method will be invoked for the call myOverloadedMethod(5)?

    class Demonstration {
        public static void main( String args[] ) {
        myOverloadedMethod(5);
        }
    
        static void myOverloadedMethod(long arg) {
            System.out.println("Method with long invoked");
        }
    
        static void myOverloadedMethod(int arg) {
            System.out.println("Method with int invoked");
        }
    }

## Question 3
How does method overloading match work in Java?

Methods of a class can be overloaded in Java by:

* Changing the number of parameters
* Changing the type of the parameters passed into the methods

Note that methods can't be overloaded by changing the return types of the methods, as it may cause ambiguity. While overloading has nothing to do with polymorphism, Java programmers also refer to method overloading as Compile Time Polymorphism because the method that is going to get called will be decided at compile time.

The compiler uses the name of the method and the types of the argument expressions to locate methods that are both accessible and applicable. There may be more than one such method, in which case the most specific one is chosen. Typically, varargs methods are the last chosen, if they compete with other candidate methods because they are considered less specific than the ones receiving the same parameter type.

## Question 4
Can the main method be overloaded?

Yes, the static main method can be overloaded. But only public static void main(String[] args) will be used when your class is launched by the JVM even if you specify one or two command-line arguments. However, programmatically one can invoke the overloaded versions of the main method.

    class Demonstration {
        public static void main( String args[] ) {
        System.out.println( "Traditional main method" );
        }

        public static void main( String singleArg) {
            System.out.println( "Method with single arg" );
        }
      
        public static void main( ) {
            System.out.println( "Method with no args" );
        }  
    }