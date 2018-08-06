
public class DollarCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Q D N P");
		System.out.println("-------");
		
		CoinPurse p = new CoinPurse(4,0,0,0);
		while (p.getPennies() != 100)
		{
			System.out.println(p);
			DollarComboUtils.nextPurse(p);
		}
		System.out.println(p);
	}

}
