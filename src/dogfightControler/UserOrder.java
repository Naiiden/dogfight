package dogfightControler;

public class UserOrder {

	private int player;
	public Order order;
	
	public UserOrder(int player, Order order){
		
		
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getPlayer() {
		return player;
	}


	public void setPlayer(int player) {
		this.player = player;
	}
	
}
