package jetPetStore;

public class MainClass 
{
  public static void main(String[] args) throws Exception
  {
	  OpenJPetStore obj = new OpenJPetStore();
	  obj.OpenUrl();
	  
	  Signup s = new Signup();
	  s.SignupHere();
	  
	  Signin si = new Signin();
	  si.login();
	  
	  AddToCart cart = new AddToCart();
	  cart.AddtoCart();
	  
	  CheckOut buy = new CheckOut();
	  buy.Buynow();
	  
	  ConfirmToBuy con = new ConfirmToBuy();
	  con.Confirm();
  }
}
