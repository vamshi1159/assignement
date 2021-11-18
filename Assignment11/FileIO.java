package Assignments.Assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        String data=getData(args[0]);
        HashMap<Character,Integer> count=getCount(data);
        putData(count);
    }
    public static void putData(HashMap<Character,Integer> count)
    {
        try
        {
            File file=new File("./Assignments/Assignment11/result.txt");
            PrintWriter pw=new PrintWriter(file);
            for(Character key:count.keySet())
            {
                pw.println("key :"+key+" count:"+count.get(key));
            }
            pw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    public static HashMap<Character,Integer> getCount(String data)
    {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(char ch:data.toCharArray())
        {
            if(!hashMap.containsKey(ch))
            {
                hashMap.put(ch,1);
                continue;
            }
            hashMap.put(ch,hashMap.get(ch)+1);
        }
        return hashMap;
    }
    public static String getData(String fileName)
    {
        String data=null;
        StringBuilder sb=new StringBuilder("");
        try
        {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("./Assignments/" +
                    "Assignment11/"+fileName));

            String str;
            while((str=bufferedReader.readLine())!=null)
            {
                sb.append(str);
            }
            bufferedReader.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        data=sb.toString();
        return data;
    }
}
