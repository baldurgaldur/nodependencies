package com.jarvis.server;

import com.jarvis.server.rest.action.WindowAction;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class App
{
  static Logger logger = Logger.getLogger(App.class);

  public static void main( String[] args ) throws Exception
  {
    BasicConfigurator.configure();

    logger.info("Starting server");

    //Port is configured in the Procfile
    URI baseUri = UriBuilder.fromUri("http://localhost/").build();
    ResourceConfig config = new ResourceConfig(WindowAction.class);
    Server server = JettyHttpContainerFactory.createServer(baseUri, config);

    //Server server = new Server(8080);
    //server.setHandler(new RequestHandler());

    server.start();
    server.join();
    logger.info("Server started");
  }
}
