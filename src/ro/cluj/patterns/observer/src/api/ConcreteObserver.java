package api;

public class ConcreteObserver extends Observer {

		   public ConcreteObserver(Subject subject){
		      this.subject = subject;
		      this.subject.set(this);
		   }

		   @Override
		   public void update() {
		      System.out.println( "Observer: " + subject.getState() ); 
		   }
		}
}
