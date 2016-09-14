package the.bhushan.api;

import the.bhushan.service.room.RoomDTO;
import the.bhushan.service.user.ExternalUserDTO;
import the.bhushan.service.user.RoomOptionsDTO;
import the.bhushan.service.user.ServiceException_Exception;
import the.bhushan.service.user.ServiceResult;
import the.bhushan.service.user.UserWebService;

public class UserHashCreator {

	public String addUserAndGenHash(String sid, ExternalUserDTO exUser,
			RoomDTO newRDTO) throws ServiceException_Exception {

		RoomOptionsDTO roomOps = new RoomOptionsDTO();
		roomOps.setRoomId(newRDTO.getId());
		roomOps.setAllowRecording(true);
		roomOps.setRecordingId(newRDTO.getId());
		UserWebService ws = new UserWebService();
		// get hash of the room
		ServiceResult res = ws.getUserService().getRoomHash(sid, exUser,
				roomOps);
		return res.getMessage();
	}
}
