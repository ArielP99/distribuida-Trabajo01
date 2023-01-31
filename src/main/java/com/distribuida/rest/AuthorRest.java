package com.distribuida.rest;
import com.distribuida.db.Author;
import com.distribuida.repository.AuthorRepository;
import com.distribuida.servicios.AuthorService;
import com.oracle.svm.core.annotate.Inject;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorRest {
    @Inject
    AuthorService authorService;
    @GET
    public List<Author> list() {
        return authorService.findAllAuthors();
    }
    @GET
    @Path("/{id}")
    public Author get(@PathParam("id") Long id) {
        return authorService.findById(id);
    }
    @POST
    @Transactional
    public Response createAuthor(Author author) {
        authorService.createAuthor(author);
        return Response.status(Response.Status.CREATED).build();
    }
    @DELETE
    @Transactional
    @Path("/{id}")
    public Response deleteAuthor(@PathParam("id") Long id){
        authorService.deleteAuthor(id);
        return Response.status(Response.Status.OK).build();
    }
    @PUT
    @Transactional
    @Path("/{id}")
     public Response updateAuthor(@PathParam("id") Long id, Author author) throws Exception {
        authorService.updateAuthor(id, author);
        return Response.status((Response.Status.OK)).build();
    }
}
