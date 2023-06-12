/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.mathutil.main;

import com.datgiacdau.mathutil.core.MathUtil;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        
        //thử ng hàm tính giai thừa đúng ko
        //phải đưa các tình hg dùng hàm thực tế
        //vd:-5,0,20,21...
        
        long expected = 120; //nếu 5! thì mong là 120
        int n = 5; //input 
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
