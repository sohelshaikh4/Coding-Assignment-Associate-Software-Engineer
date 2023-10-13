
//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

/* 
import java.util.*;
public class Java_Task
{
    public static void main(String [] args)
    {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Collections.shuffle(list);
        System.out.println("Shuffle List: "+list);

    }
}
*/

//B. Enter Roman Number as input and convert it to integer. (ex IX = 9)
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Java_Task
{
    public static void main(String []args)
    {
        System.out.println("Enter Roman No: ");
        String romannum="IX";
        int result= romantoInt(romannum);
        System.out.println("Integer value :"+result);
        
    }
    public static int romantoInt(String s)
    {
        Map<Character, Integer> map= new  HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;
        int prevvalue=0;

        for(int i=s.length()-1;i>=0; i--)
        {
            int currentvalue= map.get(s.charAt(i));
            if (currentvalue < prevvalue) 
            {
                result -= currentvalue;
            } 
            else 
            {
                result += currentvalue;
            }

            prevvalue = currentvalue;
        }

        return result;
        }
    }
}