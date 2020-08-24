#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.server;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import ${package}.shared.SettingsResponse;
import ${package}.shared.SettingsService;

public class SettingsServiceImpl extends RemoteServiceServlet implements SettingsService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${symbol_dollar}{app.myVar}")
    private String myVar;

    @Override
    public void init() throws ServletException {
         super.init();
         SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, getServletContext());
    }
    
    @Override
    public SettingsResponse settingsServer() throws IllegalArgumentException, IOException {
        HashMap<String,Object> settings = new HashMap<String,Object>();        
        settings.put("MY_VAR", myVar);
        SettingsResponse response = new SettingsResponse();
        response.setSettings(settings);
        return response;
    }
}
