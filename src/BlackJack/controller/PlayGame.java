package BlackJack.controller;

import BlackJack.view.IView;
import BlackJack.model.Game;

public class PlayGame {

	public boolean Play(Game a_game, IView a_view) {
		a_view.DisplayWelcomeMessage();

		a_view.DisplayDealerHand(a_game.GetDealerHand(), a_game.GetDealerScore());
		a_view.DisplayPlayerHand(a_game.GetPlayerHand(), a_game.GetPlayerScore());

		if (a_game.IsGameOver()) {
			a_view.DisplayGameOver(a_game.playerWinsOnEqualWithDealer());
		}

		int input = a_view.GetInput();

		if (input == 'p') {
			a_game.NewGame();
		} else if (input == 'h') {
			try { // Added to make delay before displaying each hit results from the player
				Thread.sleep(2000);
			} catch (Exception e) {
			}

			a_game.Hit();
		} else if (input == 's') {
			a_game.Stand();
		}

		return input != 'q';
	}
}