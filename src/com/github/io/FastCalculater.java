//NO:15552
package com.github.io;

import java.io.*;
import java.util.StringTokenizer;
/*
 * 구분자로 엔터키 (\r\n) 사용시 필요한 토큰을 찾지 못해 예외 에러 발생, TODO: 충분한 입력이 들어오지 않았을 경우 엔터키 무시 기능 혹은 엔터키 -> shift 로 변경 기능 필요
 * if you enter(\r\n) to use seperater will Exception error to can't find nextToken
 */
public class FastCalculater {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int times = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < times; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());

            bufferedWriter.write( (A+B) + "\n" );
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}