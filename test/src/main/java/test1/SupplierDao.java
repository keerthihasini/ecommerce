package test1;

import sample.test.Supplier;

public interface SupplierDao {
	public boolean addSupplier(Supplier p);
	public boolean deleteSupplier(Supplier p);
	public boolean  updateSupplier(Supplier p);
	Supplier findSupplier(int id);
   java.util.List<Supplier>getAllSuppliers();

}
