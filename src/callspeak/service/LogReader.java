package callspeak.service;

import static java.util.Collections.emptyList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import callspeak.model.Interval;

public class LogReader {
	public List<Interval> getLogs(String filePath) {
		List<Interval> list = emptyList();
		try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
		    list = lines.map(Interval::new).collect(Collectors.toList());
		} catch (IOException e) {
		    //log exception
		}
		return list;
	}

}
