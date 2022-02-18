/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khuong.mathutil.test;

import static com.khuong.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

// nếu muốn xài các hàm static, có 2 cách
// c1: gọi tên class.tên hàm static() nhớ import package ... tên class chứa hàm static
//c2: ko gọi tên class.tên hàm static() mà chỉ gọi tên hàm nhớ import static package ... chấm tên hàm hoặc chấm * ở đuôi

/**
 *
 * @author Mr.Khuong
 */
public class MathUtilTest {
    
    // test case 1: getF() with valid argument
    // n = 0, expected = 1; actual = ?
    @Test // Biến 1 hàm bất kì trong 1 class bất kì thành hàm main
    public void testFactorialGivenValideArgumentReturnsWell() {
        long expected = 1; // hope 1 if tính 0!
        long actual = getFactorial(0);
        
        assertEquals(expected, actual);
        // tương đương trong main() kiểu cũ, ta in ra kết quả expected, actual
        // tự nhìn và so sánh
        //bên JUnit, 2 màu sắc: XANH: 2 cái khớp
        //                      ĐỎ: 2 cái ko khớp
    }
    
    // test case 2: getF() with valid argument
    // n = 6, expected = 720; actual = ?
    @Test // Biến 1 hàm bất kì trong 1 class bất kì thành hàm main
    public void testFactorialGivenValideArgumentN6ReturnsWell() {
        long expected = 720; // hope 720 if tính 6!
        long actual = getFactorial(6);
        
        assertEquals(expected, actual);
        // tương đương trong main() kiểu cũ, ta in ra kết quả expected, actual
        // tự nhìn và so sánh
        //bên JUnit, 2 màu sắc: XANH: 2 cái khớp
        //                      ĐỎ: 2 cái ko khớp
    }
    
    //ngoại lệ ko phải là 1 value, là  tình huống bất thường xuất hiện hay có khả xảy ra
    //ko là value để so sánh asertEquals()
    //ngoại lệ ko dùng asertEquals()
    //chỉ đo lường bằng cách coi có xuất hiện hay ko
    // test case 3: getF() with invalid argument
    // n = -5, expected = ngoại lệ xuất hiện
    @Test(expected = IllegalArgumentException.class) // Biến 1 hàm bất kì trong 1 class bất kì thành hàm main
    public void testFactorialGivenInvalideArgumentThrowsException() {
        getFactorial(-5);
        
        // tương đương trong main() kiểu cũ, ta in ra kết quả expected, actual
        // tự nhìn và so sánh
        //bên JUnit, 2 màu sắc: XANH: 2 cái khớp
        //                      ĐỎ: 2 cái ko khớp
    }
}
