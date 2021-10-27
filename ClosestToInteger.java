/*
 * Write a method which given two integers, returns the integer that is closest to 1000.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class ClosestToInteger
{
    public static int closestNum(int a, int b) {
        int compareInt = 1000;
        if (a == b)
            System.out.println("Numbers are equal");
//		if(Math.abs(compareInt -a ) == Math.abs(compareInt-b))
//			System.out.println("Both nos are closest to the integer");
// Calculate the absolute value of subtract with compare int, the minor one should be closest to the compare int.

        return Math.abs(compareInt - a) > Math.abs(compareInt - b) ? b : a;
        //return compareInt - Math.abs(a) > compareInt - Math.abs(b) ? b : a;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println(closestNum(1001, 900));
        System.out.println(closestNum(1100, 1200));
        System.out.println(closestNum(800, 900));
        System.out.println(closestNum(-1, 900));
        System.out.println(closestNum(-1, -3));
        System.out.println(closestNum(-1, 1100));
        System.out.println(closestNum(-32768,32767));
        System.out.println(closestNum(-2147483648,2147483647));
        System.out.println(closestNum(0,65535));
        System.out.println(closestNum(0, 0));
        System.out.println(closestNum(-1,-1));
        System.out.println(closestNum(32767,32767));
        System.out.println(closestNum(998, 1002));


    }
}