package GarbageCollection;

public class GCDemo {
	
	int objID;
	
	GCDemo(int objID){
		this.objID = objID;
		System.out.println(this+" : Created for the object ID"+this.objID);
	}

	public static void main(String[] args) {
      
		for (int i = 0; i < 500000; i++) {
			new GCDemo(i);	
		}
	}

   // Finalize method : Called by the garbage collector on an object when
   // garbage collection determines that there are no more references to the object.
   //the Object finalize method performs no actions but it may be overridden by any class.
   @Override
   public void finalize(){
	   System.out.println(this+" : Finalized for the object ID"+this.objID);
   }
	

}
