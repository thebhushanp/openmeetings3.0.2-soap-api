
package the.bhushan.service.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roomOptionsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roomOptionsDTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roomId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="recordingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="moderator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showAudioVideoTest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showNickNameDialog" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowSameURLMultipleTimes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="allowRecording" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomOptionsDTO", propOrder = {
    "roomId",
    "recordingId",
    "moderator",
    "showAudioVideoTest",
    "showNickNameDialog",
    "allowSameURLMultipleTimes",
    "allowRecording"
})
public class RoomOptionsDTO {

    protected Long roomId;
    protected Long recordingId;
    protected boolean moderator;
    protected boolean showAudioVideoTest;
    protected boolean showNickNameDialog;
    protected boolean allowSameURLMultipleTimes;
    protected boolean allowRecording;

    /**
     * Gets the value of the roomId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRoomId(Long value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the recordingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecordingId() {
        return recordingId;
    }

    /**
     * Sets the value of the recordingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecordingId(Long value) {
        this.recordingId = value;
    }

    /**
     * Gets the value of the moderator property.
     * 
     */
    public boolean isModerator() {
        return moderator;
    }

    /**
     * Sets the value of the moderator property.
     * 
     */
    public void setModerator(boolean value) {
        this.moderator = value;
    }

    /**
     * Gets the value of the showAudioVideoTest property.
     * 
     */
    public boolean isShowAudioVideoTest() {
        return showAudioVideoTest;
    }

    /**
     * Sets the value of the showAudioVideoTest property.
     * 
     */
    public void setShowAudioVideoTest(boolean value) {
        this.showAudioVideoTest = value;
    }

    /**
     * Gets the value of the showNickNameDialog property.
     * 
     */
    public boolean isShowNickNameDialog() {
        return showNickNameDialog;
    }

    /**
     * Sets the value of the showNickNameDialog property.
     * 
     */
    public void setShowNickNameDialog(boolean value) {
        this.showNickNameDialog = value;
    }

    /**
     * Gets the value of the allowSameURLMultipleTimes property.
     * 
     */
    public boolean isAllowSameURLMultipleTimes() {
        return allowSameURLMultipleTimes;
    }

    /**
     * Sets the value of the allowSameURLMultipleTimes property.
     * 
     */
    public void setAllowSameURLMultipleTimes(boolean value) {
        this.allowSameURLMultipleTimes = value;
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

}
