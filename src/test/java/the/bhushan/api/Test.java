package the.bhushan.api;

import the.bhushan.service.room.RoomDTO;
import the.bhushan.service.room.ServiceException_Exception;
import the.bhushan.service.user.ExternalUserDTO;

public class Test {
	public static void main(String[] args) throws ServiceException_Exception,
			the.bhushan.service.user.ServiceException_Exception,
			the.bhushan.service.record.ServiceException_Exception {
		// Do login
		Login login = new Login();
		String sid = login.doLogin("bhushan", "bhushan");

		// create room

		RoomCreator rCreator = new RoomCreator();
		RoomDTO rDTO = rCreator.createRoom(sid);
		System.out.println("RoomID=" + rDTO.getId());

		// generate hash for the newly created room
		UserHashCreator userHash = new UserHashCreator();
		ExternalUserDTO exUser = new ExternalUserDTO();
		exUser.setFirstname("Sopya");
		exUser.setLastname("Choudhary");
		exUser.setExternalId("abc");
		exUser.setExternalType("my-type");
		String uHash = userHash.addUserAndGenHash(sid, exUser, rDTO);
		System.out.println(uHash);

		// generate the hash for recording
		
		// RecordingFetcher rf = new RecordingFetcher();
		// Long id = rf.getRecordings(sid, 401L).get(0).getId();
		// RecordingHashCreator rHasher = new RecordingHashCreator();
		// String recordHash = rHasher.getRecordingHash(sid, id);
		// System.out.println(recordHash);

		// http://localhost:5080/openmeetings/recording/recordHash
	}
}
