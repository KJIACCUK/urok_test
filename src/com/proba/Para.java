package com.proba;
/*
Существует ли пара?
*/

import java.io.*;

    public class Para {
        public static void main(String[] args) throws Exception {
            //напишите тут ваш код
            BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
            String a = red.readLine();
            String b = red.readLine();
            String c = red.readLine();

            if (a.equals(b) && b.equals(c) && a.equals(c))
                System.out.println(a + " " + b + " " + c);

            else if (a.equals(b))
                System.out.println(a + " " + b);

            else if (a.equals(c))
                System.out.println(a + " " + c);

            else if (b.equals(c)) {
                System.out.println(b + " " + c);
            }
        }
    }
