package check;
import constants.Constants;

public class Check {

	private static String firstName = "豊田";
	private static String lastName = "健悟";

	private String printName(String FirstName, String LastName) {
//
//		System.out.println( FirstName + LastName);
		return FirstName + LastName;
	}


	public static void  main(String[] args) {

		Check checkins = new Check();
		String NAME = checkins.printName(checkins.firstName, checkins.lastName);
		System.out.println("printNameメソッド → " + NAME);

		//Petクラスインスタンス作成
		 Pet petInstance = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);

		 //RobotPetクラスインスタンス作成
		 RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);

		 // petInstanceよりメソッド呼び出し
		 petInstance.introduce();

		 //robotPetよりメソッド呼び出し
		 robotPet.introduce();

	}

}
