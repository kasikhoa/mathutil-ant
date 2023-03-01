/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoa.mathutil.main;

import com.khoa.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentThrowsException();
              
    }

    //Thiết kế hàm getF() là: chỉ tính n! từ 0..20
    //Nếu đưa n < 0 hoặc n > 20 thì HÀM SẼ KO TÍNH, CHỬI
    //                              BẰNG CÁCH NÉM RA NGOẠI LỆ!!
    //thực tế hàm getF() khi chahyj có làm dc như thiết kế hay k
    //phải test thử, chạy thử mới biết dc
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #4: Test getF() with n = -5, wrong argument
        //Expected value: an exception is thrown
        //                IllegalArgumentException
        System.out.println("Test -5!: expected = Illegal Argument Exception is thrown!");
        MathUtility.getFactorial(-5);

    }

    //dân dev phải có trách nhiệm test code của mình chạy đúng hay sai
    //trước khi lắp ráp nó với các class khác để tạo nên các chức năng
    //Ghi chú:
    //Có nhiều quy tắc đặt tên hàm cho việc kiểm thử hàm
    //thường tên hàm sẽ bao ham ý nghĩa của việc kiểm thử
    //ví dụ hàm dưới này sẽ dùng để test cái hàm tính giai thừa
    //
    public static void testFactorialGivenRightArgumentRunsWell() {
        //test case #1: test getFactorial() with n = 0
        //expected value: 1 - hy vọng đưa n = 0 vào thì hàm trả về 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);

        System.out.println("Test " + n + "!: expected = " + expectedValue
                + " | actual: " + actualValue);

        //Test case #2: test getFactorial() with n = 1
        //Expected value = 1 - hi vọng app trả về 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);//thực tế hàm chạy
        System.out.println("Test " + n + "!: expected = " + expectedValue
                + " | actual: " + actualValue);

        //Test case #3: Test getFactorial(3)
        //Expected value = 6
        System.out.println("Test 3!: expected = 6"
                + " | actual: " + MathUtility.getFactorial(3));
    }
}
