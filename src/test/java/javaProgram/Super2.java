package javaProgram;

public class Super2 extends Super1{
	void display() {
        System.out.println("Display from Parent");
    }

	Super2(){
		super(); //call super1 constructor
		System.out.println("Super2 constructor");

	}
}
