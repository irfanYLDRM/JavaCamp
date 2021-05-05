package Abstract;

import Entities.Game;
import Entities.Gamer;

public abstract class BaseSaleManager implements SaleService {
	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName() + " isimli oyun " + gamer.getNationalId() + " T.C. Kimlik Numaral� " +
							gamer.getFirstName() + " " + gamer.getLastName() + " taraf�ndan " +
							game.getPrice() + "-TL fiyat�yla sat�n al�nd�.");
		
	}
}
