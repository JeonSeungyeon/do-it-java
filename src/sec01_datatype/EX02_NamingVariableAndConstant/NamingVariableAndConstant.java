package sec01_datatype.EX02_NamingVariableAndConstant;

/*변수와 상수의 이름 짓기*/

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		//변수의 이름
		boolean aBcD;		// 대문자는 새로운 단어의 앞 글자에 사용 권장
		byte 가나다;			// 한글로 작성 가능(권장하지 않음)
		short _abcd;
		char $ab_cd;
		// int 3zbcd;		// 숫자는 이름 맨 앞에 올 수 없음.
		long abcd3;
		// float int;		// 자바 예약어는 사용할 수 없음.
		double main;		// 메서드 이름과 변수이름은 동일해도 무관.
		// int my WOrk;		// 스페이스, 특수 키는 사용할 수 없음.
		String myClassName;
		int ABC;			// 전부 대문자로 작성(권장하지 않음)
		
		// 상수의 이름
		final double PI;
		final int MY_DAYA;
		final float myData;	// 소문자 사용(권장하지 않음)

	}

}
