package Assignments.Assignment6.VamphireNumber;

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        List<Long> result=new ArrayList<>();
        long i=1000;
        while(result.size()<100)
        {

            if((String.valueOf(i)).length()%2!=0)
            {
                i=i*10;
                continue;
            }
            else if(isVamphire(String.valueOf(i)))
            {
                result.add(i);
            }
            i++;
        }
        System.out.println("---first 100 Vamphire---- ");
        for(Long number:result)
        {
            System.out.println(number+" ");
        }
    }
    public static boolean isVamphire(String number)
    {
        List<String> permutations=getPermutations(number);
        for(String num:permutations)
        {
            if(isFang(num,number))
            {
                return true;
            }
        }
        return false;
    }
    public static boolean isFang(String num,String number)
    {
        long left=Long.valueOf(num.substring(0,num.length()/2));
        long right=Long.valueOf(num.substring(num.length()/2));
        long actual=Long.valueOf(number);
        if(left*right==actual)
        {
            return true;
        }
        return false;
    }
    public static List<String> getPermutations(String number)
    {
        List<String> permutations=new ArrayList<>();
        findPossibleCombinations(number,0,permutations);
        return permutations;
    }
    public static void findPossibleCombinations(String number,int currentIndex,List<String> permutations)
    {
        if(number.length()==currentIndex)
        {
            if(number.charAt(number.length()/2)!='0' && number.charAt(number.length()-1)!='0')
            {
                String number2=number.substring(number.length()/2)+number.substring(0,number.length()/2);
                permutations.add(number2);
                permutations.add(number);
            }
            return;
        }
        for(int i=currentIndex;i<number.length();i++)
        {
            String number1=SwapCurrentIndex(number,i,currentIndex);
            findPossibleCombinations(number1,currentIndex+1,permutations);

        }
    }
    public static String SwapCurrentIndex(String number,int i,int j)
    {
        char[] charArray=number.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;

        return new String(charArray);
    }
}
