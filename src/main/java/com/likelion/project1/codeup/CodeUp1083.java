package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1083 {
    public static void main(String[] args) throws IOException {
        // 커밋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) System.out.print("X ");
            else System.out.printf("%d ", i);
        }
    }
}
