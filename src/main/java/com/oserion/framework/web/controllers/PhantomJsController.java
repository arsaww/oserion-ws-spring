package com.oserion.framework.web.controllers;

import com.oserion.framework.web.beans.HtmlFormConfig;
import com.oserion.framework.web.beans.JavaScriptVariable;
import com.oserion.framework.web.exceptions.InternalErrorException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Created by Arsaww on 12/5/2015.
 * Main controller for all expected Rest Services response
 */
@RestController
@RequestMapping("/create-pdf/from-phantomjs")
public class PhantomJsController extends MainController {

    private static final Logger LOG = Logger.getLogger(PhantomJsController.class.getName());

    @RequestMapping(value = "/by-javascript-injection", method = RequestMethod.POST)
    public Object setContent(@RequestBody HtmlFormConfig body,
                             HttpServletRequest req, HttpServletResponse resp) throws InternalErrorException {

       /* LOG.info("I AM HERE");
        JavaScriptVariable result = new JavaScriptVariable();
        result.setKey("hello");
        result.setValue("world");
        ArrayList<JavaScriptVariable> a = new ArrayList<>();
        a.add(result);
        result = new JavaScriptVariable();
        result.setKey("hello");
        result.setValue("world");
        a.add(result);
        body.setVariables(a);*/
        return body;
    }

}
