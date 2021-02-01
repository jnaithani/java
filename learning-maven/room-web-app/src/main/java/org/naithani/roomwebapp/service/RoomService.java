package org.naithani.roomwebapp.service;

import java.util.List;

import org.naithani.roomwebapp.data.RoomRepository;
import org.naithani.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }
}