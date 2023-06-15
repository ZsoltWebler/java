package org.webler.zsolt.cinema;

public interface ISeat {


    String getRow();

    int getColumn();

    boolean isReserved();

    String getSeatNumber();
}
