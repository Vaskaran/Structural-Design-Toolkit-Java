package proxy.common;

public class NetworkService implements Service {
	private final NetworkType networkType;

	public NetworkService(NetworkType networkType) {
		this.networkType = networkType;
	}

	@Override
	public void connect(String url) throws AccessDeniedException {
			System.out.println("A " + networkType.name().toLowerCase() + " user is trying to connect: " + url);			
	}
}
