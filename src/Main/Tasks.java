package Main;

import sun.security.util.Length;
import java.util.*;
import static com.google.common.math.IntMath.pow;

public class Tasks
{

    public void evenNumber(int result)
    {
        int a = 4, b = 5, c = 6;

        if (a % 2 == 0)
        {
            result = a * b / c;
        }
    }

    public void evenNumber2(int result)
    {
        int a = 7, b = 8, c = 6;

        if ((a + b) % 2 == 0 || (b + c) % 2 == 0)
        {
            result = pow(a, c);
        }
        else
        {
            result = a + b - c;
        }
    }

    public void coordinateSystem(int ret) throws Exception
    {
        int x = 0, y = 0, z = 0;

        if (x == 0 || y == 0 || z == 0)
        {
            throw new Exception();
        }
        ret = 0;

        if (x > 0 && y > 0)
        {
            ret = 1;
        }
        else if (x < 0 && y > 0)
        {
            ret = 2;
        }
        else if (x < 0 && y < 0)
        {
            ret = 3;
        }
        else
        {
            ret = 4;
        }
    }

    public void facktorial(int fackt)
    {
        int ch = 0;

        if (ch > 0)
        {
            for (int i = ch; i >= 1; i--)
            {
                fackt *= i;
            }
        }
        else
        {
            fackt = -1;
        }
    }

    public void reversMirror(int[] arr)
    {
        if (arr == null || arr.length == 0)
            return;

        for (int i = 0; i < arr.length / 2; i++)
        {
            int tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }

    public void reversArr()
    {
        int[] arr = {1, 2, 3, 4};
        int hlen = arr.length / 2;
        int cpos = hlen + arr.length % 2;

        for (int i = 0; i < hlen; i++)
        {
            int t = arr[i];
            arr[i] = arr[cpos + i];
            arr[cpos + i] = t;
        }
    }

    public void bubbleSort(int[] arr)
    {
        for (int i = arr.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {

                if (arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void conversionIntToString(String args[])
    {
        int i = 200;
        String s = String.valueOf(i);
        System.out.println(i + 100);//300 because + is binary plus operator
        System.out.println(s + 100);//200100 because + is string concatenation operator
    }

    public void conversionDoubleToString(String args[])
    {
        double a = 44;
        String b = Double.toString(a);
    }

    public void conversionStringToInt()
    {
        String myString = "123456789";
        int n = Integer.parseInt(myString);
    }

    public void conversionStringToDouble()
    {
        String aString = "123,236";
        double b = Double.parseDouble(aString);
    }

    public void minLengthInString(String[] args)
    {
        String strInput = "Тихий океан — самый большой по площади и глубине океан на Земле. " +
                "Расположен между материками Евразией и Австралией на западе, " +
                "Северной и Южной Америкой на востоке, Антарктидой на юге.";

        String[] splitArray = strInput.split("[\\p{Punct}\\s]+");
        Set set = new TreeSet<String>(/*(o1, o2) -> o1.length() - o2.length()*/);
        set.addAll(Arrays.asList(splitArray));

        String shortest = (String) set.toArray()[0];
    }

    public void numberOfWords(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Some text");
        String input = sc.nextLine();

        int count = 0;

        if(input.length() != 0){
            count++;

            for (int i = 0; i < input.length(); i++) {
                if(input.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("You entered "+count+" words");
    }

    public void deleteLastWord(String[] args)
    {
        String text = "hbjhjh hkhkiu jiuyuguyih iohiuhiug hiuhyi huiu8y hiuyiguyftyftyftdd ihhhujg";
        System.out.println(text.substring(0, text.lastIndexOf(" ")));
    }
}

