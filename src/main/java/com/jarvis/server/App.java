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

    logger.info("we're gonna use port: " + System.getenv("port"));
    URI baseUri = UriBuilder.fromUri("0.0.0.0").port(8080).build();
    ResourceConfig config = new ResourceConfig(WindowAction.class);
    Server server = JettyHttpContainerFactory.createServer(baseUri, config);

    server.start();
    server.join();
    logger.info("Server started");
  }
}
