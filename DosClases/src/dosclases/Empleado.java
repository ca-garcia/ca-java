/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosclases;

/**
 *
 * @author Laboratorio
 */
public class Empleado {
    
 
  private int Code;
  private String Name;
  private float Salary;
  
  public void SetCode(int c)  		{Code = c;}
  public void SetName(String n) 	{Name = n;}
  public void SetSalary(float s)	{Salary = s;}
  
  public int getCode()			{return Code;}
  public String getName()		{return Name;}
  public float getSalary()		{return Salary;}
  
  public float Calc_HRA()		{return (10 * Salary / 100);}
  public float Calc_CA()		{return (5 * Salary / 100);}
  public float Calc_PF()		{return (8 * Salary / 100);}
  public float Calc_GrossSalary() 	{return Salary + Calc_HRA() + Calc_CA();}
  public float Calc_NetSalary() 	{return Calc_GrossSalary() - Calc_PF();}
  
 
  public void displayAll()
  {
        System.out.println("HRA: " + Calc_HRA());
	System.out.println("CA: " +Calc_CA());
	System.out.println("PF: " + Calc_PF());
	System.out.println("Net Salary: " + Calc_NetSalary());
  }
  
}//empleado

//class EmployeeDemo
//{
//  public static void main(String a[])
//  {
//    Empleado employee = new Empleado(); 
//	employee.SetCode(Integer.parseInt(a[0]));
//	employee.SetName(a[1]);
//	employee.SetSalary(Float.parseFloat(a[2]));
//	employee.displayAll();
//  }
//  
//  
//}

    

