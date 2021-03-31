package test;

class PhoneInfo {
	String name;
	String phoneNumber;
	String birthday;

	PhoneInfo (String na,String ph, String bi){
		name = na;
		phoneNumber = ph;
		birthday = bi;
	}
	
	PhoneInfo (String na,String ph){
		name = na;
		phoneNumber = ph;
		birthday = "";
	}

	PhoneInfo (String na){
		name = na;
		phoneNumber = "";
		birthday = "";
	}

	public int call() {
		System.out.println("이름: "+ name);
		System.out.println("전화번호: "+ phoneNumber);
		System.out.println("생년월일: "+ birthday);
		return 0;
	}
}

class test_main{
	public static void main(String[] args) {
		PhoneInfo f1 = new PhoneInfo("Jcak", "1234-5678", "2000-01-01");
		PhoneInfo f2 = new PhoneInfo("Jcak", "1234-5678");
		PhoneInfo f3 = new PhoneInfo("Jcak");
		
		f1.call();
		f2.call();
		f3.call();
		
	}
}

