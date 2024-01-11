package application;

import dao.DaoFactory;
import dao.DepartmentDao;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("=== Test 1: Seller findById ===");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);
//
//        System.out.println("=== Test 2: Seller findByDepartment ===");
//        Department department = new Department(2, null);
//        List<Seller> sellerList = sellerDao.findByDepartment(department);
//        for (Seller obj : sellerList) {
//            System.out.println(obj);
//        }
//
//        System.out.println("=== Test 3: Seller findAll ===");
//        List<Seller> sellerList1 = sellerDao.findAll();
//        for (Seller obj : sellerList1) {
//            System.out.println(obj);
//        }
//
//        System.out.println("=== Test 4: Seller insert ===");
//        Seller newSeller = new Seller(0, "Greg", "greg@gmail.com", new Date(), 4000, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted: new id = " + newSeller.getId());
//
//        System.out.println("=== Test 5: Seller Update ===");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Waine");
//        sellerDao.update(seller);
//        System.out.println("Update Completed!");
//
//        System.out.println("=== Test 6 : Seller Delete ===");
//        int idToDelete = 10;
//        sellerDao.deleteById(idToDelete);

//        System.out.println("=== Test 7: Department Insert ===");
//        Department department = new Department(0, "Gym");
//        departmentDao.insert(department);
//
//        System.out.println("=== Test 8: Department Update ===");
//        department = new Department(5, "Hair");
//        departmentDao.update(department);
//
//        System.out.println("=== Test 9: Department Delete ===");
//        int idToDelete = 7;
//        departmentDao.deleteById(idToDelete);
//

        System.out.println("=== Test 10: Department FindById ===");
        Department department = departmentDao.findById(3);
        System.out.println(department);


        System.out.println("=== Test 11: Department FindAll ===");
        List<Department> departmentList = departmentDao.findAll();
        departmentList.forEach(System.out::println);
    }
}