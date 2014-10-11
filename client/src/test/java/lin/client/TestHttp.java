package lin.client;

import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;

import lin.client.http.HttpCommunicate;

public class TestHttp {

	
	@org.junit.Test
	public void test() throws Exception{
		//HttpCommunicate.global.getClass();
		Socket socket = new Socket("192.168.1.18", 8080);
		java.io.PrintStream out = new PrintStream(socket.getOutputStream());
		//out.println("GET / HTTP/1.1");
		out.print("GET /web/ HTTP/1.1\r\n" +
				"Host: 192.168.1.18\r\n" +
				"User-Agent: Mozilla/5.0 (Windows NT 6.1; rv:15.0) Gecko/20100101 Firefox/15.0.1\r\n" +
				"Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" +
				"Accept-Language: zh-cn,zh;q=0.8,en-us;q=0.5,en;q=0.3\r\n" +
				"Accept-Encoding: gzip, deflate\r\n" +
				"Connection: keep-alive\r\n\r\n");
		out.flush();
		//out.close();
		InputStream in = socket.getInputStream();
		byte[] bs = new byte[1024];
		in.read(bs);
		
		System.out.println("s:"+new String(bs));
	}
}