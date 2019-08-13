package com.zensar.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

@Path("/fileuploads")
public class FileUploadService {
@POST
@Path("/upload")
@Produces("text/html")
@Consumes(MediaType.MULTIPART_FORM_DATA)
public Response uploadfile(@FormDataParam("myfile")InputStream)
}
