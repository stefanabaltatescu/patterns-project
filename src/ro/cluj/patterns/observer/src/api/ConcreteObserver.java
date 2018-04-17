package api;

public class ConcreteObserver extends Observer {

		public ConcreteObserver(ISubject subject) {
			super(subject);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void update() {
			System.out.println( "Observer: " + subject.getState() ); 
		}
}

