package org.vibhu.messenger;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customer")
public class CustomerResource {

	@POST
	@Path("/add")
	public Response addCustomer(
		@FormParam("name") String name,
		@FormParam("age") int age) {
        CustomerService.addCustomer(name, age);
		return Response.status(200)
			.entity("addUser is called, name : " + name + ", age : " + age)
			.build();

	}
	@GET
	@Produces({MediaType.TEXT_HTML, MediaType.APPLICATION_JSON})
    public List<Customer> getCustomer() {
        return CustomerService.getAllCustomers();
    }

}