package callspeak;

import callspeak.service.LogReader;
import callspeak.service.MaxFinder;

public class Main {
	public static void main(String[] args) {
		System.out.println(new MaxFinder()
				.find(new LogReader().getLogs("D:/logs/log2.txt")));
	}
}
