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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + end;
		result = prime * result + max;
		result = prime * result + start;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CallPeak other = (CallPeak) obj;
		if (end != other.end)
			return false;
		if (max != other.max)
			return false;
		if (start != other.start)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "CallPeak [max=" + max + ", start=" + start + ", end=" + end + "]";
	}
}
