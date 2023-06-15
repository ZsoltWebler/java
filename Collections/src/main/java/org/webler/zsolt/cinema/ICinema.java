package org.webler.zsolt.cinema;

import java.util.Set;

public interface ICinema {

    String getName();

    int getNumberOfRows();

    int getNumberOfColumns();

    Set<ISeat> getSeats();

    void printSeatMap();

    Set<ISeat> getReservedSeats();

    ISeat bookSeat(int row, int column);

}
