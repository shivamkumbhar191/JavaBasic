package oops;

public class Movie {
	 int movieId;
	 String movieName;
	 int tiketPrice;
	 int tiketNumber;
	 int totalCost;
	 int availableTiket;
	 int totalTiket;
	 
	 public void acceptDetails(int movieId,String movieName,int ticketPrice,int ticketNumber,int totalTicket, int totalTiket) {
		 this.movieId=movieId;
		 this.movieName=movieName;
		 this.tiketPrice=ticketPrice;
		 this.tiketNumber=ticketNumber;
		 this.totalTiket=totalTiket;
	 }
	 public void ticketCostAvailability() {
		 totalCost=tiketNumber*tiketPrice;
		 availableTiket=totalTiket-tiketNumber;
		 
	 }
	 public void displayDetails() {
		 if(availableTiket<4) {
			 System.out.println("not available");
		 }
		 else {
			 System.out.println(movieId+" "+movieName+" "+tiketPrice+" "+tiketNumber+" "+totalCost+" "+availableTiket);
		 }
	 }
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie mv=new Movie();
		mv.acceptDetails(7249, "Avatar2", 400, 4, 10, 20);
		mv.ticketCostAvailability();
		mv.displayDetails();

	}

}
