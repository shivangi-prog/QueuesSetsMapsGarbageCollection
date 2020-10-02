package com.company.com;
// your code is perfect i just added a comment for print statement and changed the values, for acktoberfest competition

public class While {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            //this is the while statement
            System.out.println("inside while statement " + x);//this statement is written to print value of x
            x++;
            //incrementing x
        }


        do {
            System.out.println("inside do-while statement  " + x);
        } while (x <= -1);
        //Gave a condition
    }

}
