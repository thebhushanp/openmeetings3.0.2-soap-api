package the.bhushan.api;

import java.util.List;

import the.bhushan.service.record.RecordingDTO;
import the.bhushan.service.record.RecordingService;
import the.bhushan.service.record.RecordingWebService;
import the.bhushan.service.record.ServiceException_Exception;

public class RecordingFetcher {

	public List<RecordingDTO> getRecordings(String sid, Long roomID)
			throws ServiceException_Exception {
		RecordingService rService = new RecordingService();
		RecordingWebService rwebService = rService.getRecordingWebServicePort();
		List<RecordingDTO> recordings = rwebService
				.getExternalByRoom(sid, roomID);
		return recordings;
	}

}
