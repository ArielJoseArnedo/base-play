package co.com.ajac.infrastructure.interfaces.controllers;

import co.com.ajac.BuildInfo;
import play.mvc.Controller;
import play.mvc.Result;


public class VersionController extends Controller {

    public Result version() {
        return ok(BuildInfo.toJson());
    }
}
