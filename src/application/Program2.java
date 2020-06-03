package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: seller findBy ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		System.out.println();
		
		System.out.println("=== TEST 4: department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		System.out.println();
		
		System.out.println("=== TEST 5: department update ===");
		Department departmen = departmentDao.findById(6);
		departmen.setName("Developer");
		departmentDao.update(departmen);
		System.out.println("Update completed");
		System.out.println();
		
		System.out.println("=== TEST 6: department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();

	}

}
