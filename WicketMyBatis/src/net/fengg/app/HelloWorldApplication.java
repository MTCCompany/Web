package net.fengg.app;

import net.fengg.pages.MainPage;

import org.apache.wicket.protocol.http.WebApplication;

public class HelloWorldApplication extends WebApplication {
    public HelloWorldApplication() {
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    public Class<MainPage> getHomePage() {
        return MainPage.class;
    }
}