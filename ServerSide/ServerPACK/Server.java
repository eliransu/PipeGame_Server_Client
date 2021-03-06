/*
 * Created by Eliran Suisa & Eliran Hasin 17_02_18
 */
package ServerPACK;

import java.io.IOException;

import CliectHandlerPACK.ClientHandler;

public interface Server {
	public void start(ClientHandler clientHandler); 
	void stop();
	void runServer() throws IOException;
}
