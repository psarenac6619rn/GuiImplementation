package action;

public class ActionManager {

	private static ActionManager instance;
	
	private DatabaseFilter dbf;
	private AddAction addaction;
	private RemoveAction removeaction;
	
	
	
	
	
	private ActionManager() {
		init();
	}
	
	private void init() {
		
		dbf = new DatabaseFilter();
		addaction= new AddAction();
		removeaction = new RemoveAction();
	}
	
	
	
	
	
	public static ActionManager getInstance() {
		if(instance == null) 
			instance = new ActionManager();
		return instance;
	}

	public DatabaseFilter getDbf() {
		return dbf;
	}

	public void setDbf(DatabaseFilter dbf) {
		this.dbf = dbf;
	}

	public AddAction getAddaction() {
		return addaction;
	}

	public void setAddaction(AddAction addaction) {
		this.addaction = addaction;
	}

	public RemoveAction getRemoveaction() {
		return removeaction;
	}

	public void setRemoveaction(RemoveAction removeaction) {
		this.removeaction = removeaction;
	}

	
}
