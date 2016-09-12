
package the.bhushan.service.record;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the the.bhushan.service.record package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Delete_QNAME = new QName("http://webservice.openmeetings.apache.org/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "deleteResponse");
    private final static QName _GetExternal_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternal");
    private final static QName _GetExternalByRoom_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternalByRoom");
    private final static QName _GetExternalByRoomResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternalByRoomResponse");
    private final static QName _GetExternalByType_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternalByType");
    private final static QName _GetExternalByTypeResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternalByTypeResponse");
    private final static QName _GetExternalResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternalResponse");
    private final static QName _RecordingDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "recordingDTO");
    private final static QName _ServiceException_QNAME = new QName("http://webservice.openmeetings.apache.org/", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: the.bhushan.service.record
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link GetExternal }
     * 
     */
    public GetExternal createGetExternal() {
        return new GetExternal();
    }

    /**
     * Create an instance of {@link GetExternalByRoom }
     * 
     */
    public GetExternalByRoom createGetExternalByRoom() {
        return new GetExternalByRoom();
    }

    /**
     * Create an instance of {@link GetExternalByRoomResponse }
     * 
     */
    public GetExternalByRoomResponse createGetExternalByRoomResponse() {
        return new GetExternalByRoomResponse();
    }

    /**
     * Create an instance of {@link GetExternalByType }
     * 
     */
    public GetExternalByType createGetExternalByType() {
        return new GetExternalByType();
    }

    /**
     * Create an instance of {@link GetExternalByTypeResponse }
     * 
     */
    public GetExternalByTypeResponse createGetExternalByTypeResponse() {
        return new GetExternalByTypeResponse();
    }

    /**
     * Create an instance of {@link GetExternalResponse }
     * 
     */
    public GetExternalResponse createGetExternalResponse() {
        return new GetExternalResponse();
    }

    /**
     * Create an instance of {@link RecordingDTO }
     * 
     */
    public RecordingDTO createRecordingDTO() {
        return new RecordingDTO();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getExternal")
    public JAXBElement<GetExternal> createGetExternal(GetExternal value) {
        return new JAXBElement<GetExternal>(_GetExternal_QNAME, GetExternal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalByRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getExternalByRoom")
    public JAXBElement<GetExternalByRoom> createGetExternalByRoom(GetExternalByRoom value) {
        return new JAXBElement<GetExternalByRoom>(_GetExternalByRoom_QNAME, GetExternalByRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalByRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getExternalByRoomResponse")
    public JAXBElement<GetExternalByRoomResponse> createGetExternalByRoomResponse(GetExternalByRoomResponse value) {
        return new JAXBElement<GetExternalByRoomResponse>(_GetExternalByRoomResponse_QNAME, GetExternalByRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalByType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getExternalByType")
    public JAXBElement<GetExternalByType> createGetExternalByType(GetExternalByType value) {
        return new JAXBElement<GetExternalByType>(_GetExternalByType_QNAME, GetExternalByType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalByTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getExternalByTypeResponse")
    public JAXBElement<GetExternalByTypeResponse> createGetExternalByTypeResponse(GetExternalByTypeResponse value) {
        return new JAXBElement<GetExternalByTypeResponse>(_GetExternalByTypeResponse_QNAME, GetExternalByTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getExternalResponse")
    public JAXBElement<GetExternalResponse> createGetExternalResponse(GetExternalResponse value) {
        return new JAXBElement<GetExternalResponse>(_GetExternalResponse_QNAME, GetExternalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordingDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "recordingDTO")
    public JAXBElement<RecordingDTO> createRecordingDTO(RecordingDTO value) {
        return new JAXBElement<RecordingDTO>(_RecordingDTO_QNAME, RecordingDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

}
