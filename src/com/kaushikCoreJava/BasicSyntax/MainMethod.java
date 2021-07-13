
package com.kaushikCoreJava.BasicSyntax;

public class MainMethod {




    public static void main(String[] args) {

        //public: It is an access specifier.

        //static: should call the main() method without creating an object.

        /* void : ... In Java, every method has the return type.
        Void keyword acknowledges the compiler that main() method does not return any value.*/

        /* main() : It is a default signature which is predefined in the JVM
          We can also overload the main() method.*/

        /*String[] args : The main() method also accepts some data from the user.
        It accepts a group of strings, which is called a string array.
        It is used to hold the command line arguments in the form of string values.
         */
        System.out.println(args[0]);// string argument
        System.out.println(args[1]);//string argument
        System.out.println(args[2]);//string argument
        System.out.println("Hellow World"); //regular println
        main(10);//method overloading
   }

    //overloaded main method
    public static void main(int a){

        System.out.println(a);
    }



}



