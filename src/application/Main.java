package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== Test 1: Seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== Test 2: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellerList = DaoFactory.createSellerDao().findByDepartment(department);
        for (Seller obj : sellerList) {
            System.out.println(obj);
        }

        System.out.println("=== Test 3: Seller findAll ===");
        List<Seller> sellerList1 = DaoFactory.createSellerDao().findAll();
        for (Seller obj : sellerList1) {
            System.out.println(obj);
        }

        System.out.println("=== Test 4: Seller insert ===");
        Seller newSeller = new Seller(0, "Greg", "greg@gmail.com", new Date(), 4000, department);
        DaoFactory.createSellerDao().insert(newSeller);
        System.out.println("Inserted: new id = " + newSeller.getId());
    }
}