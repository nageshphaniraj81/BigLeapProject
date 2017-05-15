package GarbageCollection;

public class RequestingGCExplicitly {

	int objID;
	
	RequestingGCExplicitly(int objID){
		this.objID = objID;
		System.out.println(this+" : Created for the object ID"+this.objID);
	}

	public static void main(String[] args) {
      
		new GCDemo(1);	
		new GCDemo(2);	
		for (int i = 0; i < 100; i++) {
			System.gc();	
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
