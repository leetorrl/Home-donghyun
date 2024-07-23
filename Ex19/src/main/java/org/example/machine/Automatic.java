package org.example.machine;

import java.util.Arrays;

public class Automatic extends seleck {

    public void Aprint(int S) {

        int[][] num = new int[S][6];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                num[i][j] = (int) (Math.random() * 45) + 1;

                for(int z=0; z<j; z++){

                    if(num[i][z]==num[i][j]){
                        j--; //j배열의 칸에서 z 숫자와 중복되면 중복된값 제거후 for로 돌아감
                        break;
                    }
                }
            }
            for(int j=0; j< num[i].length-1; j++){
                for(int z=j+1; z<num[S].length; z++){

                    if(num[i][j]>num[i][z]){
                        int temp = num[i][z];
                        num[i][z]=num[i][j];
                        num[i][j]=temp;
                    }
                }
            }
            System.out.println(Arrays.toString(num[i]));
        }
        System.out.println();
        System.out.println(end);
            }
        }
