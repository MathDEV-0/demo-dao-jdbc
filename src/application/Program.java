package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Department dp = new Department(1,"Books");
		System.out.println(dp);
		
		Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(),3000.0,dp);
		
		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSallerDao();
		
	}

}
