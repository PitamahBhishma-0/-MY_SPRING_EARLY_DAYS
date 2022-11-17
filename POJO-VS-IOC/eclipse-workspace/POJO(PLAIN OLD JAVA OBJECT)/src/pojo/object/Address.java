package pojo.object;

public class Address {
        private String city;
        private String state;
        private int zipcode;
         Address(){
        	 
         }
         Address(String city,String state,int zip){
        	 this.city=city;
        	 this.state=state;
        	 this.zipcode=zip;
         }
         
         
         public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getZipcode() {
			return zipcode;
		}
		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}
		public String toString() {
        	 return "city ="+city+" State ="+state+" zip ="+zipcode;
         }
         
}
