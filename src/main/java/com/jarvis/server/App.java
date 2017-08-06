package com.jarvis.server;

import com.jarvis.server.rest.service.RequestHandler;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;

public class App
{
  static Logger logger = Logger.getLogger(App.class);

  public static void main( String[] args ) throws Exception
  {
    BasicConfigurator.configure();

    logger.info("Starting server");
    Server server = new Server(8080);
    server.setHandler(new RequestHandler());

    server.start();
    server.join();
    logger.info("Server started");
  }
}
