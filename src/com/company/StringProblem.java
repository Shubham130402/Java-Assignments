package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringProblem {
    public static void main(String[] args) {


    }
}

        /*
        //string program by using switch case
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your country name: ");
        String str = sc.nextLine();
        String country = str.toLowerCase(Locale.ROOT);

        switch (country) {
            case "india":
                System.out.println("country code is: +91");
                break;


            case "japan":
                System.out.println("country code is +92");
                break;

            default:
                System.out.println("print right country name which is existing");
        }
    }
    }
        /*
        String website = "ShubhamAgarwal.com";
        // print the string
        System.out.println("Website is: "+ website);
        //length of the string
        System.out.println("length is : " + website.length());
        //string sfter lower case
        System.out.println("string after tolowercase " + website.toLowerCase(Locale.ROOT));
        //string after uppercase
        System.out.println("String after toUpperCase: " + website.toUpperCase());
        // character at the nth index
        System.out.println("character at 4th index: " +website.charAt(4) );
        //find the index of any character which is present in string
        System.out.println("Index if 'g' is: "+website.indexOf('z') );
        // index of any character after some charagters in the given array
        System.out.println("idex of a after the 7th character: "+website.indexOf('g',7));
        //substring from the nth index
        System.out.println("substring after 9th index: "+ website.substring(7));
        //substring from the nth index to mth index
        System.out.println("substring after 9th index: "+ website.substring(0,7));
        //string after replacing a character to another one
        System.out.println("String after replacing 'a' with b is:  "+ website.replace('r','b'));
        //string is equals or not
        System.out.println("given string id eqaul to 'SHUBHAMAGARWAL.COM or not : " + website.equals("SHUBHAMAGARWAL.COM"));
        System.out.println("check eqals with ignoring the cases: "+ website.equalsIgnoreCase("SHUBHAmaGARWAL.COM"));
        //print qoutes in output
        String URL = "    https://www.    ";
        System.out.println("String URL id \" "+URL+"  \" ");
        System.out.println("length of string url is "+ URL.length());
        String url = URL.trim();
        System.out.println("length of string url after trim() is : "+ url.length());
        //string after concat
        System.out.println("String after concat url and website is : "+url.concat(website));




    }
}
        /*
        // String tokenizer program Series
        StringTokenizer st;
        st = new StringTokenizer("Hello_Jsvs_Programming","_");
        //hasMoreToken() method
        while(st.hasMoreTokens()) System.out.println(st.nextToken());

        //nextToken() method
        StringTokenizer st1 = new StringTokenizer("my.name.is.khan");
        System.out.println("Next token is : " + st1.nextToken("."));

        //snoyher hasMoreToken() method program
        StringTokenizer st2 = new StringTokenizer("Hello_Shubham_Agarwal","_");
        while(st2.hasMoreTokens()){
            String token = st2.nextToken();
            System.out.print(token + "\n");
        }


    }
}
        /*
        // String buffer progrsm
        // create a object of string buffer class
        StringBuffer strbuf = new StringBuffer("w");
        System.out.println(strbuf);
        // insert() method
        strbuf.insert(1,"siteeducasdsfbnbvcxzcvbtors");
        System.out.println(strbuf);

        // append() method
        strbuf.append(".com");
        System.out.println(strbuf);

        // reverse() method
        strbuf.reverse();
        System.out.println(strbuf);

        //substring() method
        System.out.println("substring form position 4 to 17 : \t" + strbuf.substring(4,19));

        // setCharAt() method
        strbuf.setCharAt(5,' ');
        System.out.println(strbuf);

        // charAt() method
        System.out.println("character at the 10th position is: " + strbuf.charAt(5));

        //deleteCharAt() method
        System.out.println("delete the character at 5th position and then string is:"+ strbuf.deleteCharAt(5));

        //capacity()
        System.out.println("capacity of the stringbuffer" );
        System.out.println(strbuf.capacity());




        /* palindrome program
        String a,b;
        StringBuffer sb;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to checkout the string is palindarome or not");
        a = sc.nextLine();


         */



        // fibonacci series
        /*
        int first= 0, second =1 ;
        int result = 0;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println(("print the last limit of the fibonacci number "));
        int n = sc.nextInt();
        while (true){
            result = first + second;
            count++;
            if(result >= n ){
                break;
            }
            first = second;
            second = result;
            System.out.println(" Fiboncacci No. ["+count+"]is: " + result);

        }

    }
}

        /*

        }

}

         */

