public class Arrays{

	public static void main(String[] args) {

		players = new String [4];

		players[0] = "Michelle";
		players[1] = "Kevin";
		players[2] = "Marvin";
		players[3] = "Sean";

		//String [] players = {"Michelle", "Kevin", "Marvin", "Sean"}

		int totalPlayers = players.length;

		String theWinner = players[1];
		System.out.println("Congratulations, " + theWinner + "!");


	}

}
