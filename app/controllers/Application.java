package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    
    public static Result ebook() {
        return ok(ebook.render("Your new application is ready."));
    }
    
    public static Result blog_list() {
    	return ok(blog_list.render("Your new application is ready."));
    }
    
    public static Result blog_post() {
    	return ok(blog_post.render("Your new application is ready."));
    }
    
    public static Result share_code() {
    	return ok(share_code.render("Your new application is ready."));
    }
    
    public static Result ask() {
    	return ok(ask.render("Your new application is ready."));
    }
    
    public static Result team() {
    	return ok(team.render("Your new application is ready."));
    }
    
    public static Result product() {
    	return ok(product.render("Your new application is ready."));
    }
    
    public static Result contact() {
    	return ok(contact.render("Your new application is ready."));
    }
  
}
