package com.linfix.study.licode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int repeatedNTimes(int[] A) {
		int N2 = A.length;
		int N = N2/2;
		int[] a = new int[N+1];
		for(int i = 0;i<a.length;i++){
			a[i] = -1;
		}
		int[] b = new int[N+1];
		int count = N+1;
		int index1 = 0;
		int index2 = 0;
		Boolean tag = true;
		for(int i = 0;i<N2;i++) {
			int tmp = A[i];//{4,1,7,0,0,9,0,0}
			for(int j = 0;j<a.length;j++) {
				if(tmp == a[j]) {
					index2 = j;//在a中找的了tmp
					break;
				}else {
					index2 = -1;
				}
			}
			if(index2 != -1) {
				b[index2]++;
				if(b[index2] == N) {
					return a[index2];
				}
			}else{
				index1 = a.length - count;
				a[index1] = tmp;
				count-=1;
				b[index1]++; 
				if(b[index1] == N) {
					return a[index1];
				}
			}
			
		}
		return -1;
		
    }
	
	public static void main(String[] args) {
		int[] A = {4,1,7,0,0,9,0,0};
		System.out.println(new Solution().repeatedNTimes(A));
	}
}
