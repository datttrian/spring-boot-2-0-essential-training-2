package com.frankmoley.lil.sbet.landon.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.frankmoley.lil.sbet.landon.roomwebapp.models.Room;

@Service
public class RoomService {

    public List<Room> getAllRooms() {
        return rooms;
    }
}