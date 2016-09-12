package the.bhushan.api;

import the.bhushan.service.room.RoomDTO;
import the.bhushan.service.room.RoomServiceStub;
import the.bhushan.service.room.ServiceException_Exception;
import the.bhushan.service.room.Type;

public class RoomCreator {

	public RoomDTO createRoom(String sid) throws ServiceException_Exception {
		RoomServiceStub roomService = new RoomServiceStub();
		RoomDTO roomDTO = new RoomDTO();
		roomDTO.setChatHidden(true);
		roomDTO.setName("M-III");
		roomDTO.setType(Type.CONFERENCE);
		roomDTO.setAllowRecording(true);
		RoomDTO newRDTO = roomService.getRoomWebServicePort().add(sid, roomDTO);
		return newRDTO;
	}
}
