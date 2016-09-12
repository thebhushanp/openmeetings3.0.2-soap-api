# openmeetings3.0.2-soap-api
I have seen my people struggling to integrate OpenMeetings in their application, so I thought, lets write HOW-TO do that. I am going to generate Soap client using wsdl2java of Apache cxf.

  - Copy the content of {om-host}:{port}/openmeetings/services/UserService?wsdl to some file.
If you are using linux, then do curl http://localhost:5080/openmeetings/services/UserService?wsdl > /tmp/userservice.wsdl
  - Download binary distrubution of Apache cxf and extract it.
  - Go to bin directory.
  - Execute ./wsdl2java -p the.bhushan.service.user -d /tmp /tmp/userservice.wsdl
-p name of package
-d output directory
 - If above command executed successfully, then you should be able to see the Java classes in /tmp/the/bhushan/service/user directory.
 - Repeat step 1 to 5 for other services too,
   - {om-host}:{port}/openmeetings/services/RoomService?wsdl
