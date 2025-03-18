package com.luccasaps.workshopjavafxjdbc.model.dao;

import com.luccasaps.workshopjavafxjdbc.db.DB;
import com.luccasaps.workshopjavafxjdbc.model.dao.impl.DepartmentDaoJDBC ;
import com.luccasaps.workshopjavafxjdbc.model.dao.impl.SellerDaoJDBC ;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
