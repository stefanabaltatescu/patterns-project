
public class Car implements State{
	
	  private State carState;
	  private String company; // required
	  private String model; // required
	  
	  public Car(CarBuilder builder) {
		    this.company = builder.company;
		    this.model = builder.model;
		  }
	  
	  public void setState(State state) {
			this.carState=state;
		}
	  
	  public State getState() {
			return this.carState;
		}
	  
	  @Override
		public void doAction() {
			this.carState.doAction();
		}
	  
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	
	public void setCopmany(String company) {
		this.company = company;
	}
	public void setMOdel(String model) {
		this.model = model;
	}
	
	 public static class CarBuilder {
		    private  String company;
		    private  String model;

		    public CarBuilder() {
		    }

		    public CarBuilder company(String company) {
		      this.company = company;
		      return this;
		    }
		    
		    public CarBuilder model(String company) {
			      this.model = model;
			      return this;
			    }


		    public Car build() {
		      return new Car(this);
		    }

		  }

}
