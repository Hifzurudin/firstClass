package org.practice;

public class SampleProgramme {
	
	private void integer() {
		byte series = 90;
		short arc = 3056;
		int episodes = 13468952;
		long hours = 1458632786945L;
		System.out.println("Series stored = "+series+
				"\nTotal arc = "+arc+
				"\nNo of episodes = "+episodes+
				"\nRunning Time = "+hours+" Hours");
	}
	private void boo() {
		boolean sign = true;
		System.out.println("Criteria's matched = "+sign);
	}
	private void character() {
		char certificate = 'U';
		System.out.println("Rated = "+certificate);
	}
	private void floatingPoint() {
		float averagerating = 8.5f;
		double averagehours = 108295.93771995;
		System.out.println("Average rating = "+averagerating+
				"\nAverage Hours = "+averagehours);
	}
	private void string() {
		String folder = "Hifzur";
		System.out.println("Stored Folder = "+folder);
	}
	public static void main(String[] args) {
		SampleProgramme sampleProgramme = new SampleProgramme();
		sampleProgramme.string();
		sampleProgramme.integer();
		sampleProgramme.floatingPoint();
		sampleProgramme.character();
		sampleProgramme.boo();
		System.out.println("*****");
	}
	

}
