package test_exam_2.java_database.controller;

import test_exam_2.java_database.repository.RoomRepository;
import test_exam_2.java_database.view.Hotel;

public class HotelController {


    public HotelController(){
        RoomRepository roomRepository = new RoomRepository();

        Hotel hotel = new Hotel(roomRepository);
        hotel.setVisible(true);
    }



}
