package model;
import java.util.ArrayList;
public class Classroom {
	//Attributes
	private String name = "";
	//Relations
	private ArrayList<UserAccount>accounts;
	//Methods
	public Classroom(String pName) {
		name = pName;
		accounts = new ArrayList<UserAccount>();
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public UserAccount searchAccounts(String userName){
		UserAccount searchAccounts = null;
	    boolean find = false;
	    for (int i=0;i<accounts.size()&&!find==false;i++){
			UserAccount account = accounts.get(i);
			if (account.getUserName().equals(userName)){
				searchAccounts = accounts.get(i);
				find = true;
			}
		}
			return searchAccounts;
	}
	@FXML
	void addAccount(String userName, String password, String profilePhoto, boolean gender, boolean career, String birthday, boolean browser){
		boolean addAccount = false;
		UserAccount account = searchAccounts(userName);
		if(account!=null){
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Error creating account. ");
			alert.setContentText("The account already exists.");
			alert.showAndWait();
		}
		else{	
			account = new UserAccount (userName, password, profilePhoto, gender, career, birthday, browser);
			accounts.add(account);
			addAccount = true;
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Information");
			alert.setHeaderText(null);
			alert.setContentText("The new account was successfully registered.");
			alert.showAndWait();
		}
	}
	
}