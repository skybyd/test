package test04;

public class ArrayTest4 {
	public static void main (String[] args) {
		int[] nums = new int[3]; 
		System.out.println(nums[0]);}
	{
		/*
		 * 메모리 용량 : 256m
		 * 메모리 용량 : 16m
		 * 전
		 * 원
		 * byte = 8bit
		 * 1bit가 표현할 수 있는 수는 1과 0뿐 
		 *
		 */	
	String[] strs = new String[3];
	strs[0] = "거북이";
	strs[0] = "토끼";
	strs[0] = "고래";
	
	for(int i=0;i<strs.length;i++) {
		if(strs[i].length()==2) {
		System.out.println(strs[i].length());
	}
	}
	
	}
}
