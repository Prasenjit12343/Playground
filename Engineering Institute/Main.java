//import required packages
import java.util.*;
class Faculty
{
  public int bsalary;
  public void setSalary(int salary)
  {
    this.bsalary = salary;
  }
  public void salary()
  {
    System.out.println("Base Salary: "+this.bsalary);
  }
}
class CSE extends Faculty
{
    int cseSalary;
  public void salary()
  {
    cseSalary = bsalary + 3000;
    System.out.println("CSE Faculty: "+cseSalary);
  }
}
class IT extends Faculty
{
  int itSalary;
  public void salary()
  {
    itSalary = bsalary + 5000;
    System.out.println("IT Faculty: "+itSalary);
  }
}
class ECE extends Faculty
{
  int eceSalary;
  public void salary()
  {
    eceSalary = bsalary + 4500;
    System.out.println("ECE Faculty: "+eceSalary);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    Faculty faculty = new Faculty();
    int s = scan.nextInt();
    faculty.setSalary(s);
    faculty.salary();
    CSE cse = new CSE();
    IT it = new IT();
    ECE ece = new ECE();
    cse.setSalary(s);
    it.setSalary(s);
    ece.setSalary(s);
    cse.salary();
    it.salary();
    ece.salary();
  }
}