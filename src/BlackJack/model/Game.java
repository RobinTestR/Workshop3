package BlackJack.model;

public class Game {

  private Dealer m_dealer;
  private Player m_player;

  public Game()
  {
    m_dealer = new Dealer(new BlackJack.model.rules.RulesFactory());
    m_player = new Player();
  }


  public boolean IsGameOver()
  {
    return m_dealer.IsGameOver();
  }

  /*public boolean IsDealerWinner() Remove comments to make dealer win if dealer and player ends on the same score
  {
    return m_dealer.IsDealerWinner(m_player);
  }*/

  public boolean playerWinsOnEqualWithDealer(){ // Keep this if you want the player to win when dealer and player ends on same score
	  											// Player will also win if both dealer and player goes above 21
	  return m_dealer.playerWinsOnEqualWithDealer(m_player);

  }

  public boolean NewGame()
  {
    return m_dealer.NewGame(m_player);
  }

  public boolean Hit()
  {
    return m_dealer.Hit(m_player);
  }

  public boolean Stand()
  {
    // TODO: Implement this according to Game_Stand.sequencediagram
    return m_dealer.Stand();
  }

  public Iterable<Card> GetDealerHand()
  {
    return m_dealer.GetHand();
  }

  public Iterable<Card> GetPlayerHand()
  {
    return m_player.GetHand();
  }

  public int GetDealerScore()
  {
    return m_dealer.CalcScore();
  }

  public int GetPlayerScore()
  {
    return m_player.CalcScore();
  }




}