/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

 
public class Le01
{
    String name;
    int age;
    
    void setAge(int age){
        this.age=age;
    }
    void setName(String name){
        this.name=name;
    }
    int getAge(int age){
        return this.age;
    }
    String getAge(String name){
        return this.name;
    }

	public static void main(String[] args) {
		Le01 ob=new Le01();
		ob.setName("haa");
		ob.setAge(18);
		
		System.out.println(ob.name);
		System.out.println(ob.age);
	}
}
