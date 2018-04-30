enum UserStatus{
	PENDING("P") , ACTIVE("A") , INACTIVE("I") , DELETED("D") ; // COMPILER CREATES INSTANCE FOR ALL THESE ENUM CONSTANTS
	private String statusCode ;
	private UserStatus(String s){
		statusCode = s ;
	}
	public String getStatusCode(){
		return statusCode ;
 	}

}

class TestConstructor{
	public static void main(String[] args) {
		System.out.println(UserStatus.ACTIVE.getStatusCode()) ;
	}
}