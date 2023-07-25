package org.webler.practice_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class LottoStatistic {

    List<WeekStat> weeklyLottoStatistics;


    public LottoStatistic() throws FileNotFoundException {
        this.weeklyLottoStatistics = readLottoStatistics(readLottoStatistics());
    }

    private List<String> readLottoStatistics() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("W:\\Webler\\JuniorJava\\Git\\java\\Practice\\src\\main\\resources\\practice_3\\otos.csv"));
        List<String> weekData = new ArrayList<>();

        while (scanner.hasNextLine()) {
            weekData.add(scanner.nextLine());
        }

        return weekData;

    }

    private List<WeekStat> readLottoStatistics(List<String> weeks) {
        List<WeekStat> weekStats = new ArrayList<>();
        for (String week : weeks) {

            String[] split = week.split(";");

            int year = Integer.parseInt(split[0].replace("\uFEFF", ""));
            int week_ = Integer.parseInt(split[1]);

            LocalDate date;
            if (!split[2].isBlank()) {
                List<Integer> dates = Arrays.stream(split[2].split("\\.")).map(Integer::parseInt).toList();
                date = LocalDate.of(dates.get(0), dates.get(1), dates.get(2));
            } else {
                date = LocalDate.of(2004, 1, 1);
            }

            int numberOfWinner = Integer.parseInt(split[3]);
            long prize = Long.parseLong(split[4].replace(" Ft", "").replace(" ", ""));
            var numbers = List.of(split[11], split[12], split[13], split[14], split[15]).stream().map(Integer::parseInt).collect(Collectors.toSet());

            WeekStat weekStat = new WeekStat(year, week_, date, numberOfWinner, prize, numbers);

            weekStats.add(weekStat);

        }
        return weekStats;

    }


    public int mostFrequentNumber() {

        HashMap<Integer, Integer> numbers = numberStatistics();

        int mostFrequent = Integer.MIN_VALUE;
        int mostFrequentKey = Integer.MIN_VALUE;
        for (Integer key : numbers.keySet()) {

            if (numbers.get(key) > mostFrequent) {
                mostFrequent = numbers.get(key);
                mostFrequentKey = key;
            }

        }


        return mostFrequentKey;
    }

    public int leastFrequentNumber() {
        HashMap<Integer, Integer> numbers = numberStatistics();

        int leastFrequent = Integer.MAX_VALUE;
        int leastFrequentKey = Integer.MAX_VALUE;
        for (Integer key : numbers.keySet()) {

            if (numbers.get(key) < leastFrequent) {
                leastFrequent = numbers.get(key);
                leastFrequentKey = key;
            }

        }


        return leastFrequentKey;
    }

    public void highestPrize() {

        long highestPrice = Long.MIN_VALUE;
        WeekStat winner = null;

        for (WeekStat weekStat : weeklyLottoStatistics) {

            if (weekStat.getPrize() > highestPrice) {
                highestPrice = weekStat.getPrize();
                winner = weekStat;
            }

        }

        System.out.println("Legnagyobb nyeremény: " + highestPrice + " - " + winner.getDate());


    }

    public int myNumbers(Set<Integer> myNumbers) {

        int winCount = 0;
        for (WeekStat weekStat : weeklyLottoStatistics) {

            if (weekStat.getNumbers().equals(myNumbers)) {
                winCount++;
            }

        }

        return winCount;


    }

    public Set<Integer> getNumbers(int year, int week) {
        return null;
    }

    public HashMap<Integer, Integer> numberStatistics() {

        HashMap<Integer, Integer> numberStats = new HashMap<>();

        for (WeekStat weekStat : weeklyLottoStatistics) {

            weekStat.getNumbers().forEach(

                    integer -> {
                        Integer value = numberStats.getOrDefault(integer, 0);
                        numberStats.put(integer, ++value);

                    }

            );

        }

        return numberStats;

    }

    class Period {

        private final int longestPeriodInWeek;
        private final LocalDate startDate;
        private final LocalDate endDate;

        public Period(int longestPeriodInWeek, LocalDate startDate, LocalDate endDate) {
            this.longestPeriodInWeek = longestPeriodInWeek;
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public int getLongestPeriodInWeek() {
            return longestPeriodInWeek;
        }

        public LocalDate getStartDate() {
            return startDate;
        }

        public LocalDate getEndDate() {
            return endDate;
        }
    }

    public void longestPeriodWithoutWinning() {

        List<Period> periods = new ArrayList<>();

        int longestPeriodInWeek = 0;
        LocalDate startDate = null;
        LocalDate endDate = null;


        for (WeekStat weekStat : weeklyLottoStatistics) {

            if (weekStat.getNumberOfWinner() < 1) {

                if (startDate == null) {
                    startDate = weekStat.getDate();
                }
                longestPeriodInWeek++;


            } else {
                if (longestPeriodInWeek > 0) {
                    endDate = weekStat.getDate();

                    periods.add(new Period(longestPeriodInWeek, startDate, endDate));

                }

                longestPeriodInWeek = 0;
                startDate = null;
                endDate = null;


            }
        }

        OptionalInt max = periods.stream().mapToInt(Period::getLongestPeriodInWeek).max();
        System.out.println(max.getAsInt());
    }

}
