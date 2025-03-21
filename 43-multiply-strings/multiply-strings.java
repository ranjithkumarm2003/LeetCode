 import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
       // int i=0;
        // while(i!=num1.length()){
        //    Bi rem=num1.charAt(i)-'0';
        //    n1=(n1*10)+rem;
        //    i++;
        // }
        // i=0;
        BigInteger n2=new BigInteger(num2);
        // while(i!=num2.length()){
        //    int rem=num2.charAt(i)-'0';
        //    n2=(n2*10)+rem;
        //    i++;
        // }
     return ""+ n1.multiply(n2);
    }
}