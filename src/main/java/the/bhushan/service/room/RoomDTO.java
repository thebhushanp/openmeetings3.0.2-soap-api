
package the.bhushan.service.room;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roomDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roomDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://webservice.openmeetings.apache.org/}type" minOccurs="0"/&gt;
 *         &lt;element name="numberOfPartizipants" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="appointment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="confno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPublic" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="demo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="demoTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="redirectUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moderated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowUserQuestions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="waitForRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="audioOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="topBarHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="chatHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="activitiesHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filesExplorerHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="actionsMenuHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="screenSharingHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="whiteboardHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomDTO", propOrder = {
    "id",
    "name",
    "comment",
    "type",
    "numberOfPartizipants",
    "appointment",
    "confno",
    "isPublic",
    "demo",
    "closed",
    "demoTime",
    "externalId",
    "externalType",
    "redirectUrl",
    "moderated",
    "allowUserQuestions",
    "allowRecording",
    "waitForRecording",
    "audioOnly",
    "topBarHidden",
    "chatHidden",
    "activitiesHidden",
    "filesExplorerHidden",
    "actionsMenuHidden",
    "screenSharingHidden",
    "whiteboardHidden"
})
public class RoomDTO {

    protected Long id;
    protected String name;
    protected String comment;
    @XmlSchemaType(name = "string")
    protected Type type;
    protected Long numberOfPartizipants;
    protected boolean appointment;
    protected String confno;
    protected boolean isPublic;
    protected boolean demo;
    protected boolean closed;
    protected Integer demoTime;
    protected String externalId;
    protected String externalType;
    protected String redirectUrl;
    protected boolean moderated;
    protected boolean allowUserQuestions;
    protected boolean allowRecording;
    protected boolean waitForRecording;
    protected boolean audioOnly;
    protected boolean topBarHidden;
    protected boolean chatHidden;
    protected boolean activitiesHidden;
    protected boolean filesExplorerHidden;
    protected boolean actionsMenuHidden;
    protected boolean screenSharingHidden;
    protected boolean whiteboardHidden;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the numberOfPartizipants property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfPartizipants() {
        return numberOfPartizipants;
    }

    /**
     * Sets the value of the numberOfPartizipants property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfPartizipants(Long value) {
        this.numberOfPartizipants = value;
    }

    /**
     * Gets the value of the appointment property.
     * 
     */
    public boolean isAppointment() {
        return appointment;
    }

    /**
     * Sets the value of the appointment property.
     * 
     */
    public void setAppointment(boolean value) {
        this.appointment = value;
    }

    /**
     * Gets the value of the confno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfno() {
        return confno;
    }

    /**
     * Sets the value of the confno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfno(String value) {
        this.confno = value;
    }

    /**
     * Gets the value of the isPublic property.
     * 
     */
    public boolean isIsPublic() {
        return isPublic;
    }

    /**
     * Sets the value of the isPublic property.
     * 
     */
    public void setIsPublic(boolean value) {
        this.isPublic = value;
    }

    /**
     * Gets the value of the demo property.
     * 
     */
    public boolean isDemo() {
        return demo;
    }

    /**
     * Sets the value of the demo property.
     * 
     */
    public void setDemo(boolean value) {
        this.demo = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     */
    public void setClosed(boolean value) {
        this.closed = value;
    }

    /**
     * Gets the value of the demoTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDemoTime() {
        return demoTime;
    }

    /**
     * Sets the value of the demoTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDemoTime(Integer value) {
        this.demoTime = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the externalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalType() {
        return externalType;
    }

    /**
     * Sets the value of the externalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalType(String value) {
        this.externalType = value;
    }

    /**
     * Gets the value of the redirectUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Sets the value of the redirectUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
    }

    /**
     * Gets the value of the moderated property.
     * 
     */
    public boolean isModerated() {
        return moderated;
    }

    /**
     * Sets the value of the moderated property.
     * 
     */
    public void setModerated(boolean value) {
        this.moderated = value;
    }

    /**
     * Gets the value of the allowUserQuestions property.
     * 
     */
    public boolean isAllowUserQuestions() {
        return allowUserQuestions;
    }

    /**
     * Sets the value of the allowUserQuestions property.
     * 
     */
    public void setAllowUserQuestions(boolean value) {
        this.allowUserQuestions = value;
    }

    /**
     * Gets the value of the allowRecording property.
     * 
     */
    public boolean isAllowRecording() {
        return allowRecording;
    }

    /**
     * Sets the value of the allowRecording property.
     * 
     */
    public void setAllowRecording(boolean value) {
        this.allowRecording = value;
    }

    /**
     * Gets the value of the waitForRecording property.
     * 
     */
    public boolean isWaitForRecording() {
        return waitForRecording;
    }

    /**
     * Sets the value of the waitForRecording property.
     * 
     */
    public void setWaitForRecording(boolean value) {
        this.waitForRecording = value;
    }

    /**
     * Gets the value of the audioOnly property.
     * 
     */
    public boolean isAudioOnly() {
        return audioOnly;
    }

    /**
     * Sets the value of the audioOnly property.
     * 
     */
    public void setAudioOnly(boolean value) {
        this.audioOnly = value;
    }

    /**
     * Gets the value of the topBarHidden property.
     * 
     */
    public boolean isTopBarHidden() {
        return topBarHidden;
    }

    /**
     * Sets the value of the topBarHidden property.
     * 
     */
    public void setTopBarHidden(boolean value) {
        this.topBarHidden = value;
    }

    /**
     * Gets the value of the chatHidden property.
     * 
     */
    public boolean isChatHidden() {
        return chatHidden;
    }

    /**
     * Sets the value of the chatHidden property.
     * 
     */
    public void setChatHidden(boolean value) {
        this.chatHidden = value;
    }

    /**
     * Gets the value of the activitiesHidden property.
     * 
     */
    public boolean isActivitiesHidden() {
        return activitiesHidden;
    }

    /**
     * Sets the value of the activitiesHidden property.
     * 
     */
    public void setActivitiesHidden(boolean value) {
        this.activitiesHidden = value;
    }

    /**
     * Gets the value of the filesExplorerHidden property.
     * 
     */
    public boolean isFilesExplorerHidden() {
        return filesExplorerHidden;
    }

    /**
     * Sets the value of the filesExplorerHidden property.
     * 
     */
    public void setFilesExplorerHidden(boolean value) {
        this.filesExplorerHidden = value;
    }

    /**
     * Gets the value of the actionsMenuHidden property.
     * 
     */
    public boolean isActionsMenuHidden() {
        return actionsMenuHidden;
    }

    /**
     * Sets the value of the actionsMenuHidden property.
     * 
     */
    public void setActionsMenuHidden(boolean value) {
        this.actionsMenuHidden = value;
    }

    /**
     * Gets the value of the screenSharingHidden property.
     * 
     */
    public boolean isScreenSharingHidden() {
        return screenSharingHidden;
    }

    /**
     * Sets the value of the screenSharingHidden property.
     * 
     */
    public void setScreenSharingHidden(boolean value) {
        this.screenSharingHidden = value;
    }

    /**
     * Gets the value of the whiteboardHidden property.
     * 
     */
    public boolean isWhiteboardHidden() {
        return whiteboardHidden;
    }

    /**
     * Sets the value of the whiteboardHidden property.
     * 
     */
    public void setWhiteboardHidden(boolean value) {
        this.whiteboardHidden = value;
    }

}
