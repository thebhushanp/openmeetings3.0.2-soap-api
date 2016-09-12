
package the.bhushan.service.room;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the the.bhushan.service.room package. 
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

    private final static QName _Add_QNAME = new QName("http://webservice.openmeetings.apache.org/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "addResponse");
    private final static QName _Close_QNAME = new QName("http://webservice.openmeetings.apache.org/", "close");
    private final static QName _CloseResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "closeResponse");
    private final static QName _Counters_QNAME = new QName("http://webservice.openmeetings.apache.org/", "counters");
    private final static QName _CountersResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "countersResponse");
    private final static QName _Delete_QNAME = new QName("http://webservice.openmeetings.apache.org/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "deleteResponse");
    private final static QName _GetExternal_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternal");
    private final static QName _GetExternalResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getExternalResponse");
    private final static QName _GetPublic_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getPublic");
    private final static QName _GetPublicResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getPublicResponse");
    private final static QName _GetRoomById_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getRoomById");
    private final static QName _GetRoomByIdResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "getRoomByIdResponse");
    private final static QName _Kick_QNAME = new QName("http://webservice.openmeetings.apache.org/", "kick");
    private final static QName _KickResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "kickResponse");
    private final static QName _Open_QNAME = new QName("http://webservice.openmeetings.apache.org/", "open");
    private final static QName _OpenResponse_QNAME = new QName("http://webservice.openmeetings.apache.org/", "openResponse");
    private final static QName _RoomDTO_QNAME = new QName("http://webservice.openmeetings.apache.org/", "roomDTO");
    private final static QName _ServiceResult_QNAME = new QName("http://webservice.openmeetings.apache.org/", "serviceResult");
    private final static QName _ServiceException_QNAME = new QName("http://webservice.openmeetings.apache.org/", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: the.bhushan.service.room
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Close }
     * 
     */
    public Close createClose() {
        return new Close();
    }

    /**
     * Create an instance of {@link CloseResponse }
     * 
     */
    public CloseResponse createCloseResponse() {
        return new CloseResponse();
    }

    /**
     * Create an instance of {@link Counters }
     * 
     */
    public Counters createCounters() {
        return new Counters();
    }

    /**
     * Create an instance of {@link CountersResponse }
     * 
     */
    public CountersResponse createCountersResponse() {
        return new CountersResponse();
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
     * Create an instance of {@link GetExternalResponse }
     * 
     */
    public GetExternalResponse createGetExternalResponse() {
        return new GetExternalResponse();
    }

    /**
     * Create an instance of {@link GetPublic }
     * 
     */
    public GetPublic createGetPublic() {
        return new GetPublic();
    }

    /**
     * Create an instance of {@link GetPublicResponse }
     * 
     */
    public GetPublicResponse createGetPublicResponse() {
        return new GetPublicResponse();
    }

    /**
     * Create an instance of {@link GetRoomById }
     * 
     */
    public GetRoomById createGetRoomById() {
        return new GetRoomById();
    }

    /**
     * Create an instance of {@link GetRoomByIdResponse }
     * 
     */
    public GetRoomByIdResponse createGetRoomByIdResponse() {
        return new GetRoomByIdResponse();
    }

    /**
     * Create an instance of {@link Kick }
     * 
     */
    public Kick createKick() {
        return new Kick();
    }

    /**
     * Create an instance of {@link KickResponse }
     * 
     */
    public KickResponse createKickResponse() {
        return new KickResponse();
    }

    /**
     * Create an instance of {@link Open }
     * 
     */
    public Open createOpen() {
        return new Open();
    }

    /**
     * Create an instance of {@link OpenResponse }
     * 
     */
    public OpenResponse createOpenResponse() {
        return new OpenResponse();
    }

    /**
     * Create an instance of {@link RoomDTO }
     * 
     */
    public RoomDTO createRoomDTO() {
        return new RoomDTO();
    }

    /**
     * Create an instance of {@link ServiceResult }
     * 
     */
    public ServiceResult createServiceResult() {
        return new ServiceResult();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link RoomCountBean }
     * 
     */
    public RoomCountBean createRoomCountBean() {
        return new RoomCountBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Close }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "close")
    public JAXBElement<Close> createClose(Close value) {
        return new JAXBElement<Close>(_Close_QNAME, Close.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "closeResponse")
    public JAXBElement<CloseResponse> createCloseResponse(CloseResponse value) {
        return new JAXBElement<CloseResponse>(_CloseResponse_QNAME, CloseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Counters }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "counters")
    public JAXBElement<Counters> createCounters(Counters value) {
        return new JAXBElement<Counters>(_Counters_QNAME, Counters.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "countersResponse")
    public JAXBElement<CountersResponse> createCountersResponse(CountersResponse value) {
        return new JAXBElement<CountersResponse>(_CountersResponse_QNAME, CountersResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetExternalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getExternalResponse")
    public JAXBElement<GetExternalResponse> createGetExternalResponse(GetExternalResponse value) {
        return new JAXBElement<GetExternalResponse>(_GetExternalResponse_QNAME, GetExternalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getPublic")
    public JAXBElement<GetPublic> createGetPublic(GetPublic value) {
        return new JAXBElement<GetPublic>(_GetPublic_QNAME, GetPublic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPublicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getPublicResponse")
    public JAXBElement<GetPublicResponse> createGetPublicResponse(GetPublicResponse value) {
        return new JAXBElement<GetPublicResponse>(_GetPublicResponse_QNAME, GetPublicResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getRoomById")
    public JAXBElement<GetRoomById> createGetRoomById(GetRoomById value) {
        return new JAXBElement<GetRoomById>(_GetRoomById_QNAME, GetRoomById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoomByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "getRoomByIdResponse")
    public JAXBElement<GetRoomByIdResponse> createGetRoomByIdResponse(GetRoomByIdResponse value) {
        return new JAXBElement<GetRoomByIdResponse>(_GetRoomByIdResponse_QNAME, GetRoomByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kick }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "kick")
    public JAXBElement<Kick> createKick(Kick value) {
        return new JAXBElement<Kick>(_Kick_QNAME, Kick.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KickResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "kickResponse")
    public JAXBElement<KickResponse> createKickResponse(KickResponse value) {
        return new JAXBElement<KickResponse>(_KickResponse_QNAME, KickResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Open }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "open")
    public JAXBElement<Open> createOpen(Open value) {
        return new JAXBElement<Open>(_Open_QNAME, Open.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "openResponse")
    public JAXBElement<OpenResponse> createOpenResponse(OpenResponse value) {
        return new JAXBElement<OpenResponse>(_OpenResponse_QNAME, OpenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "roomDTO")
    public JAXBElement<RoomDTO> createRoomDTO(RoomDTO value) {
        return new JAXBElement<RoomDTO>(_RoomDTO_QNAME, RoomDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.openmeetings.apache.org/", name = "serviceResult")
    public JAXBElement<ServiceResult> createServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_ServiceResult_QNAME, ServiceResult.class, null, value);
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
