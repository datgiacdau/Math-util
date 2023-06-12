/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.datgiacdau.mathutil.test.core;

import com.datgiacdau.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author DELL
 */
//câu lệnh báo hiệu Junut sẽ loop qua tập data
//lấy cặp data gồm input expected nhồi vào hàm test
@RunWith(value = Parameterized.class )
public class MathUtilDDTTest {
    
    //hàm trả về mảng 2 chiều chứa các cặp expected|input
    @Parameterized.Parameters //JUnit ngầm chạy từng dòng để lấy data
    public static Object[][] initData() {
        return new Integer[][]{
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
        };
    }
 
    //giả sử loop qua đc từng dòng vẫn cần gắn từng value của cột
    @Parameterized.Parameter(value = 0) //value = 0 map với mảng data
    public int n;
    @Parameterized.Parameter(value = 1) 
    public long expected;
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        assertEquals(expected, MathUtil.getFactorial(n));
    }
    
    
}
