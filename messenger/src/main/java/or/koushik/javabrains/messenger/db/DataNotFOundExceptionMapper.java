package or.koushik.javabrains.messenger.db;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import or.koushik.javabrains.messenger.exception.DataNotFoundException;
import or.koushik.javabrains.messenger.model.ErrorMessage;

@Provider
public class DataNotFOundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException ex) {
		ErrorMessage errormessage = new ErrorMessage(ex.getMessage(), 404, "http://avabrains.koushik.org");
		
		return Response.status(Status.NOT_FOUND).entity(errormessage).build();
	}

}
