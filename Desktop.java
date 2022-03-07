package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("This is a desktopSize - Desktop");

	}
	
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();

	}
}
