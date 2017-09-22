package com.proba;

import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch1 = Integer.parseInt(br.readLine());
        int ch2 = Integer.parseInt(br.readLine());
        System.out.println(ch1 == ch2 ? ch1 : Math.min(ch1,ch2));
    }
}
