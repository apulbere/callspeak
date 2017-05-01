package callspeak.model;

public class CallPeak {
	private int max;
	private int start;
	private int end;
	
	public CallPeak(int max, int start, int end) {
		this.max = max;
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "CallPeak [max=" + max + ", start=" + start + ", end=" + end + "]";
	}

		
}
