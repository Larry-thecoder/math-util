/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khuong.mathutil.main;

import com.khuong.mathutil.core.MathUtil;

/**
 *
 * @author Mr.Khuong
 */
public class Main {
    public static void main(String[] args) {
        //kiem thu vs data dua vao nhin ket qua tr
        
        //Test case #1: check getF() with valid argument
        //n = 0, expected = 1; actual =???
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //compare
        System.out.println("0! -> expected: "+expected+" ; actual: "+actual);
        
        //Test case #2: check getF() with valid argument
        //n = 6, expected = 720; actual =???
        expected = 720;
        actual = MathUtil.getFactorial(6);
        //compare
        System.out.println("6! -> expected: "+expected+" ; actual: "+actual);
        
        //Test case #3: check getF() with invalid argument
        //n = -5, expected = ???; actual = ra ngoại lệ
        //expected = Exception sẽ phải xuất hiện
        actual = MathUtil.getFactorial(-5);
        
        //ngoại lệ xuất hiện như kì vọng
    }
}
