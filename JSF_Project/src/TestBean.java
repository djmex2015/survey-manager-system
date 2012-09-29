import javax.ejb.EJB;


import com.test.EjbPackage.HelloWorldBean;


//@ManagedBean(name="message")
//@SessionScoped
public class TestBean {

	@EJB
	private HelloWorldBean hello;

	public final HelloWorldBean getHello() {
		return hello;
	}

	public final void setHello(final HelloWorldBean hello) {
		this.hello = hello;
	}
	
	public final String getMess()
	{
		return hello.getMessage();
	}
	
}