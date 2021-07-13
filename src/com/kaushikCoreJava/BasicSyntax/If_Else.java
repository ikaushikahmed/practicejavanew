package com.kaushikCoreJava.BasicSyntax;

public class If_Else {




    public static void main(String[] args) {

        int a = 26;

        if(a <= 10){
            System.out.println("no action needed");
        }
        else if (a>=11 && a<=24 ){
            System.out.println("call your doctor");
    }
        else if (a>=25){

            System.out.println("call your 911");

        }

        else {
            System.out.println("come back after 6 month");
        }


}

}
