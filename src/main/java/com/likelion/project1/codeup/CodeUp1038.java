package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1038 {
    public static void main(String[] args) throws IOException {
        // 커밋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append(a + b);
        System.out.println(sb.toString());
    }
}
