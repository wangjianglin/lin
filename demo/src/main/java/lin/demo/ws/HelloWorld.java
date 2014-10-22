package lin.demo.ws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/heloworld")
@Produces({ MediaType.APPLICATION_JSON})
public interface HelloWorld {
	@GET
//	@Produces(MediaType.TEXT_PLAIN)
	@Path("/say/{name}")
	public String say(@PathParam("name") String name);
	
	@GET
//	@Produces(MediaType.TEXT_PLAIN)
	@Path("/say1")
	public String say2();
	
	@GET
//	@Produces(MediaType.TEXT_PLAIN)
	@Path("/get")
	public User get();

	@GET
//	@Produces(MediaType.TEXT_PLAIN)
	@Path("/sayHello/{name}")
	public String sayHello(@PathParam("user") User user);

	@GET
//	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Path("/getList/{id}")
	public List<User> getList(@PathParam("id") Long id);

}