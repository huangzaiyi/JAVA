package Ch01;

public class C07문자저장 {

	public static void main(String[] args) {
		//char 형을 10진수로 변환
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'가');
		System.out.println((int)'나');
	
		System.out.println();
		//char 형을 16진수로 출력
		System.out.printf("%x\n", (int)'A');
		System.out.printf("%x\n", (int)'a');
		System.out.printf("%x\n", (int)'가');
		System.out.printf("%x\n", (int)'나');
		System.out.println();
		
		//유니코드 값을 이용해서 해당 코드의 문자 출력
		
		System.out.println('\u0041');
		System.out.println('\u0061');
		System.out.println('\uac00');
		System.out.println('\ub098');
	
	
	
	}
	
	
	

}
