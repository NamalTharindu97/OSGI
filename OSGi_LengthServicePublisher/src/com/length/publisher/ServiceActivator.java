package com.length.publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class ServiceActivator implements BundleActivator {

	ServiceRegistration lengthServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Publisher Start");
		ServicePublish publisherService = new ServicePublishImpl();
		
		lengthServiceRegistration = context.registerService(ServicePublish.class.getName(), publisherService, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Publisher stop");
		lengthServiceRegistration.unregister();
		
	}

}
