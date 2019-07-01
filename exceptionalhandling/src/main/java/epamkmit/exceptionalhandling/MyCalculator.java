package epamkmit.exceptionalhandling;
import java.lang.Math;
class MyCalculator {
    long power(int n, int p) throws Exception
    {
        if(n==0 && p==0)
        {throw new Exception("n and p should not be zero.");}
        else if(n<0 || p<0)
        {throw new Exception("n or p should not be negative.");}
        else
        {
            int result=(int)Math.pow(n,p);
            return result;
        }
    } 
}

