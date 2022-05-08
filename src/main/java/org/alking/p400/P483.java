package org.alking.p400;

public class P483 {

    public String smallestGoodBase(String n) {

        // 假设 p 是满足最小好进制的数
        // p^0 + p^1 + p^2 + ... p^m = n
        // p^1 + ................p^(m+1) = n * p
        // p^(m+1) - P^0 = n*(p-1)

        // p^m  = np - n + 1
        // mlog(p) = log(np-n+1)
        // m = log(np-n+1)/log(p) 是他妈整数

        // 取上限
        // p^m  = n * (p -1) + 1 = np - n + 1 < np
        // p^m < np
        // 两边取 logp(p^m) < logp(n*p)
        // m < logp(n) + 1 = log2(n) + 1
        // mMax = log2(n)

        // 取下限
        //  np -n < np -n + 1 = p^m
        //
        // n(p -1) < p^m < np
        // logp(n) + logp(p-1) < m

        // logp(n) + logp(p-1) < m < logp(n) + 1
        // 所以 m = logp(n)的天花板(ceil) 这特么不是废话么
        // ceil(log3(13)) = 3


        return null;
    }
}
