package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        System.out.format("%d %d %d", a, a, a);
    }
}
