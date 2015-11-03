
package controllers;

import play.mvc.With;

/**
 *
 * @author rodrigo
 */
@Check("admin")
@With(Secure.class)
public class Posts extends CRUD{
    
}
