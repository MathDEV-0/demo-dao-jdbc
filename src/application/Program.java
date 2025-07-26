package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
				
		SellerDao sellerDao = DaoFactory.createSallerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2,"Eletronics");
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller s: list) {
			System.out.println(s);
		}
		
		System.out.println("=== TEST 3: seller findAll ===");
		List<Seller> list2 = sellerDao.findAll();
		
		for(Seller s: list2) {
			System.out.println(s);
		}

		System.out.println("=== TEST 4: seller insert ===");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com",new Date(),1900.0,department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id:  " + newSeller.getId());
		
	}

}
