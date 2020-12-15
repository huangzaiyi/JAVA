package Ch01;

public class C05자료형 {

	public static void main(String[] args) {
		//-----------------------
		//정수형
		//-----------------------
		//1 int 자료형
		
		/*
		int var1 = 0b1011;	//2진수
		int var2= 0206;		//8진수
		int var3 = 365;		//10진수
		int var4 = 0xB3;	//16진수
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		*/
		
		//2 byte 자료형 : 1byte 정수
		
		/*
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		*/
		
		//3 long : 8byte 정수
		
		/*
		int var1 = 3000000000L;	// 오른쪽 리터럴의 자료형을 Long으로 지정(L접미사)
								// 왼쪽 복사되는 공간의 자료형 int형 
								// 복사되는 공간이 저장할 자료보다 부족하기때문에
								// 컴파일 에러발생
		long var2 = 3000000000L;
		//리터럴 정수 값의 기본자료형은 int 형
		//리터럴 실수 값의 기본자료형은 double 형
		*/
		
		//-----------------------
		//실수형
		//-----------------------	
	
		//실수의 소수점 표현방식 
		//고정소수점 : 소수점의 위치가 고정인 상태에서 데이터를 저장하는 방법
		//부동소수점 : 소수점의 위치가 저장될 데이터값에 따라 바뀌어지는 방법
		
		//float 	: 4byte 실수
		//double	: 8byte 실수
		
		/*
		float var1 = 0.1234567890123456789F;
		double var2 = 0.1234567890123456789;
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		*/
		
		//-----------------------
		//단일문자
		//-----------------------
		//01 char : 2byte 단일 문자 저장
		
		/*
		char c1 = 'A';
		char c2 = '가';
		System.out.println(c1);
		System.out.printf("%d\n", (int)c1);
		System.out.println(c2);
		System.out.printf("%d\n",(int)c2);
		*/
		
		
		//-----------------------
		//문자열
		//-----------------------
		//String 클래스 자료형 - 문자열 저장
		
		
		String name ="홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		

	}

}
