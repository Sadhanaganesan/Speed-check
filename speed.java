import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner c=new Scanner(System.in);
        Float s=c.nextFloat();
        Float d=c.nextFloat();
        Float t=c.nextFloat();
        double sp=(s)/3600.0;
        double res=d/sp;
        if(res<=t){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
