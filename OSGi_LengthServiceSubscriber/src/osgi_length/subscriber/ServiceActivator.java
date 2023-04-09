package osgi_length.subscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.length.publisher.ServicePublish;

public class ServiceActivator implements BundleActivator {


	private ServiceReference LenghtConvertserviceReference;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Subscriber Service Start");
		LenghtConvertserviceReference = context.getServiceReference(ServicePublish.class.getName());
		ServicePublish service = (ServicePublish) context.getService(LenghtConvertserviceReference);	
		service.lengthConverter();
		
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Subscriber Service Stop!!! Good Bye");
		context.ungetService(LenghtConvertserviceReference);
		
	}

}
