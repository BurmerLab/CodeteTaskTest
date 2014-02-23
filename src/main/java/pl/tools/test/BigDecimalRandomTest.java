/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tools.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Michał
 */
public class BigDecimalRandomTest {
  
   public static void main(String[] args) {
        BigDecimal max = new BigDecimal("1000");
        
        BigDecimal randFromDouble = new BigDecimal(BigInteger.valueOf(new Random().nextInt(100001)), 2);
//        System.out.println("random: " + randFromDouble);
//        
//        BigDecimal actualRandomDec = randFromDouble.multiply(max);
//        System.out.println("test1:" + actualRandomDec);
//        System.out.println("test2miejsca po przecinku:" + actualRandomDec.setScale(50));
//
//        BigInteger actualRandom = actualRandomDec.toBigInteger();
        System.out.println("test:" + randFromDouble);
    }
}
