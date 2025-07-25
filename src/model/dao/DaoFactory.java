package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDaoJDBC createSallerDao() {
		return new SellerDaoJDBC();
	}
}
