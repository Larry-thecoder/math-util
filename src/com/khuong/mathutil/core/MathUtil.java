/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khuong.mathutil.core;

/**
 *
 * @author Mr.Khuong
 */

/* Class này cung cấp các tiện ít 1 loạt các hàm toán hcj để sd

*/
public class MathUtil {
    //hàm tính n giai thừa n!= 1.2.3....n
    //ko có giai thừa số âm, 0! =1! = 1 quy ước
    // giai thừa tăng rất nhanh 20! vừa đủ cho long, 18 con số 0
    // 21 vượt long vượt 18 số 0
    // chặn việc n<0 và/hoặc n>21
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument."
                    + " N must be between 0...20");
        if(n == 0 || n == 1 )
            return 1;
        
        //sống sót đến đây, n = 2...20
        long product = 1; //ket qua trung gian
        for(int i = 2; i <= n; i++){
            product *= i;
        }
        return product;
    }
    
}
