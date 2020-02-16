package com.mcroly.designpattern.facade;

public class Subsystem {

		public void config() {
			System.out.println("Config...");
		}
		
		public void loadScript() {
			System.out.println("Load Script...");
		}
		
		public void checkScript() {
			System.out.println("Check Script...");
		}
		
		public void loginUser() {
			System.out.println("Login User ...");
		}
		
		public void checkUser() {
			System.out.println("Wellcome User!");
		}
		
		public void logoutUser() {
			System.out.println("Logount User...");
		}
		
		public void unloadScript() {
			System.out.println("UnloadScript...");
		}
		
		public void resetConfig() {
			System.out.println("Reset Config ...");
		}
		
}
