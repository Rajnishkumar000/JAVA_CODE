package CSW;

import java.util.Arrays;

public class decTOBina
{
    public static void main(String[] args) {
        int n=10;
        String s="";
        while(n>0){
         s=(n%2)+s;
            n=n/2;
        }
        System.out.println(s);
        int a=Integer.parseInt(s);

        System.out.println(a+2);
        int arr[]={1,2,5,3,2};
        
    }
}
