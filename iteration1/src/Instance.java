import java.util.Date;

// Instance class for storing content and id of the given instance.
public class Instance {

	// The variables content, instanceID are created.
	String content;
	int instanceID;

	// No arg constructor.
	public Instance() {

	}

	// Instance object is defined with arguments.
	public Instance(String content, int instanceID) {
		this.content = content;
		this.instanceID = instanceID;
		
        // Print the created instance to the log file.
		Logger.getInstance().print(new Date(),
				"[Instance] INFO instance: created \"" + content + "\" with id: " + instanceID);
	}
	
	// Getter and setter methods for Instance class.
	public String getContent() {
		return this.content;
	}

	public int getInstanceID() {
		return this.instanceID;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setInstanceID(int instanceID) {
		this.instanceID = instanceID;
	}

}
