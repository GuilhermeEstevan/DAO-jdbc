package application;

import dao.DaoFactory;
import dao.SellerDao;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        System.out.println(department);

        Seller seller = new Seller(
                21,
                "Bob",
                "bob@gmail.com",
                new Date(),
                3000,
                department);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}