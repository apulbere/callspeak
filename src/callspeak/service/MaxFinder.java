package callspeak.service;

import static java.util.Arrays.sort;

import java.util.List;

import callspeak.model.CallPeak;
import callspeak.model.Interval;

public class MaxFinder {
	public CallPeak find(List<Interval> intervals) {
		int[] starts = new int[intervals.size()];
		int[] ends = new int[intervals.size()];

		int si = 0;
		for(Interval interval: intervals) {
			starts[si] = interval.getStart();
			ends[si] = interval.getEnd();
			si++;
		}

		sort(ends);

		int max = 1;
		int startTime = starts[0];
		int endTime = starts[0];
		int size = intervals.size();
		
		for(int i = 1, j = 0, calls = 1; i < size && j < size;){
			if (starts[i] <= ends[j]) {
				calls++;
				if (calls > max) {
					max = calls;
					startTime = starts[i];
				}
				endTime = ends[j];
				i++; 
			} else {
				calls--;
				j++;
			}
		}
		return new CallPeak(max, startTime, endTime);
	}
}
