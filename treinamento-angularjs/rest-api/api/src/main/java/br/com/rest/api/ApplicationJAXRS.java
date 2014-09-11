package br.com.rest.api;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.jettison.JettisonFeature;

/**
 * The Class ApplicationJAXRS.
 */
public class ApplicationJAXRS extends Application {

	/** The Constant SERVICES_PACKAGES. */
	private static final String SERVICES_PACKAGES = "br.com.rest.api.services";

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.core.Application#getProperties()
	 */
	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		properties.put("jersey.config.server.provider.packages", SERVICES_PACKAGES);
		return properties;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.ws.rs.core.Application#getSingletons()
	 */
	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();
		singletons.add(new JettisonFeature());
		return singletons;
	}

}
