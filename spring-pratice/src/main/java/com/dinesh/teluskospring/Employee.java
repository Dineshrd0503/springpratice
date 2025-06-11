package com.dinesh.teluskospring;

public class Employee {
    private int sal;
    private Laptop laptop;
    private Computer com;
   

    public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void useLaptop() {
        if (laptop != null) {
            laptop.compile();
        } else {
            System.out.println("No laptop assigned to employee");
        }
    }
    
    public void usecom() {
    	System.out.println("chosing the class whcih is implaneted in xml file");
    	com.compile();
    }
}