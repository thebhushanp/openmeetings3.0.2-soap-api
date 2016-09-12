## Generate Soap client using ``wsdl2java``of [Apache cxf](http://cxf.apache.org/download.html).

  1. Copy the content of {om-host}:{port}/openmeetings/services/UserService?wsdl to some file.
If you are using linux, then do ``curl http://localhost:5080/openmeetings/services/UserService?wsdl > /tmp/userservice.wsdl``
  2. Download binary distrubution of Apache cxf and extract it.
  3. Go to bin directory.
  4. Execute ``./wsdl2java -p the.bhushan.service.user -d /tmp /tmp/userservice.wsdl``
(-p name of package, -d output directory)
  5. If above command executed successfully, then you should be able to see the Java classes in /tmp/the/bhushan/service/user directory.
  6. Repeat step 1 to 5 for other services too,
   - ``{om-host}:{port}/openmeetings/services/RoomService?wsdl``
