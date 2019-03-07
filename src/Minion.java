
public class Minion {
	
	private String name; 
		private int eyes; 
		private String color; 
		private String master;
		
		
		
		Minion(String name, int eyes,String color, String master){
			this.name=name;
			this.eyes=eyes;
			this.color=color;
			this.master=master;
		}
		
		String getName() {
			return this.name;
			
		}
		int getEyes() {
			return this.eyes;
		}
		String getColor() {
			return this.color;
		}
		String getMaster() {
			return this.master;
			
		}
		void setMaster(String  Master) {
			this.master= Master;
		}
		void setName(String Name) {
			this.name=Name;
			
		}
		void setEyes(int Eyes) {
			this.eyes = Eyes;
		
		}
		void setColor(String Color) {
			this.color=Color;
		}
		}


