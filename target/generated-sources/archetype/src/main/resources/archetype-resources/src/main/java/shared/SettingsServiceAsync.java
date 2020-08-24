#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SettingsServiceAsync {
    void settingsServer(AsyncCallback<SettingsResponse> callback)
            throws IllegalArgumentException;
}
