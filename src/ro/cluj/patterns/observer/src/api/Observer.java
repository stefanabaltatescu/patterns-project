package api;

public abstract class Observer {

	protected ISubject subject;
	public Observer(ISubject subject){
	      this.subject = subject;
	   }
	 public abstract void update();
}
