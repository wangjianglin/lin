package lin.demo.ws;

import javax.jws.WebService;

@WebService
public interface IWorldService {
	public String sayWorld(String username);
}
