/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoa.mathutil.core.test;

import com.khoa.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {

    //kiểm thử ngoại lệ thì sao??
    //tức là hàm getF() đc thiết kế rằng nếu đưa n cà chớn
    //thì hàm phải ném ngoại lệ!!
    //tức là getF(-5) thì EXPECTED == NGOẠI LỆ ILLEGAL ARGUMENT EXCEPTION
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {

        //Test case #5: getF() with a wrong arg: n = -5 
        //Expected result: An exception is thrown: Illegal Argument Exception
        
        MathUtility.getFactorial(-5);
        //nếu chỉ gõ lệnh trên thì BỊ ĐỎ
        //DO LỆNH NÀY GÂY RA EXCEPTION
        //NHƯNG HÀM NÀY MÌNH KÌ VỌNG RA EXCEPTION, NẾU CÓ EXC
        //THÌ ĐÚNG NHƯ THIẾT KẾ
        //LỖI CỦA TA LÀ KO ĐO, KO SO SÁNH
        //KO NHẬN DIỆN LÀ CÓ NGOẠI LỆ RỒI!!
        //TA CẦN THÊM 1 LỆNH: ĐÃ CÓ NGOẠI LỆ CHƯA??
        //CÓ RỒI -> XANH
        //CHƯA -> ĐỎ
        //JUnit 4 ko dùng hàm assert() để đo ngoại lệ
        //JUnit 5 dùng hàm assert() để đo ngoại lệ
        
    }

    @Test
    //trong hàm này sẽ chứa các test case để test getF()
    //với n hợp lệ trong khoảng 0..20
    public void tetFactorialGivenRightArgumentReturnsWell() {

        //Test case #1" test getF() with n = 0
        //Expected result = 1; //hy vọng 0! = 1
        int n = 0;
        long expectedValue = 1; //hy vọng
        long actualValue = MathUtility.getFactorial(n); //thực tế getF() trả về mấy??

        Assert.assertEquals(expectedValue, actualValue);

        //Test case #2: test getF() with n = 5;
        //Expected result = 120 //hy vọng 5! = 120, xem máy có 
        //                              làm dc như z ko??
        Assert.assertEquals(120, MathUtility.getFactorial(5));

        //Test case #3: test getF() with n = 6; expected = 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));

        //Test case #4: test getF() with n = 4; expected = 24
        Assert.assertEquals(24, MathUtility.getFactorial(4));
    }

}
