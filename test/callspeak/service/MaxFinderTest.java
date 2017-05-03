package callspeak.service;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import callspeak.model.CallPeak;
import callspeak.model.Interval;

public class MaxFinderTest {
	private MaxFinder maxFinder;
	
	@Before
	public void setUp() {
		maxFinder = new MaxFinder();
	}
	
	@Test
	public void test() {
		List<Interval> intervals = asList(
				new Interval("1:2"),
				new Interval("2:3"),
				new Interval("2:5")
		);
		
		assertThat(maxFinder.find(intervals), is(new CallPeak(3, 2, 2)));
	}
	
	@Test
	public void test1() {
		List<Interval> intervals = asList(
				new Interval("1:9"),
				new Interval("2:9"),
				new Interval("3:8"),
				new Interval("4:7"),
				new Interval("5:6")
		);
		
		assertThat(maxFinder.find(intervals), is(new CallPeak(5, 5, 6)));
	}
	
	@Test
	public void test2() {
		List<Interval> intervals = asList(
				new Interval("1:2"),
				new Interval("2:3"),
				new Interval("3:4")
		);
		
		assertThat(maxFinder.find(intervals), is(new CallPeak(2, 2, 2)));
	}
	
	@Test
	public void test3() {
		List<Interval> intervals = asList(
				new Interval("1:2"),
				new Interval("2:3"),
				new Interval("3:4"),
				new Interval("2:6")
		);
		
		assertThat(maxFinder.find(intervals), is(new CallPeak(3, 2, 3)));
	}
}
