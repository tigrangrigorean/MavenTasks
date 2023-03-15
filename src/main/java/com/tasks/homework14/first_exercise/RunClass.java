package com.tasks.homework14.first_exercise;

public class RunClass extends StateClass{

	/**
	 * @Print values of TrafficLight
	 */
	@Override
	public void changeState() {
		
		TrafficLight[] arr = TrafficLight.values();
		
		for(int i = 0; i< arr.length; i++) {
			System.out.println(arr[i].name());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}



}
