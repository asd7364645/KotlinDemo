import java.math.BigInteger;

/**
 * Created by Alex on 2017/5/26.
 * Alex
 */

class TestOne {
    public static void main(String[] args) {

//        System.out.println(new DiGui().digui(10000));
//        new DiGui().xunhuan(100000);
        System.out.println(new DiGui().mPow(10,100));

    }

}

class DiGui{
    public BigInteger digui(long num){
        // 如果数字为1，则直接返回
        if (num == 1L) {
            return BigInteger.valueOf(1);
        } else {// 否则递归求值
            return BigInteger.valueOf(num).multiply(digui(num-1));
        }
    }
    public void xunhuan(long num){
        BigInteger bnum = BigInteger.valueOf(1);
        for (long i = 1; i <= num; i++) {
            bnum = bnum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bnum);
    }
    public BigInteger mPow(long num,int mi){
        return BigInteger.valueOf(num).pow(mi);
    }
}
