/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.mathutil.core;

/**
 *
 * @author DELL
 */
public class MathUtil {
    //trong class này cung cấp nhiều hàm  xử lí toán học
    //clone class Math của JDK
    //hàm thư viên xài chung ko cần lưu lại giá trị
    // chọn thiết kế hàm static
    
    //hàm tính giai thừa!!!
    // n! = 1.2.3.4...n
    //ko giai thừa số aam
    //0!=1!=1 qui ước
    //giải thừa hàm dồ thị dốc đứng tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa đủ kiểu long của Java
    //21 giai thừa tràn kiểu long
    //bài này qui ước tính n! từ 0 ->20
//    public static long getFactorial(int n){
//        if (n<0 || n>20)
//            throw new IllegalArgumentException("chi tu 0>20");
//        
//        if (n==0 || n==1)
//            return 1; //theo qui ước
//        
//        long product = 1; // tích nhân dồn
//        for (int i = 2; i <= n; i++) 
//            product *=i; //product = product *i;
//        return product;
//            
//        }
    //Học đệ qui - hiện tượng gọi lại chính mình vs qui mô khác
    //Ví dụ: búp bê Nga, giống nhau và lồng trong nhau
    // tính n! = n * (n-1)!
        public static long getFactorial(int n){
        if (n<0||n>20)
            throw new IllegalArgumentException("n must be between 0 .. 20");
        
        if (n==0 || n==1)
            return 1; //theo qui ước
        
        return n * getFactorial(n - 1); 
        }
        
}
