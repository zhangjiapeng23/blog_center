//package com.James.blog;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class BlogApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
//	@Test
//	void test() {
//		int[] f = {1, 2, 4, 8, 9, 12, 23, 34, 35, 81, 90};
//		int ans = binarySearchLeft(f, 13);
//		System.out.println(ans);
//	}
//
//	public int binarySearchRight(int[] f, int target) {
//		int low = 0, high = f.length;
//		while (low < high) {
//			int mid = low + (high - low) / 2;
//			if (f[mid] == target) {
//				return mid;
//			}
//			if (f[mid] > target) {
//				high = mid;
//			} else {
//				low = mid + 1;
//			}
//		}
//		return low;
//	}
//
//	public int binarySearchLeft(int[] f, int target) {
//		int low =0, high = f.length;
//		while (low < high) {
//			int mid = low + (high - low) / 2;
//			if (f[mid] == target) {
//				return mid;
//			}
//			if (f[mid] < target) {
//				low = mid;
//			} else {
//				high = mid  - 1;
//			}
//		}
//		return low;
//	}
//
//
//
//}
