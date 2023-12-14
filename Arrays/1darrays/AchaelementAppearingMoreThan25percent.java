
import java.util.*;

public class AchaelementAppearingMoreThan25percent {
    public int findSpecialInteger(int[] arr) {
        int count=1;
        int result=arr[0],maxCount=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                if(count>maxCount)
                {
                    maxCount=count;
                    result=arr[i-1];
                }
                count=1;
            }
        }
        if(count>maxCount)
        {
            result=arr[arr.length-1];
        }

        return result;
    }
    public static void main(String[] args) {
        
    }
}
