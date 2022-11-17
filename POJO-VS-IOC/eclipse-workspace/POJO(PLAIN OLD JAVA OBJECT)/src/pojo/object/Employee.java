package pojo.object;

public class Employee {
           private  String ename;
           private Address address;
           private int eid;
           Employee(){
        	   System.out.println("---default one----");
           }
           
           Employee(String name,int eid){
        	   this.eid=eid;
        	   this.ename=name;
        	  
           }
           //Constructor Injection
           Employee(Address address){
        	   this.address=address;
           }

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public Address getAddress() {
			return address;
		}
        //Setter Injection
		public void setAddress(Address address) {
			this.address=address;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}
      
		@Override
		public String toString() {
			return "Employee [ename=" + ename + ", address=" + address + ", eid=" + eid + "]";
		}
		public void init() {
			System.out.println("---object initialized---");
		}
     public void destroy() {
    	 System.out.println("---- object destroyed ----");
     }
}
