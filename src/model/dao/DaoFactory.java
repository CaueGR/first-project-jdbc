package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImlJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoImlJDBC(DB.getConnection());
	}
}
