/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

/**
 *
 * @author LENOVO
 */
public class TestMainThread {
    
	public static void main(String [] args)
	{
		Thread th=Thread.currentThread();
                System.out.println("Thread details:"+th);
		th.setName("sachin-thread");
		System.out.println("After name change:"+th); 
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println(th.getName()+" interrupted!");
		}
		System.out.println(th.getName()+" finished!");
	}
}
