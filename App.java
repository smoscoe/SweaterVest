
public class App {

	public static void main(String[] args) {
		// Static Variables
		float priceBananas = 5.08f;
		double priceBeans = 0.69;
		int walletMoney = 50;
		float walletChange = 10.50f;
		int friendsSocial = 25;
		int friendsIntrovert = 5;
		int ageYoung = 14;
		int ageOld = 65;
		String firstNameOne = "John";
		String firstNameTwo = "Charlie";
		String lastNameOne = "Smith";
		String lastNameTwo = "Coconut";
		char middleInitialOne = 'B';
		char middleInitialTwo = 'C';
		
		//Variables with operations below
		
		double walletLeftOvers = walletMoney - priceBeans;
		int friendsPerYear = (ageOld - ageYoung) / (friendsSocial - friendsIntrovert);
		String fullName = firstNameTwo + " " + middleInitialTwo + " " + lastNameTwo;
		
		//Print outs
		
		System.out.println("The Price of Bananas: " + priceBananas);
		System.out.println("The price for a can of Beans: "+ priceBeans);
		System.out.println("Average amount of money in " + firstNameTwo + "'s wallet as a kid: " + walletChange);
		System.out.println("Average cash in " + firstNameTwo + "'s wallet now: " + walletMoney);
		System.out.println("Number of friends " + firstNameTwo + " had as a child: " + friendsIntrovert);
		System.out.println("Number of friends " + firstNameTwo + " has as an adult: " + friendsSocial);
		System.out.println(firstNameTwo + "'s age when he began tracking the number of his friends: " + ageYoung);
		System.out.println(firstNameTwo + "'s best friend: " + firstNameOne + " " + middleInitialOne + " " + lastNameOne);
		System.out.println("Money left in " + firstNameTwo + "'s wallet after buying beans: " + walletLeftOvers);
		System.out.println(firstNameTwo + "'s average gain of friends per year: " + friendsPerYear);
		System.out.println(firstNameTwo + "'s full name: " + fullName);
	}

}
