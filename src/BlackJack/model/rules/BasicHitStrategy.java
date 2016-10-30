package BlackJack.model.rules;

import BlackJack.model.Player;


public class BasicHitStrategy implements IHitStrategy {

	private final int g_hitLimit = 17;

	@Override
	public boolean DoHit(Player a_dealer) {

		if( a_dealer.CalcScore() == g_hitLimit){

			return a_dealer.CalcScore() == g_hitLimit;


		}

		return a_dealer.CalcScore() < g_hitLimit;
	}

}
