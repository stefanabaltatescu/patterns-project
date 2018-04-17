package api;

public abstract class Observer {

	protected ISubject subject;
	public Observer(Subject subject){
	      this.subject = subject;
	   }
	 public abstract void update();
}
