package the.bhushan.api;

import the.bhushan.service.user.ExternalUserDTO;
import the.bhushan.service.user.RoomOptionsDTO;
import the.bhushan.service.user.ServiceException_Exception;
import the.bhushan.service.user.UserWebService;

public class RecordingHashCreator {

	public String getRecordingHash(String sid, Long recId)
			throws ServiceException_Exception {
		UserWebService userWS = new UserWebService();
		ExternalUserDTO exUser = new ExternalUserDTO();
		exUser.setFirstname("Sopya");
		exUser.setLastname("Choudhary");
		exUser.setExternalId("abc");
		exUser.setExternalType("my-type");
		RoomOptionsDTO roomOts = new RoomOptionsDTO();
		roomOts.setRecordingId(recId);
		// roomOts.setRoomId(null);
		String hash = userWS.getUserService().getRoomHash(sid, exUser, roomOts)
				.getMessage();
		return hash;
	}

}
