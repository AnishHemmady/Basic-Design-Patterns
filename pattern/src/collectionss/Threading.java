package collectionss;

import java.util.Scanner;

public class Threading implements Runnable {
	public void run(){
		System.out.println("Its running");
	}
	public static void main(String[] args ) throws ReflectiveOperationException, IllegalAccessException{
		Scanner sc=new Scanner(System.in);
		int inp=sc.nextInt();
		if (inp==1){
			
			Class <Threading> nc=Threading.class;
			Threading th=nc.newInstance();
			Thread t1=new Thread(th);
			t1.start();
			
			
		}
		System.gc();
		sc.close();
		
	}

}
