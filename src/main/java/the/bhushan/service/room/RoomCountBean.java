
package the.bhushan.service.room;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roomCountBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roomCountBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxUser" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="roomCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="roomId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="roomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roomCountBean", propOrder = {
    "maxUser",
    "roomCount",
    "roomId",
    "roomName"
})
public class RoomCountBean {

    protected long maxUser;
    protected int roomCount;
    protected Long roomId;
    protected String roomName;

    /**
     * Gets the value of the maxUser property.
     * 
     */
    public long getMaxUser() {
        return maxUser;
    }

    /**
     * Sets the value of the maxUser property.
     * 
     */
    public void setMaxUser(long value) {
        this.maxUser = value;
    }

    /**
     * Gets the value of the roomCount property.
     * 
     */
    public int getRoomCount() {
        return roomCount;
    }

    /**
     * Sets the value of the roomCount property.
     * 
     */
    public void setRoomCount(int value) {
        this.roomCount = value;
    }

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
     * Gets the value of the roomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets the value of the roomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomName(String value) {
        this.roomName = value;
    }

}
