package lin.client.tcp;

import lin.client.tcp.annotation.Command;
import lin.client.tcp.annotation.RespType;

@Command(1)
@RespType(DetectRespPackage.class)
public class DetectPackage extends CommandRequestPackage {

	@Override
	public void parse(byte[] bs,int offset) {
	}

	public DetectPackage()
	{
	}

}
