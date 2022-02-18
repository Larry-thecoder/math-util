/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khuong.mathutil.test;

import static com.khuong.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Mr.Khuong
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    // Data Driven Testing
        // ta cần test thử getF()
        //ta đưa data cho hàm, xem nó trả về kết luận đúng sai
        //3 việc: chuẩn bị data, đưa dât vào hàm, kết luận đúng sai
        // done bên MathUnitlTest r, nhưng
        
        //0!, 0 -> 1
        //1!, 1 -> 1     bộ dữ liệu test. test data
        //2!, 2 -> 2     lưu table SQLServer, Excel, .CSV 
        //3!, 3 -> 6     lưu trong 1 mảng trong code
        //5!, 5 -> 
        //6!, 6 -> 
        
        //học cách viết code tách đám data ra khỏi các câu lệnh
        //getF(), ko mixed. Tất cả các framework unitTest 
        //của mọi NNLT đều làm đc
        
        
        
        /*
        hàm trả về mảng 2 chiều kiểu Object
        các framework chơi vs Object
        mảng số nguyên phải trả về Object, tức là chơi vs wraper class
        
        */
    //Baó vs JVM 
    @Parameterized.Parameters
        public static Object[][] initData(){
            //int a[] = {2, 4, 6, 8};
            //int a[4] = {2, 4, 6, 8};
            //int a[] = {0, 1}
            
            return new Integer[][]{
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {6,720},
        };
            
            
        }
        //cần trích data mảng con ra để được cặp value input/expected
        @Parameterized.Parameter(value = 0)// map cột 0
        public int input;
        
        @Parameterized.Parameter(value = 1)// map cột 1
        public int expected;
        
        @Test // Biến 1 hàm bất kì trong 1 class bất kì thành hàm main
    public void testFactorialGivenValideArgumentN6ReturnsWell() {
        
        ///long actual = getFactorial(input);
        
        assertEquals(expected, getFactorial(input));
    }
}
//Tách Data test ra 1 chỗ. sau đó lấy từng miếng data
//mồi/nhồi/map vào trong chỗ gọi hàm, chỗ assert()
//tách và nhồi vào -> làm hoài như vậy cho các bộ data
    
    

