import java.util.*;

public class Test {


    public static boolean isPalindrome (String x){

        int length = x.length() ;
        for(int i =0; i < length/2 ; i ++){
            if(x.charAt(i) != x.charAt(length - i -1)){
                return false;
            }

        }
        return true;
    }

    public static int minSplit(int coins){
        int temp = coins;
        int result = 0;

        if (temp >= 50) {
            result += temp/50;
            temp -= (temp / 50) * 50;

        } if (temp >= 20){
            result += temp/20;
            temp -= (temp/20)*20;

        }  if (temp >= 15){
            result += temp/15;
            temp -= (temp/15)*15;

        }  if (temp >= 10){
            result += temp/10;
            temp -= (temp/10)*10;

        }  if (temp >= 5){
            result += temp/5;
            temp -= (temp/5)*5;

        } if (temp >= 1){
            result +=temp;
        }

        return result;
    }


    public static int notContains(int[] array){
        int count = 1;

        Set<Integer> set = new HashSet<>();                   //we add our array to set in order to check below
        for(int x : array){
            set.add(x);
        }
        while(true){

            if(set.contains(count)){
                count++;
            }else break;
        }
        return count;
    }

    public static boolean isProperly(String sequence){
        int count = 0;
        if (sequence.charAt(0) == ')'){return false;}

        for(int i = 0; i < sequence.length(); i++){
            if(sequence.charAt(i) == '('){
                count++;
            }else if(sequence.charAt(i) == ')'){
                if (count <= -1){return false;}
                count--;
            }
        }
        return count == 0;
    }

    public static int countVariants(int stairs){
        if(stairs < 0){
            return 0;
        }
        if (stairs == 0){
            return 1;
        }

        return countVariants(stairs - 2 ) + countVariants(stairs - 1);

    }
}