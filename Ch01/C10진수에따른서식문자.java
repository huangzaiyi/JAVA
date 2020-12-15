package Ch01;

public class C10진수에따른서식문자 {

	public static void main(String[] args) {
		//10진수 서식문자에 여러 진수의 값전달
		System.out.printf("%d\n", 0b1111);
		System.out.printf("Decimal : %d\n", 173);	//기본 숫자의 진수는 10진수
		System.out.printf("Decimal : %d\n", 0255);	//숫자앞 '0'붙으면 8진수
		System.out.printf("Decimal : %d\n", 0xAD);	//숫자앞 '0x'붙으면 16진수
		
		//8진수 서식문자에 여러 진수의 값전달
		System.out.printf("Octal : 	\n", 173);	
		System.out.printf("Octal : %o\n", 0255);
		System.out.printf("Octal : %o\n", 0xAD);
		
		//16진수 서식문자에 여러 진수의 값 전달
		System.out.printf("Hexadecimal : +x\n", 173);	
		System.out.printf("Hexadecimal : %x\n", 0255);
		System.out.printf("Hexadecimal : %X\n", 0xAD);
		
	}

}
