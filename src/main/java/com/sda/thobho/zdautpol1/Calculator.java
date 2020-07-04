package com.sda.thobho.zdautpol1;

public class Calculator {


    //zakładamy, że overflow, to jest poprawne zachowanie
    public int add(int a, int b){
        return a + b;
    }


    public int subtract(int a, int b){
        return a - b;
    }

    //todo multiply

    public Integer divide(int licznik, int mianownik){
        if(mianownik == 0){
           return null;
        }

        return licznik / mianownik;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(2147483647, 1); //overflow inta

        System.out.println(result);
    }


}
