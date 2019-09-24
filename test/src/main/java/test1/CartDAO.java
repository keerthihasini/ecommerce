package test1;



import sample.test.Cart;

public interface CartDAO {
	boolean addCart(Cart p);
	boolean deleteCart(Cart p);
	Cart findCart(int id);
	Cart updateCart(Cart p);
	public java.util.List<Cart> getAllCarts(String cartid);
	int totalelements(String cartid);
	

}
