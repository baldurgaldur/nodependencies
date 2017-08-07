package com.jarvis.server.rest.action;

import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("window")
public class WindowAction
{
  static Logger logger = Logger.getLogger(WindowAction.class);

  @GET
  public Response getWindow()
  {
    logger.info("window GET received");
    return Response.ok(0).build();
  }

  @POST
  @Path("up")
  public Response moveUp()
  {
    logger.info("window POST up received");
    return Response.ok().build();
  }

  @POST
  @Path("down")
  public Response moveDown()
  {
    logger.info("window POST down received");
    return Response.ok().build();
  }
}
