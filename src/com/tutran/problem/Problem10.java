package com.tutran.problem;

import com.tutran.problem.handler.BaseHandler;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tu_tran on 12/17/13.
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    Find the sum of all the primes below two million.
 */
public class Problem10 implements BaseHandler<Integer, BigInteger> {

    @Override
    public BigInteger solve(Integer input) {
        BigInteger result = BigInteger.valueOf(5);
        List<Integer> primeList = new ArrayList<Integer>();
        primeList.add(2);
        primeList.add(3);
        for (int i=5; i<=input; i+=2) {
            boolean isPrime = true;
            for (Integer num : primeList) {
                if (i%num == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result = result.add(BigInteger.valueOf(i));
                primeList.add(i);
            }
        }
        return result;
    }
}
