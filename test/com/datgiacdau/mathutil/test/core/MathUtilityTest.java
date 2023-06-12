/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.datgiacdau.mathutil.test.core;

import com.datgiacdau.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;



/**
 *
 * @author DELL
 */
public class MathUtilityTest {
    // đâu là class dùng các hàm thư viện Junit để kiểm tra code chính - hàm tính giai thừa
    // bên core.MathUtil()
    //hàm dưới trả về nhập giá trị well (đúng)
    //nhiều @Test ứng nhiều case kiểm thử tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0; // test tình huống đúng đầu vào
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        
        //ss dùng famework
        Assert.assertEquals(expected, actual);
        
        //gộp thêm vài case
        Assert.assertEquals(1, MathUtil.getFactorial(1)); // muốn 1! =1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); // muốn 2! =2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); // muốn 3! =6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); // muốn 4! =24
        //hàm giúp ss hai giá trị: giống xanh sai đỏ
        //ít nhất case đang tess
        
    }
    //đưa test âm, >20 thì kì vọng ngoại kệ xuất hiện
    //có ngoại lệ -> xanh xuất hiện
    //test case input: -5
    //expected: IllegalArgumentException xuất hiện
    //ngoại lệ là tính hg ko đo lg bằng value mà chỉ có thể xem có xuất hiện hay ko
    //ko dùng assertEquals() đc
    
    //màu đỏ vì có ngoại lệ nhưng ko phải cái ngoại lệ mk kì vọng -> kì vọng sai
  /*  @Test(expected = NumberFormatException.class)
    public void testGetFactorialGivenWrongArgumentReturnsThrowsException(){
        MathUtil.getFactorial(-5); //hàm chạy ra ngoại lệ numberformat
    }
    */
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentReturnsThrowsException(){
        MathUtil.getFactorial(-5); //hàm chạy ra ngoại lệ numberformat
    }
    
    //cách khác bắt ngoại lệ, tự nhiên hơn
    //xài lambda
    //hàm cho ra ngoại lệ nếu nhận vào 21
    @Test
    public void testGetFactorialGivenWrongArgumentReturnsThrowsException_TryCatch(){
        //chủ động kiểm soát ngoại lệ
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            //bắt try-catch thì xanh do chủ động bắt
            //ko chắc  ngoại lệ mình muốn xảy ra
            Assert.assertEquals("chi tu 0>20", e.getMessage());
        }
        
    }   
    
}
