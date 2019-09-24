package test1;

import sample.test.Payment;

public interface PaymentDao {
	boolean addPayment(Payment p);
	boolean deletePayment(Payment p);
	Payment findPayment(int id);
	Payment updatePayment(Payment p);
	public java.util.List<Payment>getAllPayment(String cartid);

}

