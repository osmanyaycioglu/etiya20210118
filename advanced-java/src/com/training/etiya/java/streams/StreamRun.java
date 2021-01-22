package com.training.etiya.java.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRun {

    public static class InnerData {

        public InnerData(final Integer inParam,
                         final String strParam) {
            super();
            this.in = inParam;
            this.str = strParam;
        }

        public InnerData() {
        }

        Integer in;
        String  str;
    }

    public static void main(final String[] args) {
        List<String> asListLoc = Arrays.asList("1",
                                               "1",
                                               "2",
                                               "10",
                                               "11",
                                               "12",
                                               "15",
                                               "16",
                                               "17",
                                               "100",
                                               "15",
                                               "20",
                                               "1",
                                               "100",
                                               "20",
                                               "21",
                                               "13",
                                               "14");
        Stream<String> streamLoc = asListLoc.stream();
        streamLoc.sorted()
                 .distinct()
                 .parallel()
                 .filter(t -> t.length() == 2)
                 .map(y -> Integer.parseInt(y))
                 .map(y -> {
                     InnerData innerDataLoc = new InnerData();
                     innerDataLoc.in = y;
                     innerDataLoc.str = "str" + y;
                     System.out.println("Thread : "
                                        + Thread.currentThread()
                                                .getName());
                     return innerDataLoc;
                 })
                 .skip(2)
                 .limit(2)
                 .forEach(c -> System.out.println((c.in + 100)));

        List<InnerData> collectLoc = asListLoc.stream()
                                              .sorted()
                                              .distinct()
                                              .parallel()
                                              .filter(t -> t.length() == 2)
                                              .map(y -> Integer.parseInt(y))
                                              .map(y -> new InnerData(y,
                                                                      "str" + y))
                                              .skip(2)
                                              .limit(2)
                                              .collect(Collectors.toList());

        Map<String, InnerData> collect2Loc = asListLoc.stream()
                                                      .sorted()
                                                      .distinct()
                                                      .parallel()
                                                      .filter(t -> t.length() == 2)
                                                      .map(y -> Integer.parseInt(y))
                                                      .map(y -> new InnerData(y,
                                                                              "str" + y))
                                                      .skip(2)
                                                      .limit(2)
                                                      .collect(Collectors.toMap(k -> k.str,
                                                                                i -> i));

        asListLoc.stream()
                 .sorted()
                 .distinct()
                 .filter(t -> t.length() == 2)
                 .map(y -> Integer.parseInt(y))
                 .map(y -> new InnerData(y,
                                         "str" + y))
                 .skip(2)
                 .limit(2)
                 .anyMatch(h -> h.str.length() == 2);

        asListLoc.stream()
                 .sorted()
                 .distinct()
                 .filter(t -> t.length() == 2)
                 .map(y -> Integer.parseInt(y))
                 .map(y -> new InnerData(y,
                                         "str" + y))
                 .skip(2)
                 .limit(2)
                 .allMatch(h -> h.str.length() == 2);

        Integer reduceLoc = asListLoc.stream()
                                     .sorted()
                                     .distinct()
                                     .filter(t -> t.length() == 2)
                                     .map(y -> Integer.parseInt(y))
                                     .map(y -> new InnerData(y,
                                                             "str" + y))
                                     .skip(2)
                                     .limit(2)
                                     .reduce(new Integer(0),
                                             (a,
                                              x) -> a + x.in,
                                             (r,
                                              t) -> r + t);
        System.out.println(reduceLoc);

        IntSummaryStatistics summaryStatisticsLoc = asListLoc.stream()
                                                             .sorted()
                                                             .distinct()
                                                             .filter(t -> t.length() == 2)
                                                             .map(y -> Integer.parseInt(y))
                                                             .map(y -> new InnerData(y,
                                                                                     "str" + y))
                                                             .mapToInt(o -> o.in)

                                                             .skip(2)
                                                             .limit(2)
                                                             .summaryStatistics();
        System.out.println(summaryStatisticsLoc);
    }
}
