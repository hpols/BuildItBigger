package com.udacity.gradle.builditbigger.backend;

import com.example.android.javalib.Joker;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** Add the joke to the Api */
    @ApiMethod(name = "setJoke")
    public MyBean setJoke(MyBean jokeBean) {
        jokeBean = new MyBean();
        Joker joker = new Joker();
        jokeBean.setData(joker.getJoke());

        return jokeBean;
    }

}
