package foo.bar.client;

import foo.bar.commons.Speaker;

public class Main {
	public static void main(String[] args) {
		Speaker speaker = new Speaker();
		System.out.println(speaker.say());
	}
}
