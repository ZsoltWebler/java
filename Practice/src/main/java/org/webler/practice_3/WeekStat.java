package org.webler.practice_3;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

public class WeekStat {


    private final int year;
    private final int week;
    private final LocalDate date;
    private final int numberOfWinner;
    private final long prize;
    private final Set<Integer> numbers;

    public WeekStat(int year, int week, LocalDate date, int numberOfWinner, long prize, Set<Integer> numbers) {
        this.year = year;
        this.week = week;
        this.date = date;
        this.numberOfWinner = numberOfWinner;
        this.prize = prize;
        this.numbers = numbers;
    }

    public int getYear() {
        return year;
    }

    public int getWeek() {
        return week;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNumberOfWinner() {
        return numberOfWinner;
    }

    public long getPrize() {
        return prize;
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeekStat weekStat = (WeekStat) o;
        return year == weekStat.year && week == weekStat.week && numberOfWinner == weekStat.numberOfWinner && prize == weekStat.prize && Objects.equals(date, weekStat.date) && Objects.equals(numbers, weekStat.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, week, date, numberOfWinner, prize, numbers);
    }
}
