package callspeak.model;

public class Interval {
	private int start;
	private int end;
	
	public Interval(String rawData) {
		String[] arr = rawData.split(":");
		start = Integer.valueOf(arr[0]);
		end = Integer.valueOf(arr[1]);
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}

}
