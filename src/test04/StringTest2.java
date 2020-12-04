package test04;

public class StringTest2 {

	public static void mian (String[] args) {
		String str = "샴고양이코숏고양이페르시안고양이사막고양이";
		String[] catTypes = str.split("고양이");
		for(int i=0;i<catTypes.length;i++) {
			System.out.println(catTypes[i]);
		}
	}
	
}
